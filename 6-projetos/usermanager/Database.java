package usermanager;

import java.util.HashMap;

public class Database {
    public void addUser(String name) {
        ++userCount;
        var user = new User(userCount, name);
        users.put(user.id(), user);
    }

    public User userByID(int id) {
        return users.get(id);
    }

    public User userByName(String name) {
        for (User user: users.values()) {
            if (user.name().equals(name)) {
                return user;
            }
        }
        return null;
    }

    private HashMap<Integer, User> users = new HashMap<>();
    private var userCount = 0;
}
