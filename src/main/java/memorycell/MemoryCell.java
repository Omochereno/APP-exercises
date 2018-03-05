package memorycell;

public class MemoryCell<T extends Comparable<T>> implements Comparable<MemoryCell<T>> {

    T data;

    public MemoryCell(T data) {
        this.data = data;
    }

    public T read() {
        return data;
    }

    public void write(T data) {
        this.data = data;
    }

    public int compareTo(MemoryCell<T> o) {
        return data.compareTo(o.read());
    }
}
