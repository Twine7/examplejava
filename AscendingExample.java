import java.util.Arrays; // Importing the Arrays class

public class AscendingExample {

    public static void main(String[] args){
        // Declaring and initializing an array
        int[] numbers = { 6, 1, 8, 9, 4 };

        // Printing the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array
        Arrays.sort(numbers);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

}