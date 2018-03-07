package asd.han.sorting.generic;

public interface ISortable {
    <T extends Comparable<T>> void sort(T[] unsortedArray);
}
