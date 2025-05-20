/*3B2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package assignment;
import java.util.Scanner;
public class SubstringCount {

		    // User-defined function to count occurrences of substring in main string
		    public static int countOccurrences(String mainStr, String subStr) {
		        if (mainStr == null || subStr == null || subStr.isEmpty()) {
		            return 0; // Handle null or empty substring cases
		        }

		        int count = 0;
		        int index = 0;

		        // Loop until no more occurrences found
		        while ((index = mainStr.indexOf(subStr, index)) != -1) {
		            count++;
		            index += subStr.length(); // Move index past this substring
		        }

		        return count;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the main string: ");
		        String mainString = scanner.nextLine();

		        System.out.print("Enter the substring to count: ");
		        String substring = scanner.nextLine();

		        int occurrences = countOccurrences(mainString, substring);

		        System.out.println("The substring \"" + substring + "\" appears " + occurrences + " times.");

		        scanner.close();
		    }
		}
