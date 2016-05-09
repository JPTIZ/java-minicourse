public class MethodFail {

    public static class Bla {
        public int x;
    }

    public static void main(String[] args) {
        Bla bla = new Bla();

        System.out.println(bla);

        bla.x = 10;
        change(bla);

        System.out.println(bla);
    }

    public static void change(Bla bla) {
        System.out.println(bla);
        bla = new Bla();
        System.out.println(bla);
    }

    public static void cubic(int value) {
        value = value * value * value;
    }
}
