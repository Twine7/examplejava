import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number:");

        // Check if the input is a valid integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            // Determine if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        // Close the scanner
        scanner.close();
    }
}
