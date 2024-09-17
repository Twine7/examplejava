import java.util.Scanner;

public class MarksEvaluationIfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input marks from user
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();
        
        // Statements to evaluate
        if (marks >= 90 && marks <= 100) {
            System.out.println("Evaluation: Excellent");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Evaluation: Very Good");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Evaluation: Good");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Evaluation: Medium");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Evaluation: Pass");
        } else if (marks >= 0 && marks <= 49) {
            System.out.println("Evaluation: Fail");
        } else {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }
        
        scanner.close();
    }
}