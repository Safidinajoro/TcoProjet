package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Richard");
		list.add("Donna");
		list.add("Ken");
		System.out.println("List: " + list);
		// Uses List.sort() method with a Comparator
		list.sort(Comparator.comparing(String::length));
		System.out.println("Sorted List with length: " + list);
		Collections.reverse(list);
		System.out.println("Reversed List: " + list);
		Collections.rotate(list, 2);
		System.out.println("Rotated List (step 2): " + list);
		Collections.sort(list, Comparator.comparing(String::length));
		System.out.println("Sorted List with length using Collections: " 
		+ list);
		Collections.sort(list); //sort of elements
		System.out.println("Sorted List: " + list);
		Collections.shuffle(list); //shuffled elements
		System.out.println("Shuffled List: " + list);
		Collections.swap(list, 1, 3); //swap of elements
		System.out.println("Swap the two elements in the List: " + list);
	}
}
