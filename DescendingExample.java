import java.util.Arrays; // Importing the Arrays class
import java.util.Collections; // Importing Collections class for reverse order

public class DescendingExample {

    public static void main(String[] args){
        // Declaring and initializing an array (Integer array to support reverse sorting)
        Integer[] numbers = { 5, 3, 8, 1, 4 };

        // Printing the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Printing the sorted array in descending order
        System.out.println("Sorted array (Descending): " + Arrays.toString(numbers));
    }
}
