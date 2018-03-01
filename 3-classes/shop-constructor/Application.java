import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        var products = {
                new Product("Pão", 50),
                new Product("Leite", 280),
                new Product("Suco", 400),
                new Product("Pizza", 899),
        };

        var amounts = new int[4];
        var reader = new Scanner(System.in);

        for (var i = 0; i < products.length; i++) {
            System.out.printf("Digite a quantidade de %s",
                              products[i].name);
            amounts[i] = reader.nextInt();
        }

        var total = 0;
        for (var i = 0; i < products.length; i++) {
            var totalProduct = amounts[i] * products[i].price;
            System.out.printf("Total gasto com %s: R$%d\n",
                              products[i].name,
                              totalProduct);
            total += totalProduct;
        }

        System.out.printf("Total da compra: R$%d\n", total);
    }
}




