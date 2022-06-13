package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KindOfAlgoListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Richard");
		list.add("Donna");
		list.add("Ab");
		list.add("Ken");
		System.out.println("List: " + list);

		// Shuffle
		Collections.shuffle(list);
		System.out.println("After Shuffling: " + list);

		// Reverse the list
		Collections.reverse(list);
		System.out.println("After Reversing: " + list);

		// Swap elements at indexes 1 and 3
		Collections.swap(list, 1, 3);
		System.out.println("After Swapping (1 and 3): " + list);

		// Rotate elements by 2
		Collections.rotate(list, 2);
		System.out.println("After Rotating by 2: " + list);

		// Sort
		Collections.sort(list);
		System.out.println("Sorting: " + list);
		
		// Sort with comparator
		Collections.shuffle(list);
		System.out.println("After Shuffling: " + list);
		//Collections.sort(list);
		list.sort(Comparator.comparing(String::length));
		System.out.println("Sorting -length- without Collections: " + list);

	}

}
