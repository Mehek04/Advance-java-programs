package assignment;
import java.util.Scanner;
public class WordCounter{
	
	    // User-defined function to count words in a string
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0; // No words in null or empty string
	        }

	        // Split the string by one or more whitespace characters
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input string from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Count and display number of words
	        int wordCount = countWords(input);
	        System.out.println("Number of words: " + wordCount);

	        scanner.close();
	    }
	

}
