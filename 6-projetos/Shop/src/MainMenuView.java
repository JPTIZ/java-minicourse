import java.util.ArrayList;
import java.util.Scanner;

public class MainMenuView {

    public int showOptions() {
        System.out.print(
                "Selecione uma opção:\n" +
                "1 - Cadastrar produto\n" +
                "2 - Iniciar venda\n" +
                "3 - Listar produtos\n" +
                "4 - Ver relatório\n" +
                "5 - Sair\n" +
                "Resposta:"
        );
        return reader.nextInt();
    }

    public String askProductName() {
        System.out.print("Nome do produto: ");
        return reader.next();
    }

    public int askProductPrice() {
        System.out.print("Preço do produto: ");
        return reader.nextInt();
    }

    public void listProducts(ArrayList<Product> products) {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }

    public void showWarning(String message) {
        System.out.println(message);
    }

    private Scanner reader = new Scanner(System.in);
}
