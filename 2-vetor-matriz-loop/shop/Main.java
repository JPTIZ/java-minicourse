//=============================================================================
// Aula 02 - Vetores, Matrizes e Laços de repetição
//-----------------------------------------------------------------------------
// Problemática:
// Atualizar o código da última aula, utilizando vetores para manejar os dados
// da compra.
//=============================================================================

public class Main {
    public static void main(String[] args) {
        // Conforme a complexidade do programa aumenta, precisamos de novos
        // recursos para que o código se torne melhor de trabalhar e dar
        // manutenção.
        //
        // Desta forma, armazenaremos cada tipo de dado em vetores diferentes,
        // assim, precisaremos mexer menos no código mesmo adicionando vários
        // outros produtos.
        //
        // Outro detalhe é que agora em vez de vários ifs,
        // [spoilers] utilizaremos um for percorrendo os vetores
        // para contabilizar e mostrar os produtos. Como o código não tem como
        // "advinhar" o nome de cada produto no for, precisaremos de mais um
        // vetor com os nomes.
        //
        // OBS: Se puder, compare cada trecho de código com o da aula anterior,
        // a fim de compreender melhor o que cada mudança significa.
        var products = { "Pão", "Leite", "Suco", "Pizza" };
        var costs = { 0.5, 2.6, 4.0, 7.99 };
        var quantities = { 4, 2, 0, 3 };

        // O total gasto na compra
        var total = 0.0;

        // Agora, como tudo está guardado em vetores, em vez de fazer um `if`
        // para cada um dos produtos da loja, o código pode ser resumido a um
        // for que percorra todos os valores sozinho:
        for (var i = 0; i < products.length; i++) {
            // Calcula o total gasto pelo produto[i]
            var totalProduct = costs[i] * quantities[i];
            // Exibe o total gasto por ele. Note que agora utiliza-se o vetor
            // com os nomes dos produtos para saber o nome de cada produto.
            System.out.printf("Total gasto com %s: R$%.2f\n",
                              products[i], totalProduct);
            // O total gasto com cada produto é somado ao total gasto com a
            // compra
            total += totalProduct;
        }

        // Ao fim, o valor da compra já estará calculado, bastando apenas
        // exibi-lo
        System.out.printf("Total da compra: R$%.2f\n", total);
    }
}
