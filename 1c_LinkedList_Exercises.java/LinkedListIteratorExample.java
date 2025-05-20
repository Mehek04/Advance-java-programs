package assignment;

import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListIteratorExample{
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");
            //Display all colors
	        System.out.println("Original list: " + list);
	     // Create an iterator starting from the 2nd position (index 1)
	        ListIterator<String> iterator = list.listIterator(1); // 2nd position (index 1)

	        System.out.print("Iterating from 2nd position: ");
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();
	    }
	}

