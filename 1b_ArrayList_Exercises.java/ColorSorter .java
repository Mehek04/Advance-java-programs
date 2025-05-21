/*3. Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/

package assignment;
	import java.util.ArrayList;
	import java.util.Collections;
	public class ColorSorter {
		    public static void main(String[] args) {
		        ArrayList<String> colors = new ArrayList<>();
		        //Add colors to the list
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");
		        colors.add("Yellow");
	           //print colors before sorting
		        System.out.println("Before sorting: " + colors);
	           //sort the colors
		        Collections.sort(colors);

		        System.out.println("After sorting: " + colors);
		    }
		}


