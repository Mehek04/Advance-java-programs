/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List*/
package assignment;
import java.util.*;
public class ListInterfaceDemo {
	
	    public static void main(String[] args) {
	        // Initial elements
	        List<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
	        List<String> linkedList = new LinkedList<>(Arrays.asList("Apple", "Banana", "Orange"));

	        System.out.println("===== ArrayList Operations =====");
	        performOperations(arrayList);

	        System.out.println("\n===== LinkedList Operations =====");
	        performOperations(linkedList);
	    }

	    public static void performOperations(List<String> list) {
	        // 1. Adding elements
	        list.add("Grapes");
	        System.out.println("After adding 'Grapes': " + list);

	        // 2. Adding element at specific index
	        list.add(1, "Mango");
	        System.out.println("After adding 'Mango' at index 1: " + list);

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Pineapple", "Peach");
	        list.addAll(moreFruits);
	        System.out.println("After adding more fruits: " + list);

	        // 4. Accessing elements
	        System.out.println("Element at index 2: " + list.get(2));

	        // 5. Updating elements
	        list.set(2, "Kiwi");
	        System.out.println("After updating index 2 to 'Kiwi': " + list);

	        // 6. Removing elements
	        list.remove("Banana");
	        list.remove(3);
	        System.out.println("After removing 'Banana' and index 3: " + list);

	        // 7. Searching elements
	        System.out.println("Contains 'Apple'? " + list.contains("Apple"));
	        System.out.println("'Mango' is at index: " + list.indexOf("Mango"));

	        // 8. List size
	        System.out.println("List size: " + list.size());

	        // 9. Iterating over list (for-each loop)
	        System.out.print("Iterating with for-each: ");
	        for (String fruit : list) {
	            System.out.print(fruit + " ");
	        }
	        System.out.println();

	        // 10. Using Iterator
	        System.out.print("Iterating with Iterator: ");
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();

	        // 11. Sorting
	        Collections.sort(list);
	        System.out.println("After sorting: " + list);

	        // 12. Sublist
	        if (list.size() >= 3) {
	            List<String> subList = list.subList(1, 3); // from index 1 to 2
	            System.out.println("Sublist (index 1 to 2): " + subList);
	        } else {
	            System.out.println("Sublist not created: Not enough elements.");
	        }

	        // 13. Clearing the list
	        list.clear();
	        System.out.println("After clearing: " + list);
	    }
	}


