package Assignment_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiAccessFacade {

    private static final int CONNECT_TIMEOUT = 5000;
    private static final int READ_TIMEOUT = 5000;

    public String getAttributeValueFromJson(String urlString, String attributeName)
            throws IllegalArgumentException, IOException {

        if (urlString == null || urlString.trim().isEmpty()) {
            throw new IOException("URL cannot be null or empty");
        }
        if (attributeName == null || attributeName.trim().isEmpty()) {
            throw new IllegalArgumentException("Attribute name cannot be null or empty");
        }

        String jsonResponse = sendHttpGetRequest(urlString);

        String attributeValue = extractAttributeFromJson(jsonResponse, attributeName);

        return attributeValue;
    }

    private String sendHttpGetRequest(String urlString) throws IOException {
        HttpURLConnection connection = null;

        try {
            URL url = new URL(urlString);

            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(CONNECT_TIMEOUT);
            connection.setReadTimeout(READ_TIMEOUT);

            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new IOException("HTTP request failed with response code: " + responseCode);
            }

            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line);
                }
            }

            return content.toString();

        } catch (MalformedURLException e) {
            throw new IOException("Invalid URL: " + urlString, e);
        } catch (IOException e) {
            throw new IOException("Failed to connect to: " + urlString + ". " + e.getMessage(), e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    private String extractAttributeFromJson(String json, String attributeName)
            throws IllegalArgumentException, IOException {

        try {
            JSONParser parser = new JSONParser();
            Object parsedObject = parser.parse(json);

            if (!(parsedObject instanceof JSONObject)) {
                throw new IOException("Response is not a valid JSON object!!");
            }

            JSONObject jsonObject = (JSONObject) parsedObject;

            if (!jsonObject.containsKey(attributeName)) {
                throw new IllegalArgumentException("Attribute -> " + attributeName);
            }

            Object value = jsonObject.get(attributeName);

            return value != null ? value.toString() : null;

        } catch (ParseException e) {
            throw new IOException("Failed to parse JSON response: " + e.getMessage(), e);
        }
    }
}
