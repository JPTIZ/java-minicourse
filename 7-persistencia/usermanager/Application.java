package usermanager;

public class Application {
    public static void main(String... args) throws Exception {
        new UserEditorController(Database.fromFile("database.bin")).start();
    }
}
