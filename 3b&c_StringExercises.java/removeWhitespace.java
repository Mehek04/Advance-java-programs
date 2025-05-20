package assignment;
import java.util.Scanner;
public class removeWhitespace{

	    // User-defined function to remove all whitespace characters
	    public static String removeWhitespace(String str) {
	        // Replace all whitespace characters using regex \s+
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Remove whitespace
	        String result = removeWhitespace(input);

	        // Output result
	        System.out.println("String after removing all whitespace: " + result);

	        scanner.close();
	    }
	
}
