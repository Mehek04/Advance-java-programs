/*4.Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/

package assignment;
import java.util.LinkedList;

public class DisplayElementsWithPositions {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
            //// Display elements with their positions
	        System.out.println("Elements and their positions:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Position " + i + ": " + list.get(i));
	        }
	    }

}
