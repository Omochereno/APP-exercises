package asd.han.sorting.generic;

import asd.han.lists.SArrayList;

import java.util.Arrays;

public class Main {
    public static void main( String[] args )
    {
        SArrayList<Integer> test = new SArrayList<>();
        test.add(5);
        test.add(2);
        test.add(5);
        test.add(2);
        test.add(5);
        test.add(2);



        Integer[] numbers = {5, 1, 6, 23, 7, 9, 0};
        String[] words = {"Zorg", "Xenos", "Geven", "Nemen", "Aap"};
        System.out.println("Integer array: " + Arrays.toString(numbers));
        System.out.println("Words array: " + Arrays.toString(words));
        ISortable qs = new MergeSort();
        qs.sort(numbers);
        qs.sort(words);

        ISortable is = new InsertionSort();
        //is.sort(numbers);
        //is.sort(words);
        System.out.println("Integer array: " + Arrays.toString(numbers));
        System.out.println("Words array: " + Arrays.toString(words));
    }
}
