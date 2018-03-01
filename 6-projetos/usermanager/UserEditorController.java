package usermanager;

import static usermanager.UserEditorView.MenuOption;

public class UserEditorController {
    public UserEditorController(Database database) {
        this.database = database;
        this.view = new UserEditorView(database);
    }

    public void start() {
        var option = MenuOption.INSERT;
        while (option != MenuOption.EXIT) {
            option = view.askMenuOption();
            switch (option) {
                case INSERT:
                    insertUser();
                    break;
                case EDIT:
                    editUser();
                    break;
                case EXIT:
                    exit();
                    break;
            }
        }
    }

    public void insertUser() {
        view.show("Cadastrando usuário...");
        while (true) {
            var name = view.askUserName();
            if (name.trim().isEmpty()) {
                view.showError("O nome não pode ser vazio.");
            } else {
                database.addUser(name);
                view.show("Usuário cadastrado com sucesso.");
                return;
            }
        }
    }

    public void editUser() {
        User user;
        while (true) {
            user = view.searchUser();
            if (user != null) {
                break;
            }
            System.out.println("Usuário não encontrado.");
        }

        view.show("Editando usuário " + user.name());
        while (true) {
            var name = view.askUserName();
            if (name.trim().isEmpty()) {
                view.showError("O nome não pode ser vazio.");
            } else {
                user.rename(name);
                view.show("Usuário editado com sucesso.");
                return;
            }
        }
    }

    public void exit() {
        System.out.println("Até mais :)");
        return;
    }

    private UserEditorView view;
    private Database database;
}
