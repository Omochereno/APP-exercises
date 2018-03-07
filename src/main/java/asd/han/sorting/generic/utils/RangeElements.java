package asd.han.sorting.generic.utils;

public class RangeElements<T> {
    private T lowestElement;
    private T highestElement;

    public T getLowestElement() {
        return lowestElement;
    }

    public void setLowestElement(T lowestElement) {
        this.lowestElement = lowestElement;
    }

    public T getHighestElement() {
        return highestElement;
    }

    public void setHighestElement(T highestElement) {
        this.highestElement = highestElement;
    }
}
