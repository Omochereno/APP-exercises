package asd.Sorting.Generic;

public abstract class Sorter {

    public abstract <T extends Comparable<T>> void sort(T[] unsortedArray);
}
