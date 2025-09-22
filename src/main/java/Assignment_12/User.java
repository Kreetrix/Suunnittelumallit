package Assignment_12;

public class User {
    public String name;
    public int accessLevel;

    public User(String name, int accessLevel) {
        this.name = name;
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }

    public int getAccessLevel() {
        return accessLevel;
    }
}
