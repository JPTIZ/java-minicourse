//=============================================================================
// Aula 01 - Variáveis e estruturas condicionais
//-----------------------------------------------------------------------------
// Problemática:
// Seguir o fluxograma descrito no slide 21.
//=============================================================================
public class Main {

    // Método main().
    // Todo programa em Java começa a partir deste método, sem excessões.
    // Quando este método não existe um erro aparece avisando que não foi
    // possível encontrá-lo.
    // Por ora é necessário apenas decorá-lo, sem se importar com o significado
    // de cada palavra.
    // Mas caso esteja na curiosidade:
    //  - public: Indica que este método é visível para qualquer outra classe;
    //  - static: Indica que o método é da classe em si, e não dos objetos dela;
    //  - void:   Indica que o método não retorna valores (i.e. é um
    //            procedimento)
    //  - String[]: Um conjunto de Textos
    public static void main(String[] args) {
        // Para exibir textos em um Console há o método
        // System.out.println("texto")
        System.out.println("Hello, World!");

        // Declaração das variáveis
        // Declarar uma variável significa apenas dizer que ela existe neste
        // contexto.
        // Em Java uma variável pode ser declarada em qualquer ponto dentro de
        // um método. Para tipos primitivos numéricos (int, double, float,
        // byte...), quando um valor não é dado de início, a variável é
        // inicializada com 0.
        int x;
        int y;
        int z;

        // Atribuindo valores para as variáveis x e y:
        x = 5;
        y = 3;
        // Note que isto poderia ser feito logo quando as variáveis foram
        // declaradas, da forma:
        //
        // var x = 5;
        // var y = 3;
        //
        // Experimente trocar as linhas acima para ver que o efeito é o mesmo.

        // Somando os valores armazenados nas variáveis x e y, armazenando o
        // resultado em z logo em seguida.
        z = x + y;

        // Iniciando uma estrutura condicional
        // A comparação proposta é se 0 < z < 4.
        // Porém as linguagens de programação não permitem as duas comparações
        // de uma vez só (i.e. não é possível escrever "if (0 < z < 4)"),
        // portanto, é preciso fazer as comparações uma a uma.
        // Partindo de álgebra booleana, queremos saber se z é, ao mesmo tempo,
        // maior que 0 e menor que 4, ou seja, as duas condições precisam ser
        // verdadeiras. Em álgebra booleana iríamos escrever:
        //   (z > 0) ^ (z < 4)
        // Em Java, assim como na maioria das linguagens de programação, o
        // operador "E" como &&. Ou seja, a forma correta é:
        if (z > 0 && z < 4) {
            System.out.println("z está entre 0 e 4");
        }
        // Nota: em contrapartida, se a comparação fosse com o operador "OU", em
        // álgebra booleana:
        //   (z > 0) v (z < 4)
        // Em Java utiliza-se o caractere "pipe" ("|"):
        //   (z > 0) || (z < 4)

        // A próxima condição é verificar se z > y, que continua simples.
        // No caso em questão, caso z <= y, outro conjunto de ações será feito.
        // Ou seja, é preciso descrever o que acontece quando a comparação z > y
        // é falsa. Para tal utiliza-se o "else".
        if (z > y) {
            System.out.println("z é maior do que y");
        } else {
            System.out.println("z é menor do que y");
        }
    }
}
