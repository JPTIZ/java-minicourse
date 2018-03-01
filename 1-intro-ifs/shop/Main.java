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
        var breadPrice = 0.5;
        var milkPrice = 2.6;
        var juicePrice = 4.0;
        var pizzaPrice = 7.99;

        // Aqui ficam as quantidades que o cliente comprou de cada produto
        var breadAmount = 4;
        var milkAmount = 2;
        var juiceAmount = 0;
        var pizzaAmount = 3;

        // O total gasto na compra
        var total = 0.0;

        // Verificamos se foi comprado pão (ou seja, se a quantidade de pães
        // comprados é maior do que zero.
        if (breadAmount > 0) {
            // Se foi comprado pão, calculamos o quanto foi gasto com eles
            // (preço * quantidade)
            var totalBread = breadPrice * breadAmount;
            // Exibimos (para o cliente ter os dados detalhados)
            System.out.println("Total gasto com pães: R$" + totalBread);
            // Somamos o gasto com pães ao resto da compra
            total += totalBread;
        }

        // O mesmo é feito para o leite, suco e pizza
        if (milkAmount > 0) {
            var totalMilk = milkPrice * milkAmount;
            System.out.println("Total gasto com leite: R$" + totalMilk);
            total += totalMilk;
        }
        if (juiceAmount > 0) {
            var totalJuice = juicePrice * juiceAmount;
            System.out.println("Total gasto com suco: R$" + totalJuice);
            total += totalJuice;
        }
        if (pizzaAmount > 0) {
            var totalPizza = pizzaPrice * pizzaAmount;
            System.out.println("Total gasto com pizzas: R$" + totalPizza);
            total += totalPizza;
        }

        // Ao fim, o valor da compra já estará calculado, bastando apenas
        // exibi-lo
        System.out.println("Total da compra: R$" + total);
    }
}
