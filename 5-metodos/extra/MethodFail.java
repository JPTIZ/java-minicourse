/**
 * Este exemplo serve para mostrar um pouco sobre passagem de argumentos por
 * referência e por valor.
 *
 * Tente executar o código, cheque o texto que aparece no console e tente
 * entender as explicações.
 */
public class MethodFail {
    /**
     * Tipo aleatório apenas para testes.
     * O objetivo é verificar quando o membro `x` é alterado.
     */
    public static class MyType {
        public int x;
    }

    /**
     * Tenta alterar `foo` para uma nova instância de `MyType`.
     * Perceba que o endereço printado é diferente nos dois `foo` aqui, mas o
     * `foo` de `main` continua o mesmo.
     *
     * Isso se dá porque em `Java` toda variável que deveria guardar um objeto
     * na verdade guarda qual endereço de memória ela referencia. Assim,
     * recebemos por parâmetro um endereço de memória e *copiamos* o endereço
     * (não o objeto!) para `foo`. Quando é feito `foo = new MyType();`, apenas
     * estamos alterando para quem o parâmetro `foo` aponta, mas o `foo` de
     * quem chamou o método `change` continua intacto.
     */
    public static void change(MyType foo) {
        System.out.println("Foo (Change - antes): " + foo);
        foo = new MyType();
        System.out.println("Foo (Change - depois): " + foo);
    }

    /**
     * Tenta elevar o `value` passado ao cubo.
     * Perceba, porém, que ele é apenas alterado aqui. Isso acontece porque
     * tipos primitivos são copiados quando passados por parâmetro. Assim, o
     * `value` que trabalhamos aqui não é o mesmo `value` passado por parâmetr
     * por que mchamou `cubic`.
     */
    public static void cubic(int value) {
        value = value * value * value;
    }

    /**
     * Chama alguma das funções anteriores passando variáveis como parâmetro, a
     * fim de checar o que acontece com elas.
     */
    public static void main(String[] args) {
        MyType foo = new MyType();

        System.out.println("Foo (Main): " + foo);

        foo.x = 10;
        change(foo);

        System.out.println("Foo (Main - após change): " + foo);

        int value = 10;
        System.out.println("Value (Main - antes de cubic): " + value);

        cubic(value);

        System.out.println("Value (Main - após cubic): " + value);
    }
}
