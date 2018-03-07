package asd.han.sorting.nonGeneric;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        InsertionSort is = new InsertionSort();
        int[] arrI = {22, 15, 1, 4, 2, 33, 9};
        is.sort(arrI);
        printArray(arrI);

        //MergeSort
        MergeSort mergeSort = new MergeSort();
        int[] arrM = {22, 15, 1, 4, 2, 33, 9};
        mergeSort.sort(arrM, 0, arrM.length-1);
        printArray(arrM);

        int arrQ[] = {10, 7, 8, 9, 1, 5};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arrQ, 0, arrQ.length-1);
        printArray(arrQ);
    }

    /* A utility function to print array of size n*/
     static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
