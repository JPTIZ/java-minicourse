public class LinkedStack<T> {
    public void push(T value) {
        contents.insert(value, 0);
    }

    public void pop() {
        contents.remove(0);
    }

    public int size() {
        return contents.size();
    }

    private LinkedList<T> contents = new LinkedList<>();
}
