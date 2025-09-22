package Assignment_12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Document implements DocumentInterface {
    public String id;
    public String creationDate;
    public int accessLevel;
    protected String content;

    public Document(String id, String content, int accessLevel) {
        this.id = id;
        this.content = content;
        this.accessLevel = accessLevel;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);
        this.creationDate = formattedNow;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getContent(User user) {
        System.out.println("User " + user.getName() + " got content -> " + content);
        return content;
    }

    @Override
    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public int getAccessLevel() {
        return accessLevel;
    }

}
