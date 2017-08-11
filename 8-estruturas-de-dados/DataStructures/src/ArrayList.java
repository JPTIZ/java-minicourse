
public class ArrayList<T> {
	public void add(T value) {
		if (size == data.length) {
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
		
	}
	
	public T at(int index) {
		return data[index];
	}
	
	public int size() {
		return size;
	}
	
	private T[] data = (T[])new Object[4];
	private int size = 0;
}
