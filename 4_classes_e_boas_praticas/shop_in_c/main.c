#include <stdio.h> // Importa a função "printf" (além de outras) para este arquivo
#include <stdlib.h> // Importa a função "calloc" (além de outras) para este arquivo

typedef struct {
    char* name;
    int price;
} Product;

int main(void) {
    Product bread = *(Product*)calloc(1, sizeof(Product));

    bread.name = "Pão";
    bread.price = 5;

    printf("Bread name: %s", bread.name);
    printf("Bread cost: %d", bread.price);

    printf("Hello, world!");
}
