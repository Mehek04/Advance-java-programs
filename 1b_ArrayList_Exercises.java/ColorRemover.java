package assignment;
import java.util.ArrayList;
public class ColorRemover {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        int n = 2; // delete the 3rd element (index 2)
	        System.out.println("Original list: " + colors);

	        if (n >= 0 && n < colors.size()) {
	            colors.remove(n);
	            System.out.println("After removing element at index " + n + ": " + colors);
	        } else {
	            System.out.println("Invalid index: " + n);
	        }
	  }
}


