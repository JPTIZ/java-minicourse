//=============================================================================
// Aula 02 - Vetores, Matrizes e Laços de repetição
//-----------------------------------------------------------------------------
// Problemática:
// Criar um algoritmo que calcule e mostre a soma de todos os elementos menores
// que 10 de uma matriz.
//=============================================================================


public class Main {
    public static void main(String[] args) {
        // Primeiramente instanciamos a matriz.
        // Vale lembrar que uma matriz nada mais é do que um vetor de vetores.
        // Assim, cada linha da matriz é na verdade um dos elementos do vetor
        // "matrix", que por sua vez é um vetor de inteiros.
        int[][] matrix = {
            {  4, 10,  3 },
            { 24, 94, -4 },
            {  7, 12,  6 }
        };

        // Será necessário um acumulador, que será incrementado com o valor
        // de cada elemento menor que 10 da matriz
        var sum = 0;

        // Tendo reservadas as variáveis necessárias, agora basta percorrer
        // cada linha da matriz.
        //
        // OBS: O `for` utilizado é um `for-each`, um tipo de laço que percorre
        // o conjunto inteiro, e cada valor dele é representado pelo que há
        // à direita dos dois pontos (":"). Ele será utilizado no lugar de um
        // `for` comum por conta de que:
        //
        //  1. O índice de cada linha/valor não é importante, apenas o valor
        //     em si.
        //  2. É necessário percorrer toda a matriz, sem deixar um valor sequer
        //     para trás.
        //
        for (int[] line: matrix) {
            // E, para cada valor em uma linha...
            for (int value: line) {
                // Verificar se ele é menor do que 10.
                // Se for, ele é contado no acumulador `sum`,
                // do contrário apenas é ignorado.
                if (value < 10) {
                    sum += value;
                }
            }
        }

        // Após a matriz ter sido completamente verificada, basta exibir a soma
        System.out.println(sum);
    }
}
