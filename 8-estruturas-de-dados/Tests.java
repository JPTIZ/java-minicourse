public class Tests {
    public static void main(String[] args) {
        {
            var begin = System.currentTimeMillis();
            ArrayList<Integer> list = new ArrayList<>();
            for (var i = 0; i < 10000000; i++) {
                list.add(i);
            }
            //printList(list);
            var end = System.currentTimeMillis();
            System.out.println("(ArrayList) Ellapsed: " + (end - begin) + "ms");
        }
        {
            var begin = System.currentTimeMillis();
            LinkedList<Integer> list = new LinkedList<>();
            for (var i = 0; i < 10000000; i++) {
                list.add(i);
            }
            //printList(list);
            var end = System.currentTimeMillis();
            System.out.println("(LinkedList) Ellapsed: " + (end - begin) + "ms");
        }
    }

    public static <T> void printList(List<T> list) {
        System.out.print("[");
        for (var i = 0; i < list.size(); i++) {
            System.out.print(list.at(i) + ", ");
        }
        System.out.println("]");
    }
}
