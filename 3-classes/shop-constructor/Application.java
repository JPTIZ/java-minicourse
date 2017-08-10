import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Pão", 50),
                new Product("Leite", 280),
                new Product("Suco", 400),
                new Product("Pizza", 899),
        };

        int[] amounts = new int[4];
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {
            System.out.printf("Digite a quantidade de %s",
                              products[i].name);
            amounts[i] = reader.nextInt();
        }

        int total = 0;
        for (int i = 0; i < products.length; i++) {
            int totalProduct = amounts[i] * products[i].price;
            System.out.printf("Total gasto com %s: R$%d\n",
                              products[i].name,
                              totalProduct);
            total += totalProduct;
        }

        System.out.printf("Total da compra: R$%d\n", total);
    }
}




