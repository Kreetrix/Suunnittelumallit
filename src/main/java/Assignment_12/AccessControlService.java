package Assignment_12;

public class AccessControlService {
    private static AccessControlService instance;

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(int accessLevel, User user) {
        if (user.accessLevel == accessLevel)
            return true;
        return false;
    }

}
