package edu.guilford;

public class SortAndSearch {

    public static void selectionSort(int[] array) {
        // loop over all elements in the array and find the smallest one
        // Note its a counting loop and a for loop is effective
        for (int i = 0; i < array.length; i++) {
            // Assume the smallest element is the first element
            int smallest = i; // keep track of the index of the smallest element
            // not its value
            // loop over all elements in the array and find the smallest one
            // end of the array has i = array.length - 1
            // j would start at array.length, which is not less than array.length
            // the next loop wont do anything for the last element
            for (int j = i + 1; j < array.length; j++) {
                // if the current element is smaller than the smallest element
                if (array[j] < array[smallest]) {
                    // set the smallest element to the current element
                    smallest = j;
                }
            }
            // swap the smallest element with the first element
            swap(array, i, smallest);
        }

        }

   // Add a static quickSort method that takes an array of integers as a
    // parameter and sorts the array using the quick sort algorithm
    public static void quickSort(int[] array) {
        // Call the recursive quickSort method
        quickSort(array, 0, array.length - 1);
    }

    // Add a static quickSort method that takes an array of integers as a
    // parameter and sorts the array using the quick sort algorithm
    // This method is recursive
    public static void quickSort(int[] array, int start, int end) {
        // If the start index is less than the end index
        if (start < end) {
            // Call the partition method to partition the array
            int partitionIndex = partition(array, start, end);
            // Call the quickSort method on the left partition
            quickSort(array, start, partitionIndex - 1);
            // Call the quickSort method on the right partition
            quickSort(array, partitionIndex + 1, end);
        }
    }

    // Add a static partition method that takes an array of integers as a
    // parameter and partitions the array using the quick sort algorithm
    public static int partition(int[] array, int start, int end) {
        // Set the pivot to the last element in the array
        int pivot = array[end];
        // Set the partition index to the start index
        int partitionIndex = start;
        // Loop over all elements in the array
        for (int i = start; i < end; i++) {
            // If the current element is less than the pivot
            if (array[i] < pivot) {
                // Swap the current element with the element at the partition index
                swap(array, i, partitionIndex);
                // Increment the partition index
                partitionIndex++;
            }
        }
        // Swap the element at the partition index with the pivot
        swap(array, partitionIndex, end);
        // Return the partition index
        return partitionIndex;
    }
    //lets create a method that swaps two elements in an array
    private static void swap(int[] array, int i, int j) {
        // create a temporary variable to hold the value of array[i]
        int temp = array[i];
        // set array[i] to the value of array[j]
        array[i] = array[j];
        // set array[j] to the value of the temporary variable
        array[j] = temp;
    }

    public static int linearSearch(int[] array, int target) {
        return 0;
    }

    //add a binary search algorithm
    public static int binarySearch(int[] array, int target) {
        //set the start index to 0
        int start = 0;
        //set the end index to the length of the array - 1
        int end = array.length - 1;
        //while the start index is less than or equal to the end index
        while (start <= end) {
            //set the middle index to the average of the start and end indices
            int middle = (start + end) / 2;
            //if the target is equal to the element at the middle index
            if (target == array[middle]) {
                //return the middle index
                return middle;
            }
            //if the target is less than the element at the middle index
            if (target < array[middle]) {
                //set the end index to the middle index - 1
                end = middle - 1;
            }
            //if the target is greater than the element at the middle index
            if (target > array[middle]) {
                //set the start index to the middle index + 1
                start = middle + 1;
            }
        }
        //return -1
        return -1;
    }

}
