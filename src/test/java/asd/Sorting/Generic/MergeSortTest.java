package asd.Sorting.Generic;

import asd.Sorting.NonGeneric.MergeSort;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    asd.Sorting.NonGeneric.MergeSort sorter;

    @Before
    public void setUp() throws Exception {
        sorter = new MergeSort();
    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        sorter.sort(emptyArray, 0, emptyArray.length - 1);
        assert true;
    }

    @Test
    public void testAllEqualValues() {
        int[] onlyEqualValuesArray = {5, 5, 5, 5, 5};
        int[] result = {5, 5, 5, 5, 5};
        sorter.sort(onlyEqualValuesArray,0, onlyEqualValuesArray.length - 1);
        assert Arrays.equals(onlyEqualValuesArray, result);
    }

    @Test
    public void testDescendingArray() {
        int[] descendingArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sorter.sort(descendingArray, 0 , descendingArray.length - 1);
        assert Arrays.equals(descendingArray, result);
    }

    @Test
    public void testRandomOrder() {
        int[] randomArray = {5, 8, 1, 11, 2, 4, 2};
        int[] result = {1, 2, 2, 4, 5, 8, 11};
        sorter.sort(randomArray, 0, randomArray.length-1);
        assert Arrays.equals(randomArray, result);
    }
}