/*3B4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome()*/
package assignment;
import java.util.Scanner;
public class PalindromeCheck {
	

	    // Function to check if the string is a palindrome
	    public static boolean isPalindrome(String str) {
	        // Remove all non-alphanumeric characters and convert to lower case
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Compare the cleaned string with its reverse
	        int left = 0;
	        int right = cleaned.length() - 1;

	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false; // Not a palindrome
	            }
	            left++;
	            right--;
	        }

	        return true; // It's a palindrome
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read input from the user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Check if it is a palindrome
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }
	

}
