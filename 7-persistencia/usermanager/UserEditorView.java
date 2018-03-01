package usermanager;

import java.util.Scanner;

public class UserEditorView {
    public enum MenuOption {
        INSERT,
        EDIT,
        EXIT,
    }

    public UserEditorView(Database database) {
        this.database = database;
    }

    public void show(String message) {
        System.out.println(message);
    }

    public void showWarning(String message) {
        System.out.println("Aviso! " + message);
    }

    public void showError(String message) {
        System.out.println("Erro! " + message);
    }

    public MenuOption askMenuOption() {
        System.out.print("Escolha uma opção:\n" +
                "1. Adicionar usuário\n" +
                "2. Editar usuário\n" +
                "3. Sair\n" +
                "Resposta: ");
        var option = reader.nextInt();
        switch (option) {
            case 1: return MenuOption.INSERT;
            case 2: return MenuOption.EDIT;
            case 3: return MenuOption.EXIT;
            default: return null;
        }
    }

    public String askUserName() {
        System.out.print("Insira o nome do usuário: ");
        return reader.next();
    }

    public User searchUser() {
        int searchType;
        while (true) {
            System.out.print("Procurar usuário por:\n" +
                    "1. ID\n" +
                    "2. Nome\n" +
                    "Resposta: ");
            searchType = reader.nextInt();
            switch (searchType) {
                case 1: return searchUserByID();
                case 2: return searchUserByName();
                default:
                    showError("Resposta inválida.");
            }
        }
    }

    public User searchUserByID() {
        System.out.print("ID do usuário: ");
        return database.userByID(reader.nextInt());
    }

    public User searchUserByName() {
        System.out.print("Nome do usuário: ");
        return database.userByName(reader.next());
    }

    private var reader = new Scanner(System.in);
    private Database database;
}
