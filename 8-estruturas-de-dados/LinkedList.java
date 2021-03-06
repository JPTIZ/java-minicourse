public class LinkedList<T> implements List<T> {
    public void add(T value) {
        insert(value, size);
    }

    public void insert(T value, int index) {
        if (empty()) {
            head = new Node(value);
        } else if (index == 0) {
            head = new Node(value, head);
        } else {
            var it = head;
            for (var i = 0; i < index - 1; i++) {
                it = it.next;
            }
            it.next = new Node(value);
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException(index + " < 0");
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException(index + " >= " + size);
        }

        if (index == 0) {
            head = head.next;
        } else {
            var it = head;
            for (var i = 0; i < index - 1; i++) {
                it = it.next;
            }
            it.next = it.next.next;
        }
        size--;
    }

    public T at(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException(index + " < 0");
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException(index + " >= " + size);
        }

        var it = head;
        for (var i = 0; i < index; i++) {
            it = it.next;
        }
        return it.value;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        var size == 0;
    }

    private class Node {
        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        T value;
        var next = null;
    }

    private var head = null;
    private var size = 0;
}
