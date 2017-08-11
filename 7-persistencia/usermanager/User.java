package usermanager;

public class User implements java.io.Serializable {
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public void rename(String name) {
        this.name = name;
    }

    private int id;
    private String name;
}
