import java.util.ArrayList;
import java.util.Scanner;

public class SaleView {
    public int showOptions() {
        System.out.print(
                "Selecione uma opção: \n" +
                "1 - Adicionar produto\n" +
                "2 - Remover produto\n" +
                "3 - Finalizar venda\n" +
                "4 - Cancelar venda\n" +
                "Resposta: "
            );

        return reader.nextInt();
    }

    public int askProduct() {
        System.out.println("Código do produto: ");
        return reader.nextInt();
    }

    public void listProducts(ArrayList<Product> products) {
        System.out.println("Cód. | Nome");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.printf(
                    " %3d | %s \n",
                    i,
                    product.getName());
        }
    }

    public int askAmount() {
        System.out.print("Quantidade: ");
        return reader.nextInt();
    }

    public void showWarning(String message) {
        System.out.println("Erro: " + message);
    }

    private Scanner reader = new Scanner(System.in);
}
