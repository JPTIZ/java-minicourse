
public class LinkedStack {
	public void push(int value) {
		contents.insert(value, 0);
	}
	
	public void pop() {
		contents.remove(0);
	}
	
	public int size() {
		return contents.size();
	}
	
	private LinkedList contents = new LinkedList<>();
}
