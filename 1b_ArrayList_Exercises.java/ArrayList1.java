/*1b1.Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/

package assignment;
import java.util.ArrayList;
public class ColorSearch {
		    public static void main(String[] args) {
		        ArrayList<String> colors = new ArrayList<>();
		        // Add some colors to the list
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");
		        colors.add("Yellow");
		        System.out.println("Colors: " + colors);
		        //search for the color "Red"
		        if (colors.contains("Red")) {
		            System.out.println("The color 'Red' is available in the list.");
		        } else {
		            System.out.println("The color 'Red' is NOT available in the list.");
		        }
		    }
		}

	


