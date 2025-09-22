package Assignment_12;

import java.util.HashMap;

public class Library {
    public HashMap<String, DocumentInterface> documents = new HashMap<String, DocumentInterface>();

    public void addUnprotectedDocument(String id, String content) {
        documents.put(id, new Document(id, content, 0));
    }

    public void addProtectedDocument(String id, String content, int accessLevel) {
        Document realDoc = new Document(id, content, accessLevel);
        DocumentProxy proxy = new DocumentProxy(realDoc);

        documents.put(id, proxy);
    }

    public DocumentInterface getDocument(String id) {
        return documents.get(id);
    }
}
