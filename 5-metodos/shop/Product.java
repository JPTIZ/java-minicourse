/**
 * Oferece uma API para lidar com produtos.
 *
 * Uma API (Application Program Interface), a grosso modo, nada mais é do que
 * um conjunto de funções/procedimentos/tipos que um determinado código oferece
 * para ser utilizado em outros códigos.
 *
 * No caso de uma classe Java, a API de um tipo seriam seus elementos públicos.
 *
 * Quando for estabelecer sua API, é importante que se foque em criar uma
 * **Interface** boa de se trabalhar. Uma interface é meramente quais **métodos
 * da API** podem ser chamados pelos outros componentes do programa. Abaixo há
 * algumas vantagens de se fazer isso.
 */
public class Product {
    /**
     * Constrói um produto dado um nome e um preço.
     *
     * Perceba que o construtor é também uma função, cujo tipo de retorno é o
     * próprio tipo da classe (neste caso, `Product`).
     */
    public Product(String name, int price) {
        // Só podemos gerar um produto se o nome não for `null` (se não,
        // teremos uma instância naturalmente "defeituosa").
        //
        // No momento, não veremos uma maneira adequada de tratar o caso de um
        // argumento (valor enviado a um parâmetro) ser inválido. Veremos isso
        // quando for tratado a respeito de `Exception`'s. Por enquanto, por
        // simplicidade, apenas jogaremos o nome para uma string vazia.
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
        this.price = price;
    }

    /**
     * Utilizamos uma interface em comum com outras classes para saber o nome
     * de um produto, em vez de acessar diretamente um atributo. Isso nos dá um
     * ganho considerável em termos de manutenção.
     *
     * Se você, em algum momento, decidir que o nome do produto não vai ser
     * mais necessário, e sim que será necessário:
     *
     * - Pegá-lo de alguma fonte externa; Ou ainda...
     * - Que ele venha de algum tipo mais complexo (como veremos no padrão
     *   "composição", em aulas mais adiante);
     * - (Talvez por consequência dos dois itens acima) Ou mesmo o atributo
     *   `name` nem se chame mais `name`;
     *
     * Para adaptar a classe, bastará mudar como `String name()` é implementado
     * internamente.
     *
     * Perceba: o atributo terá mudado, mas `String name()` continuará sendo
     * `String name()`. Assim, todo mundo que chamou `product.name()` não
     * precisará mudar seu código, afinal o que mudou foi uma implementação
     * interna, e não uma mudança na API da classe.
     */
    public String name() {
        return name;
    }

    public int price() {
        return price;
    }

    /**
     * Oferecemos um método que permita renomear o produto. Perceba que o
     * método não denuncia o uso de um atributo "name" (assim fazendo com que
     * programadores não tentem focar em "como implementamos o nome", e sim em
     * "o que eu posso fazer com meu produto?").
     */
    public void rename(String name) {
        // De nada adianta limitarmos no construtor para que não se possa
        // instanciar um produto com nome `null` se o método para alterá-lo
        // permitir.
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
    }

    /**
     * Sendo assim, não é nem um pouco interessante que outros programadores
     * façam seus códigos dependendo dos atributos especificamente. Assim,
     * limitamos o acesso aos atributos para apenas a própria classe `Product`
     * ter acesso a eles, o que é feito mudando-os de `public` para `private`.
     */
    private String name;
    private int price;
}

/**
 * OBS: Em Java, o padrão é que os métodos que servem para *ler* valores tenham
 * o prefixo `get` e os que servem para alterar valores tenham o prefixo `set`.
 * Isso não é comum em outras linguagens e muitas vezes se mostra
 * desnecessário. Assim sendo, este exemplo opta por nomenclaturas mais
 * simples, diretas e comuns a códigos mais modernos. Algumas classes da
 * própria biblioteca padrão de Java começaram a abandonar o padrão `get`/`set`
 * (por exemplo: ArrayList).
 */
