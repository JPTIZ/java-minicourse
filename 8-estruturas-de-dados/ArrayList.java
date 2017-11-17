public class ArrayList<T> implements List<T> {
    public void add(T value) {
        if (size == data.length) {
            @SuppressWarnings("unchecked")
            T[] newData = (T[])new Object[data.length * 2];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = value;
        ++size;
    }

    public void remove(int index) {
        // TODO
    }

    public T at(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private T[] data = (T[])new Object[4];
    private int size = 0;
}
