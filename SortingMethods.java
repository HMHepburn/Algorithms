package sorting.algorithms;

import java.util.Random;

public class SortingMethods {

    int[] unsorted;

    public SortingMethods(int i) {//Generates an array
        Random rand = new Random();
        unsorted = new int[i];
        for (int j = 0; j < i; j++) {
            int randInt = rand.nextInt(i);
            this.unsorted[j] = randInt;
            System.out.print(this.unsorted[j] + " ");
        }
        System.out.println();
    }

    public void printArray() {
        for (int i = 0; i < this.unsorted.length; i++) {
            System.out.print(this.unsorted[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        int n = this.unsorted.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (this.unsorted[j] > this.unsorted[j + 1]) {
                    // swap arr[j+1] and arr[i] 
                    int temp = this.unsorted[j];
                    this.unsorted[j] = this.unsorted[j + 1];
                    this.unsorted[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        int n = this.unsorted.length;
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (this.unsorted[j] < this.unsorted[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first 
            // element 
            int temp = this.unsorted[min_idx];
            this.unsorted[min_idx] = this.unsorted[i];
            this.unsorted[i] = temp;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < this.unsorted.length; i++) {
            int value = this.unsorted[i];
            int j = i - 1;
            while (j >= 0 && this.unsorted[j] > value) {
                this.unsorted[j + 1] = this.unsorted[j];
                j = j - 1;
            }
            this.unsorted[j + 1] = value;
        }
    }
}