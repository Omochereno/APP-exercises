package asd.han.lists;

import java.util.Objects;

public class SLinkedList<T> {

    private Node<T> header = null;
    private int length = 0;

    public SLinkedList(){
    }

    @SafeVarargs
    public SLinkedList(T... data) {
        for(int i = data.length-1; i >= 0; i--)
            addFirst(data[i]);
    }

    public void addFirst(T value){
        header = new Node<>(value, header);
        length++;
    }

    public T removeFirst(){
        if(header == null)
            throw new IndexOutOfBoundsException();
        T removed = header.element;
        header = header.next;
        length--;
        return removed;
    }

    public void insert(int index, T value){
        if(index == 0) {
            addFirst(value);
            return;
        }

        if(index > length || index < 0)
            throw new IndexOutOfBoundsException();

        int i = 0;
        Node element = header;
        while(i != index-1){
            element = element.next;
            i++;
        }
        element.next = new Node<>(value, element.next);
        length++;
    }

    public void delete(int index){
        if(index == 0) {
            removeFirst();
            return;
        }

        if(index >= length || index < 0)
            throw new IndexOutOfBoundsException();

        int i = 0;
        Node element = header;
        while(i != index-1){
            element = element.next;
            i++;
        }
        if(element.next == null)
            throw new IndexOutOfBoundsException();
        element.next = element.next.next;
        length--;
    }

    public T get(int index){
        int i = 0;
        Node<T> element = header;
        while(i != index){
            if(!element.hasNext())
                throw new IndexOutOfBoundsException();
            element = element.next; //is checked!
            i++;
        }
        return element.element;
    }

    public int getLength(){
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SLinkedList<?> that = (SLinkedList<?>) o;
        return getLength() == that.getLength() &&
                Objects.equals(header, that.header);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, getLength());
    }

    @Override
    public String toString() {
        return "SLinkedList{" +
                "header=" + header +
                ", length=" + length +
                '}';
    }

    public String dataToString(){
        return "data=[" + header;
    }


    /**
     * Node class
     * @param <E>
     */
    static class Node<E> {
        private E element;
        private Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

        public boolean hasNext() {
            return next != null;
        }

        public int length(){
            int c = 0;
            Node element = this;
            while(element.hasNext()){
                element = element.next;
                c++;
            }
            return c;
        }

        @Override
        public String toString() {
            return element + (hasNext() ? (", " + next) : "]");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node))
                return false;

            Node that = (Node) o;

            if (!this.element.equals(that.element))
                return false;

            return next == null ? that.next == null : next.equals(that.next);
        }

        @Override
        public int hashCode() {
            int result = element.hashCode();
            result = 31 * result + (next != null ? next.hashCode() : 0);
            return result;
        }
    }
}
