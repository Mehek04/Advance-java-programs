package assignment;
import java.util.Scanner;
public class StringTruncation {

	    // User-defined function to truncate string and add ellipsis if needed
	    public static String truncate(String str, int maxLength) {
	        // If string is already short enough, return it as-is
	        if (str.length() <= maxLength) {
	            return str;
	        }

	        // If maxLength is less than or equal to 3, return a shortened ellipsis only
	        if (maxLength <= 3) {
	            return "...".substring(0, maxLength);
	        }

	        // Truncate and add ellipsis
	        return str.substring(0, maxLength - 3) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        System.out.print("Enter maximum length: ");
	        int maxLength = scanner.nextInt();

	        // Truncate the string
	        String result = truncate(input, maxLength);

	        // Output result
	        System.out.println("Truncated String: " + result);

	        scanner.close();
	    }
	}

