package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameIterator {
	public static void main(String[] args) {
		// Create a list of strings
		List<String> names = new ArrayList<>();
		// Add some names to the list
		names.add("Ken");
		names.add("Lee");
		names.add("Ab");
		names.add("Joe");
		System.out.println("----Get Iterator / while hasNext--");
		// Get an iterator for the list
		Iterator<String> nameIterator = names.iterator();
		// Iterate over all elements in the list
		while (nameIterator.hasNext()) {
			// Get the next element from the list
			String name = nameIterator.next();
			// Print the name
			System.out.println(name);
		}
		System.out.println("----Remove element --");

		// Iterate over all elements in the list
		nameIterator = names.iterator();
		while (nameIterator.hasNext()) {
			String name = nameIterator.next();
			// Remove the name if it is two characters
			if (name.length() == 2) {
				nameIterator.remove();
			}
		}

		System.out.println("----for each loop--");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("----forEachRemaining--");
		// Print all elements of the names list
		names.iterator().forEachRemaining(System.out::println);
	}
}
