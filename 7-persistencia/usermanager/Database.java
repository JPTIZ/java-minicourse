package usermanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Database implements Serializable {
    public static final var serialVersionUID = 1L;

    private Database() {}

    public static Database fromFile(String filename)
            throws IOException, ClassNotFoundException
    {
        try {
            var file = new FileInputStream(filename);
            var objectStream = new ObjectInputStream(file);
            var database = (Database)objectStream.readObject();
            objectStream.close();
            file.close();
            return database;
        } catch (FileNotFoundException e) {
            System.out.println(
                    "Arquivo de dados não encontrado." +
                    " Criando nova base de dados.");
        }
        return new Database();
    }

    public void dump() {
        try {
            var file = new FileOutputStream(filename);
            var objectStream = new ObjectOutputStream(file);
            objectStream.writeObject(this);
            objectStream.close();
            file.close();
        } catch (IOException e) {
            System.err.println(
                    "Erro! Não foi possível salvar o banco de dados.");
            e.printStackTrace();
        }
    }

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

    private var filename = "database.bin";
    private HashMap<Integer, User> users = new HashMap<>();
    private var userCount = 0;
}
