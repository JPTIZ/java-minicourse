// Importa a função "printf" (além de outras) para este arquivo
#include <stdio.h>
// Importa a função "calloc" (além de outras) para este arquivo
#include <stdlib.h>

/**
 * Define um tipo, chamado "Product", que contém um vetor de caracteres
 * (chamado "name") e um inteiro (chamado "price"), representando o nome e o
 * preço do produto (respectivamente).
 */
typedef struct {
    char* name;
    int price;
} Product;

/**
 * Quase equivalente ao "public static void main(String... args)" de Java,
 * porém sem receber parâmetros.
 */
int main(void) {
    /**
     * Aloca memória suficiente para um `Product`. A memória alocada é zerada
     * assim que criada (assim, `name` aponta para um "null" (endereço 0, como
     * visto em sala), e "price" é 0).
     */
    Product* bread = (Product*)calloc(1, sizeof(Product));

    /**
     * Acessa e altera os membros "name" e "price" do produto.
     */
    bread->name = "Pão";
    bread->price = 5;

    /**
     * Exibe os dados do produto.
     *
     * `printf` trabalha de forma equivalente ao `System.out.printf(formatação,
     * elemento1, elemento2...)`.
     */
    printf("Bread name: %s\n", bread->name);
    printf("Bread cost: %d\n", bread->price);

    /**
     * Libera a memória utilizada por ele ao sistema operacional.
     * Se esta operação não for realizada, temos um "vazamento de memória" (ou
     * seja, perdemos referência a algo alocado e não temos mais como
     * desalocá-lo).
     */
    free(bread);
}
