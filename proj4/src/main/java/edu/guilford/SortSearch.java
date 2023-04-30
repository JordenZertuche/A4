package edu.guilford;

//import java.util.Arrays;
import java.util.Random;

public class SortSearch {
    public static void main(String[] args) {
        // define two constants MAX (number of elements in array
        // and RANGE (the range of the random numbers)
        final int MAX = 40000;
        final int RANGE = 50000;
        Random rand = new Random();

        // create an array of MAX integers woth random assigned values in RANGE
        int[] array = new int[MAX];
        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < MAX; i++) {
            array[i] = rand.nextInt(1, RANGE + 1);
        }
        // System.out.println("Orginal: " + Arrays.toString(array));
        // time how long it takes to sort the array
        long startTime = System.nanoTime();
        // sort the array using the selection sort algorithm
        SortAndSearch.selectionSort(array);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Selection Sort " + (duration / 1.e6) + "milliseconds");
        // System.out.println("Sorted: " + Arrays.toString(array));

        //shuffle the array for the next test
        shuffle(array);
        //sort the array using quickk sort
        startTime = System.nanoTime();
        SortAndSearch.quickSort(array);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Quick Sort " + (duration / 1.e6) + "milliseconds");

        shuffle(array);
        //use linear search to find a random value
        int target = rand.nextInt(1, RANGE + 1);
        startTime = System.nanoTime();
        int index = SortAndSearch.linearSearch(array, target);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Linear Search took " + (duration / 1.e6) + "milliseconds");
        System.out.println("Linear Search found: " + target + " at Index: " + index);

        //to use binary search you must have a sorted array
        //sort the array using quick sort
        SortAndSearch.quickSort(array);
        //we only have to do the sort once, and then we can do as many search as we want to
        //use binary search to fine the same value as before
        startTime = rand.nextInt(1, RANGE + 1);
        startTime = System.nanoTime();
        index = SortAndSearch.binarySearch(array, target);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Binary Search took " + (duration / 1.e6) + "milliseconds");
        System.out.println("Binary Search found: " + target + " at Index: " + index);

    }

    //add a static method to shuffle the array
    public static void shuffle(int[] array) {
        // loop over all elements in the array
        for (int i = 0; i < array.length; i++) {
            // generate a random index between 0 and array.length - 1
            int randomIndex = (int) (Math.random() * array.length);
            // swap the current element with the random element using the swap method
            swap(array, i, randomIndex);
        }
    }

    //add a static method to swap two elements in an array
    private static void swap(int[] array, int i, int randomIndex) {
        // create a temporary variable to hold the value of array[i]
        int temp = array[i];
        // set array[i] to the value of array[j]
        array[i] = array[randomIndex];
        // set array[j] to the value of the temporary variable
        array[randomIndex] = temp;
    }


}
