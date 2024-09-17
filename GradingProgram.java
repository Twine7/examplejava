import java.util.Scanner;

public class GradingProgram {

    public static void main(String[] args) {
        Scanner grader = new Scanner(System.in);
        int grade = -1;

        while (true) {
            System.out.println("Enter marks (0-100):");
            if (grader.hasNextInt()) {
                grade = grader.nextInt();
                // Check if grade is within the expected range
                if (grade >= 0 && grade <= 100) {
                    break;
                } else {
                    System.out.println("Invalid grade! Please enter a number between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                grader.next();  // Discard the invalid input
            }
        }

        // Grade evaluation
        if (grade > 90) {
            System.out.println("Excellent");
        } else if (grade >= 80) {
            System.out.println("Very Good");
        } else if (grade >= 70) {
            System.out.println("Good");
        } else if (grade >= 60) {
            System.out.println("Medium");
        } else if (grade >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        grader.close();
    }
}
