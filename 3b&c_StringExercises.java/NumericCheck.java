/*3B1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/
package assignment;
import java.util.Scanner;

public class NumericCheck {
	    // User-defined function to check if a string is numeric
	    public static boolean isNumeric(String str) {
	        // Check for null or empty string
	        if (str == null || str.isEmpty()) {
	            return false;
	        }

	        // Use regex to check if all characters are digits
	        return str.matches("\\d+"); // \\d matches digits, + means one or more
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get user input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Check if it's numeric
	        if (isNumeric(input)) {
	            System.out.println("The string contains only numeric characters.");
	        } else {
	            System.out.println("The string does NOT contain only numeric characters.");
	        }

	        scanner.close();
	    }
	

}
