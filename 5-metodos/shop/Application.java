/**
 * Este exemplo ilustra o uso de métodos para simplicicação e melhoria da
 * manutenibilidade de nossos códigos, utilizando de base o código da loja.
 *
 * Comece pelo arquivo `Product.java`, leia as explicações de lá, e em seguida
 * volte para este arquivo.
 *
 * Em resumo, com métodos conseguimos:
 *
 *   1. Evitar problemas de duplicação de código/
 *   2. Não atar a implementação de outras classes à implementações internas de
 *      nossas classes.
 *   3. Fornecer formas padronizadas de comunicação entre objetos, o que
 *      refletirá mais a frente quando vermos `interface`'s.
 */
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /**
         * Sem muito mistério, criamos 4 produtos em nossa loja, cada um com
         * seu nome e preço.
         */
        var products = {
                new Product("Pão", 50),
                new Product("Leite", 280),
                new Product("Suco", 400),
                new Product("Pizza", 899),
        };

        /**
         * "Quantidade" (a comprada, não a em estoque) não é uma característica
         * de um produto, e portanto controlamos ela separadamente. O ideal é
         * ter uma classe especializada em representar um item do carrinho de
         * compras (referenciando um produto e a quantidade comprada dele), mas
         * manteremos a simplicidade por enquanto.
         */
        var amounts = new int[products.length];

        // Instanciamos um leitor de entrada do usuário
        var reader = new Scanner(System.in);

        for (var i = 0; i < products.length; i++) {
            /**
             * Perceba que, para saber o nome de um produto, não acessamos seu
             * atributo diretamente, e sim fazemos uma chamada de função que
             * terá o único objetivo de nos informar o nome do produto. Assim,
             * se a implementação interna de `Product` mudar, este código não
             * precisará sofrer alterações, afinal, temos uma interface em
             * comum que são os métodos, e a assinatura e retorno deles não
             * variam tanto quanto atributos.
             */
            System.out.printf("Digite a quantidade de %s",
                              products[i].name());

            /**
             * Inclusive, note: você chega a se preocupar com que atributos são
             * utilizados para implementar `nextInt()`? Não, e por que? Porque
             * efetivamente não importa! Você só precisa saber que é possível
             * ler o próximo número inteiro digitado pelo usuário, mas pouco
             * importa que atributos há em `Scanner` para isso. Por isso: foque
             * em fazer uma boa API! Quando for criar seu próprio tipo, pense:
             * "Que operações meu tipo pode oferecer?". *Depois* de terminar a
             * API, aí sim, pense: "O que eu posso utilizar para implementar
             * cada um desses métodos?", e naturalmente surgirão os atributos.
             */
            amounts[i] = reader.nextInt();
        }

        var total = 0;
        for (var i = 0; i < products.length; i++) {
            var price = amounts[i] * products[i].price();
            System.out.printf("Total gasto com %s: R$%d\n",
                              products[i].name(),
                              price);
            total += price;
        }

        System.out.printf("Total da compra: R$%d\n", total);
    }
}
