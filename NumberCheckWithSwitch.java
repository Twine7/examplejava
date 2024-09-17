import java.util.Scanner;

public class NumberCheckWithSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number:");

        // Check if the input is a valid integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int category = classifyNumber(number);

            // Use a switch statement to determine the number category
            switch (category) {
                case -1:
                    System.out.println("The number is negative.");
                    break;
                case 0:
                    System.out.println("The number is zero.");
                    break;
                case 1:
                    System.out.println("The number is positive.");
                    break;
                default:
                    System.out.println("Unexpected case.");
                    break;
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        // Close the scanner
        scanner.close();
    }

    // Helper method to classify the number
    private static int classifyNumber(int number) {
        if (number > 0) {
            return 1;  // Positive
        } else if (number < 0) {
            return -1; // Negative
        } else {
            return 0;  // Zero
        }
    }
}
