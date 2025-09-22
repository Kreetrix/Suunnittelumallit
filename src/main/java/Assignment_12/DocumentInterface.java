package Assignment_12;

import java.nio.file.AccessDeniedException;

public interface DocumentInterface {
    String getId();

    String getContent(User user) throws AccessDeniedException;

    String getCreationDate();

    int getAccessLevel();
}
