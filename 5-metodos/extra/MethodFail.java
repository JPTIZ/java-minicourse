public class MethodFail {

    public static class MyType {
        public int x;
    }

    public static void main(String[] args) {
        MyType foo = new MyType();

        System.out.println(foo);

        foo.x = 10;
        change(foo);

        System.out.println(foo);
    }

    public static void change(MyType foo) {
        System.out.println(foo);
        foo = new MyType();
        System.out.println(foo);
    }

    public static void cubic(int value) {
        value = value * value * value;
    }
}
