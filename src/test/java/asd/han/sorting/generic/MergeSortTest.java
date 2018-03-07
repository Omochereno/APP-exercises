package asd.han.sorting.generic;

import asd.han.memorycell.MemoryCell;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {

    ISortable sorter;

    @Before
    public void setUp() throws Exception {
        sorter = new MergeSort();
    }

    @Test
    public void testEmptyArray() {
        Integer[] emptyArray = {};
        sorter.sort(emptyArray);
        assert true;
    }

    @Test
    public void testAllEqualValues() {
        Integer[] onlyEqualValuesArray = {5, 5, 5, 5, 5};
        Integer[] result = {5, 5, 5, 5, 5};
        sorter.sort(onlyEqualValuesArray);
        assert Arrays.equals(onlyEqualValuesArray, result);
    }

    @Test
    public void testDescendingArray() {
        Integer[] descendingArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] result = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sorter.sort(descendingArray);
        assert Arrays.equals(descendingArray, result);
    }

    @Test
    public void testRandomOrder() {
        Integer[] randomArray = {5, 8, 1, 11, 2, 4, 2};
        Integer[] result = {1, 2, 2, 4, 5, 8, 11};
        sorter.sort(randomArray);
        assert Arrays.equals(randomArray, result);
    }

    @Test
    public void testMemoryCells() {
        MemoryCell[] memoryCellsArray = {new MemoryCell("C"), new MemoryCell("A"), new MemoryCell("B")};
        sorter.sort(memoryCellsArray);
        assert memoryCellsArray[0].read().equals("A");
    }
}