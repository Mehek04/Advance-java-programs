/* 6.Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/

package assignment;
import java.util.Scanner;
public class capitalizeWords {
	    // User-defined function to capitalize the first letter of each word
	    public static String capitalizeWords(String str) {
	        String[] words = str.trim().split("\\s+"); // Split by one or more spaces
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                // Capitalize first letter and add the rest in lowercase
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1).toLowerCase())
	                           .append(" ");
	            }
	        }

	        return capitalized.toString().trim(); // Remove trailing space
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Capitalize words
	        String result = capitalizeWords(input);

	        // Output result
	        System.out.println("Capitalized String: " + result);

	        scanner.close();
	    }

}
