package asd.han.sorting.generic.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
        /**
         * Print all the elements of the array.
         *
         * @param values
         */
        public static <T> void printArray(T[] values) {
            for (T temp : values) {
                System.out.printf("%3s", temp);
            }

            System.out.println();
        }

        /**
         * Iterates over all the elements in the array and return an object (RangeElements) with the
         * lowest and highest element from it.
         *
         * @param values
         * @return An object with the lowest and highest element from it.
         */
        public static <T extends Comparable<T>> RangeElements<T> getLowestAndHighestElement(T[] values) {
            if ((null == values) || (values.length < 1)) {
                return null;
            }

            RangeElements<T> rangeElements = new RangeElements<T>();
            T lowestElement = values[0];
            T highestElement = values[0];

            for (int i = 1; i < values.length; i++) {
                if (lowestElement.compareTo(values[i]) > 0) {
                    lowestElement = values[i];
                }
                if (highestElement.compareTo(values[i]) < 0) {
                    highestElement = values[i];
                }
            }

            rangeElements.setLowestElement(lowestElement);
            rangeElements.setHighestElement(highestElement);
            return rangeElements;
        }

        /**
         * Return a list of type T.
         *
         * @param initialCapacity
         *          the initial capacity of the list.
         * @return List<T>
         */
        public static <T> List<T> newList(int initialCapacity) {
            return new ArrayList<T>(initialCapacity);
        }
}
