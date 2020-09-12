package sorting.algorithms;

import java.util.Random;

public class SortingTest {

    public static void main(String[] args) {
        SortingMethods array1 = new SortingMethods(1000);
        SortingMethods array2 = new SortingMethods(1000);
        SortingMethods array3 = new SortingMethods(1000);

        array1.bubbleSort();
        array2.selectionSort();
        array3.insertionSort();

        array1.printArray();
        array2.printArray();
        array3.printArray();
    }
}