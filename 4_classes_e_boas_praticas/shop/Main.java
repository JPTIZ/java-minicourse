//=============================================================================
// Aula 04 - Classes e boas práticas
//-----------------------------------------------------------------------------
// Problemática:
// Atualizar o código da última aula, utilizando classes para remodular o
// programa.
//=============================================================================

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Pão", 0.5, 4),
            new Product("Leite", 2.6, 2),
            new Product("Suco", 4.0, 0),
            new Product("Pizza", 7.99, 3),
        };

        double total = 0.0;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            double totalProduct = product.getQuantity() * product.getPrice();
            System.out.println(
                        "Total gasto com " + product.getName() + ": R$" + totalProduct
                    );
            total += totalProduct;
        }

        System.out.println("Total da compra: R$" + total);
    }
}
