/*4.Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package assignment;
import java.util.ArrayList;
import java.util.List;
public class ColorExtractor{
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
           // Display colors
	        System.out.println("Original list: " + colors);

	        List<String> subList = colors.subList(0, 2); // index 0 and 1

	        System.out.println("Sublist (1st and 2nd elements): " + subList);
	    }
	}


