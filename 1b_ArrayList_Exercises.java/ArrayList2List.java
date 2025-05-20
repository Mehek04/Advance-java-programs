/* 2. Write a java program for getting different colors through ArrayList interface and remove the
      2nd element and color "Blue" from the ArrayList */
package assignment;
import java.util.ArrayList;
public class ColorList {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        //Add some colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Original list: " + colors);

	        // Remove 2nd element (index 1)
	        colors.remove(1);

	        // Remove color "Blue"
	        colors.remove("Blue");

	        System.out.println("After removal: " + colors);
	    }
}
