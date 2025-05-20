package assignment;
import java.util.Scanner;
public class StringReversal {


	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i); // Append characters in reverse order
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();

	        // Calling user-defined function
	        String reversed = reverseString(input);

	        System.out.println("Reversed string: " + reversed);

	        scanner.close();
	    }
	}


