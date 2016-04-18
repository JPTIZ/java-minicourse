//=============================================================================
// Aula 01 - Variáveis e estruturas condicionais
//-----------------------------------------------------------------------------
// Problemática:
// Criar um programa simples que simule uma loja.
//=============================================================================

public class Main {
    public static void main(String[] args) {
        // Para nossa loja, precisamos dos preços de cada produto.
        // Como dinheiro é um número real (com vírgula), utiliza-se o tipo
        // "double" para representar os valores dos preços.
        double breadCost = 0.5;
        double milkCost = 2.6;
        double juiceCost = 4.0;
        double pizzaCost = 7.99;

        // Aqui ficam as quantidades que o cliente comprou de cada produto
        int breadAmount = 4;
        int milkAmount = 2;
        int juiceAmount = 0;
        int pizzaAmount = 3;

        // O total gasto na compra
        double total = 0.0;

        // Verificamos se foi comprado pão (ou seja, se a quantidade de pães
        // comprados é maior do que zero.
        if (breadAmount > 0) {
            // Se foi comprado pão, calculamos o quanto foi gasto com eles
            // (preço * quantidade)
            double totalBread = breadCost * breadAmount;
            // Exibimos (para o cliente ter os dados detalhados)
            System.out.println("Total gasto com pães: R$" + totalBread);
            // Somamos o gasto com pães ao resto da compra
            total += totalBread;
        }
        // O mesmo é feito para o leite, suco e pizza
        if (milkAmount > 0) {
            double totalMilk = milkCost * milkAmount;
            System.out.println("Total gasto com leite: R$" + totalMilk);
            total += totalMilk;
        }
        if (juiceAmount > 0) {
            double totalJuice = juiceCost * juiceAmount;
            System.out.println("Total gasto com suco: R$" + totalJuice);
            total += totalJuice;
        }
        if (pizzaAmount > 0) {
            double totalPizza = pizzaCost * pizzaAmount;
            System.out.println("Total gasto com pizzas: R$" + totalPizza);
            total += totalPizza;
        }

        // Ao fim, o valor da compra já estará calculado, bastando apenas
        // exibi-lo
        System.out.println("Total da compra: R$" + total);
    }
}
