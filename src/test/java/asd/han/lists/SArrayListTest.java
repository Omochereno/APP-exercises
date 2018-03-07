package asd.han.lists;

import org.junit.Test;

import static org.junit.Assert.*;

public class SArrayListTest {

    @Test
    public void testAdd() {
        SArrayList<String> arrayList = new SArrayList<>("A", "B", "C");
        arrayList.add("D");
        assertEquals(arrayList.get(3), "D");
    }

    @Test
    public void testGetCorrect() {
        SArrayList<String> arrayList = new SArrayList<>("A", "B", "C");
        assertEquals(arrayList.get(1), "B");
    }

    @Test
    public void testSet() {
        int position = 1;
        SArrayList<String> arrayList = new SArrayList<>("A", "B", "C");
        arrayList.set(position, "Q");
        assertEquals(arrayList.get(position), "Q");
    }
}