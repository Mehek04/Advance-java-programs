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


