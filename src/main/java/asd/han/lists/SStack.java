package asd.han.lists;

public class SStack<T> {
    private SLinkedList<T> list;

    public SStack() {
        list = new SLinkedList<>();
    }

    public T top(){
        return list.get(0);
    }

    public T pop(){
        return list.removeFirst();
    }

    public void push(T object){
        list.addFirst(object);
    }

    public int getSize(){
        return list.getLength();
    }

    @Override
    public String toString() {
        return "SStack{" +
                list.dataToString()+
                '}';
    }
}
