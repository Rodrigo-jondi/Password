import java.util.Scanner;

public class PasswordValidationSystem {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        String password;
        
        // Loop until a valid password is entered
        while (true) {
            // Prompt the user to enter a password
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
            
            // Validate the password
            if (isValidPassword(password)) {
                System.out.println("Your password is valid!");
                break; // Exit the loop if the password is valid
            } else {
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }
    }
    
    // Method to validate the password based on criteria
    public static boolean isValidPassword(String password) {
        // Check if the password has at least 8 characters
        if (password.length() < 8) {
            return false;
        }
        
        // Check if the password contains at least one uppercase letter
        boolean hasUppercase = false;
        boolean hasNumber = false;
        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            
            if (Character.isDigit(ch)) {
                hasNumber = true;
            }
            
            // If both conditions are met, no need to continue checking
            if (hasUppercase && hasNumber) {
                return true;
            }
        }
        
        // Return true only if both conditions are met
        return hasUppercase && hasNumber;
    }
}