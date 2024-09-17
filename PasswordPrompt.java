import java.util.Scanner;

public class PasswordPrompt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the correct password
        String correctPassword = "twine";
        String inputPassword;

        // Prompt the user to enter the password
        System.out.println("Enter the password: ");
        
        // Read the input from the user
        inputPassword = scanner.nextLine();

        // Loop until the correct password is entered
        while (!inputPassword.equals(correctPassword)) {
            // Inform the user that the password is incorrect
            System.out.println("Incorrect password. Try again...");
            
            // Prompt the user to enter the password again
            System.out.println("Enter the password: ");
            
            // Read the new input from the user
            inputPassword = scanner.nextLine();
        }

        // Inform the user that the password is correct
        System.out.println("Password is correct. Access granted.");
        
        // Close the scanner to free up resources
        scanner.close();
    }
}
