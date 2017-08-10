//=============================================================================
// Aula 03 - Métodos (Funções e Procedimentos)
//-----------------------------------------------------------------------------
// Problemática:
// Simplificar, usando métodos, um programa que:
//  1. Mostra o conteúdo de 3 vetores;
//  2. Inverte o conteúdo dos vetores (alterando as variáveis);
//  3. Mostra novamente o conteúdo dos vetores (que agora estarão invertidos).
//
// O código original está como "Original.java".
//=============================================================================

public class Main {
    // Para não ficarmos repetindo as operações de mostrar o conteúdo dos
    // vetores (que é a mesma, independente de qual vetor seja), criaremos um
    // método chamado `showArray`.
    // Perceba que ele está marcado como `public` e `static`, assim como o
    // `main`. Por enquanto teremos que ignorar estas palavrinhas por enquanto,
    // mas elas farão mais sentido na próxima aula (nº 4).
    //
    // Mas já fica de reforço:
    //  - Métodos `static` podem chamar SOMENTE métodos estáticos.
    //
    // Métodos são declarados da seguinte forma:
    //
    //   TipoDeRetorno Nome(Parâmetros) {
    //       [...passos a serem executados pelo método...]
    //   }
    //
    // Sendo:
    //
    //   TipoDeRetorno:
    //     Significa qual o tipo de dado que será retornado pelo
    //         método. Um método "somaInt", por exemplo, irá somar
    //         dois `int`s e retornar essa soma. Nesse caso, o tipo
    //         de retorno será `int`. Um método "raizQuadrada",
    //         porém, recebe um número e retorna a raiz quadrada
    //         dele. Como raízes quadradas são números reais, o tipo
    //         de retorno seria um `double` (ou `float`, dependendo
    //         do que o programador decidir).
    //       No nosso caso, não queremos retornar nada, afinal, só
    //         queremos exibir os valores do vetor, e nada mais. Para
    //         esse caso (em que nenhum dado será retornado pelo
    //         método) existe o tipo de retorno `void`, que quer
    //         dizer "vazio", ou seja, nada será retornado.
    //
    //   Nome:
    //     É o nome do método propriamente dito, por exemplo: "println",
    //       "main", e no nosso caso, `showArray` e "invertArray".
    //     OBS: Tente sempre ser o mais intuitivo o possível ao dar nomes
    //       aos métodos. Dar nomes como "x", "aux" e "sV" (na tentativa de
    //       encurtar `showArray`) dificultam a __manutenção__ do código,
    //       principalmente se outras pessoas forem utilizar um método que
    //       você tenha criado. Tente pensar por exemplo se o método
    //       "println" se chamasse "pln": qualquer pessoa que lesse o
    //       código não saberia dizer o que o método faz (nem chutar qual
    //       seria sua utilidade), e a última coisa que ela pensaria é que
    //       o método simplesmente mostra no console o que estiver entre
    //       os parênteses.
    //
    //   Parâmetros:
    //     São opcionais (basta deixar os parênteses vazios).
    //     No caso do método `showArray`, nenhuma linguagem de
    //       programação vai magicamente advinhar qual que é o vetor
    //       que será exibido quando o método for chamado. Ou seja,
    //       precisamos dizer ao método qual é o vetor que será exibido, e para
    //       isso enviamos o vetor nos parênteses do método. Portanto o vetor é
    //       chamado de "parâmetro" do método.
    //     Os parâmetros do método são designados como se fosse uma declaração:
    //       tipo nome
    //     Portanto, se nosso método irá receber um vetor de inteiros,
    //       definimos o parâmetro como:
    //         `int[] array`
    //     Assim, quem quiser utilizar o método `showArray` precisará enviar
    //       um vetor de inteiros dentro dos parênteses.
    //
    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    // No método que inverte os vetores, acontecerá a mesma coisa que para o
    // `showArray`: receberemos um vetor de inteiros, e dentro dele iremos
    // inverter os vetores.
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            // Como iremos alterar array[i], precisamos
            // de uma cópia do valor antigo (para colocar
            // no lado oposto do vetor).
            int swap = array[i];
            // Atribuimos o valor no
            // lado oposto do vetor em array[i].
            array[i] = array[array.length - 1 - i];
            // Atribuimos o antigo valor
            // de array[i] na outra ponta do vetor.
            array[array.length - 1 - i] = swap;
        }
    }

    public static void main(String[] args) {

        // Instanciação de vetores com valores pré-definidos, como visto na
        // aula 2.
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 2, 9, -3, 4 };
        int[] array3 = { 2 };
        int[] array4 = { 17, -4 };

        System.out.println("Vetores (antes):");

        // Assim como fazemos com println(...), aqui estamos invocando o método
        // chamado `showArray`, que recebe, por parâmetro, um vetor (cujo
        // conteúdo será exibido).
        showArray(array1);
        showArray(array2);
        showArray(array3);
        showArray(array4);

        // Agora basta chamar o método que inverte um vetor para cada um dos 4
        // vetores instanciados anteriormente.
        invertArray(array1);
        invertArray(array2);
        invertArray(array3);
        invertArray(array4);

        System.out.println("Vetores (invertidos):");

        // E por fim chamar novamente o método de exibir um vetor.
        showArray(array1);
        showArray(array2);
        showArray(array3);
        showArray(array4);

        // Perceba que desta forma podemos usar `showArray` onde quisermos,
        // sem a necessidade de reescrever todos os passos dele. Essa é uma das
        // vantagens de se utilizar métodos, além de que fica mais organizado:
        // não é preciso ler o que cada `for` está fazendo para saber que se
        // está invertendo um vetor (ou exibindo ele, no caso de `showArray`).
    }
}
