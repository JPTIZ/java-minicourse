
public class Tests {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10000000; i++) {
			list.add(i);
		}
		printList(list);
	}
	
	public static void printList(ArrayList list) {
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.at(i) + ", ");
		}
		System.out.println("]");
	}
}
