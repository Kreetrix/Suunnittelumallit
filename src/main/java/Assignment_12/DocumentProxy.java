package Assignment_12;

import java.nio.file.AccessDeniedException;

public class DocumentProxy implements DocumentInterface {
    private Document realDocument;
    private AccessControlService acs;

    public DocumentProxy(Document realDocument) {
        this.realDocument = realDocument;
        this.acs = AccessControlService.getInstance();
    }

    @Override
    public String getId() {
        return realDocument.id;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (acs.isAllowed(realDocument.getAccessLevel(), user)) {
            String retrievedContent = realDocument.getContent(user);
            return retrievedContent;
        } else {
            throw new AccessDeniedException("Access denied for user " + user.getName());
        }
    }

    @Override
    public String getCreationDate() {
        return realDocument.creationDate;
    }

    @Override
    public int getAccessLevel() {
        return realDocument.accessLevel;
    }

}
