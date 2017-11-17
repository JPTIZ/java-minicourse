public class Tests {
    public static void main(String[] args) {
        {
            long begin = System.currentTimeMillis();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10000000; i++) {
                list.add(i);
            }
            //printList(list);
            long end = System.currentTimeMillis();
            System.out.println("(ArrayList) Ellapsed: " + (end - begin) + "ms");
        }
        {
            long begin = System.currentTimeMillis();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < 10000000; i++) {
                list.add(i);
            }
            //printList(list);
            long end = System.currentTimeMillis();
            System.out.println("(LinkedList) Ellapsed: " + (end - begin) + "ms");
        }
    }

    public static <T> void printList(List<T> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.at(i) + ", ");
        }
        System.out.println("]");
    }
}
