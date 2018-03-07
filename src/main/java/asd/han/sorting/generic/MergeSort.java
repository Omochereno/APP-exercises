package asd.han.sorting.generic;

import asd.han.sorting.generic.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class MergeSort extends Sorter implements ISortable{

    private int count = 0;

    @Override
    public <T extends Comparable<T>> void sort(T[] values) {
        count = 0;
        mergeSort(values, 0, values.length - 1, 0);

        System.out.printf("%2s: ", count);
    }

    public static <T> List<T> newList(int initialCapacity) {
        return new ArrayList<T>(initialCapacity);
    }

    private <T extends Comparable<T>> void mergeSort(T[] arValues, int low, int high, int orderType) {
        if (low < high) {
            // Get the middle of the array.
            int middle = low + ((high - low) / 2);

            // Divide.
            mergeSort(arValues, low, middle, orderType);
            mergeSort(arValues, middle + 1, high, orderType);

            // Conquer.
            merge(arValues, low, middle, high, orderType);
        }
    }

    private <T extends Comparable<T>> void merge(T[] arValues, int low, int middle, int high, int orderType) {
        // The amount of numbers to sort.
        int numbersToSort = (high - low) + 1;

        // Temp array to contain the sorted elements of this iteration.
        List<T> arTemp = Utils.newList(numbersToSort);

        int i = low;
        int j = middle + 1;
        T lowValue = null;
        T highValue = null;
        for (int k = 0; k < numbersToSort; k++) {
            count++;

            lowValue = (i <= middle) ? arValues[i] : null;
            highValue = (j <= high) ? arValues[j] : null;

            if (checkBiggerSmaller(lowValue, highValue, orderType)) {
                arTemp.add(arValues[i++]);
            } else {
                arTemp.add(arValues[j++]);
            }
        }

        // Transfer the sorted elements to the original array.
        for (int k = 0; k < numbersToSort; k++) {
            count++;
            arValues[low + k] = arTemp.get(k);
        }
    }

    private <T extends Comparable<T>> boolean checkBiggerSmaller(T lowValue, T highValue, int orderType) {
        if ((lowValue != null) && (highValue == null)) {
            return true;
        } else if ((lowValue == null) && (highValue != null)) {
            return false;
        }

        if (0 == orderType) {
            // Ascending.
            return lowValue.compareTo(highValue) <= 0;
        } else {
            // Descending.
            return lowValue.compareTo(highValue) >= 0;
        }
    }
}

