package asd.Sorting.Generic;

public class InsertionSort extends Sorter {

    /*Function to sort array using insertion sort*/
    public <T extends Comparable<T>> void sort(T[] arr)
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            T key = arr[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && key.compareTo(arr[j]) < 0)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
