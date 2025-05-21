/* 3.Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/

package assignment;
import java.util.LinkedList;
public class InsertAtEnd {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
            //Insert "Pink" at the end of the LinkedList
	        list.offerLast("Pink"); // Add at the end

	        System.out.println("After inserting 'Pink' at the end: " + list);
	    }
}
