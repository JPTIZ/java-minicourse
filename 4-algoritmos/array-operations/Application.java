public class Application {
    public static void main(String... args) {
        var data = new int[1000000];

        for (var i = 0; i < data.length; i++) {
            data[i] = 2*i;
        }

        var last = data[data.length - 1];

        System.out.println("--------------------\n" +
                           "| Linear: \n" +
                           "--------------------");
        System.out.printf("0 is at %d\n", ArrayUtils.linearSearch(data, 0));
        System.out.printf("1 is at %d\n", ArrayUtils.linearSearch(data, 1));
        System.out.printf("2 is at %d\n", ArrayUtils.linearSearch(data, 2));
        System.out.printf("999999 is at %d\n", ArrayUtils.linearSearch(data, 999999));
        System.out.printf("1000000 is at %d\n", ArrayUtils.linearSearch(data, 1000000));
        System.out.printf("%d is at %d\n", last, ArrayUtils.linearSearch(data, last));

        System.out.println("--------------------\n" +
                           "| Binary: \n" +
                           "--------------------");
        System.out.printf("0 is at %d\n", ArrayUtils.binarySearch(data, 0));
        System.out.printf("1 is at %d\n", ArrayUtils.binarySearch(data, 1));
        System.out.printf("2 is at %d\n", ArrayUtils.binarySearch(data, 2));
        System.out.printf("999999 is at %d\n", ArrayUtils.binarySearch(data, 999999));
        System.out.printf("1000000 is at %d\n", ArrayUtils.binarySearch(data, 1000000));
        System.out.printf("%d is at %d\n", last, ArrayUtils.binarySearch(data, last));

        System.out.println("--------------------\n" +
                           "| Timing: \n" +
                           "--------------------");
        System.out.print("Linear: ");
        var begin = System.nanoTime();
        ArrayUtils.linearSearch(data, last);
        var end = System.nanoTime();

        System.out.printf("%dms\n", (end - begin) / 1000);

        System.out.print("Binary: ");
        begin = System.nanoTime();
        ArrayUtils.binarySearch(data, last);
        end = System.nanoTime();

        System.out.printf("%dms\n", (end - begin) / 1000);
    }
}
