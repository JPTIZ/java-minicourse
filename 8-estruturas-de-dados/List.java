public interface List<T> {
    public void add(T data);
    public T at(int index);
    public int size();

    public default boolean empty() {
        return size() == 0;
    }
}
