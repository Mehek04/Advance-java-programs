/*2.Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package assignment;
import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListIteration {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");
            //Display original List
	        System.out.println("Original list: " + list);
           //get the decescending iterator
	        Iterator<String> descIterator = list.descendingIterator();

	        System.out.print("Reverse order: ");
	        while (descIterator.hasNext()) {
	            System.out.print(descIterator.next() + " ");
	        }
	        System.out.println();
	    }

}
