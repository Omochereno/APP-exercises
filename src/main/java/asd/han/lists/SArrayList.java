package asd.han.lists;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class SArrayList<T> implements Collection<T>, Iterable<T> {

    private Object[] data;

    private int length = 0;

    public SArrayList(int length) {
        this.data = new Object[length];
    }

    public SArrayList() {
        this(0);
    }

    public SArrayList(T... data) {
        this.data = data;
        this.length = data.length;
    }

    public int size() {
        return data.length;
    }

    @Override
    public boolean add(T t) {
        if(data.length == length)
            increaseSize();
        data[length] = t;
        length++;
        return true;
    }

    public T get(int index){
        if(index < 0 || index > length - 1)
            throw new IndexOutOfBoundsException();
        return (T) data[index];
    }

    public void set(int index, T value){
        if(index < 0 || index > length-1)
            throw new IndexOutOfBoundsException();
        data[index] = value;
    }

    public boolean isEmpty() {
        return data.length > 0 ? false : true;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public Object[] toArray() {
        return Arrays.copyOfRange(data, 0, length);
    }

    public <T1> T1[] toArray(T1[] a) {
        if(a == null || a.length != this.size())
            throw new IllegalArgumentException();
        for (int i = 0; i < length; i++)
            a[i] = (T1) data[i];
        return a;
    }


    private void increaseSize() {
        Object[] old = data;
        data = new Object[length * 2 + 1];
        System.arraycopy(old, 0, data,0, old.length);
    }

    @Override
    public String toString() {
        return "SArrayList{" +
                "data=" + Arrays.toString(data) +
                ", length=" + length +
                '}';
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }
}
