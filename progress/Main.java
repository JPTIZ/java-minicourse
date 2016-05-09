public class Main {
    public static void main(String[] args) {
        String[] products = { "Pão", "Leite", "Suco", "Pizza" };
        double[] costs = { 0.5, 2.6, 4.0, 7.99 };
        int[] quantities = { 4, 2, 0, 3 };

        // O total gasto na compra
        double total = 0.0;

        for (int i = 0; i < products.length; i++) {
            double totalProduct = costs[i] * quantities[i];
            System.out.println(
                        "Total gasto com " + products[i] + ": R$" + totalProduct
                    );
            total += totalProduct;
        }

        System.out.println("Total da compra: R$" + total);
    }
}
