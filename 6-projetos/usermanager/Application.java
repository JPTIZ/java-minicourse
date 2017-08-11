package usermanager;

public class Application {
    public static void main(String... args) {
        new UserEditorController(new Database()).start();
    }
}
