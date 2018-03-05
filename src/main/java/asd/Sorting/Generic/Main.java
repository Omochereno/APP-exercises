package asd.Sorting.Generic;

import com.sun.scenario.effect.Merge;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main( String[] args )
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(56);
        arrayList.add(46);
        arrayList.add(23);
        arrayList.add(87);
        arrayList.add(2);
        arrayList.add(34);
        arrayList.add(444);

        Integer[] numbers = {5, 1, 6, 23, 7, 9, 0};
        String[] words = {"Zorg", "Xenos", "Geven", "Nemen", "Aap"};
        System.out.println("Integer array: " + Arrays.toString(numbers));
        System.out.println("Words array: " + Arrays.toString(words));
        QuickSort qs = new QuickSort();
        qs.sort(numbers);
        qs.sort(words);

        InsertionSort is = new InsertionSort();
        //is.sort(numbers);
        //is.sort(words);
        System.out.println("Integer array: " + Arrays.toString(numbers));
        System.out.println("Words array: " + Arrays.toString(words));
    }
}
