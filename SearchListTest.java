package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SearchListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Richard");
		list.add("Donna");
		list.add("Ken");
		// Must sort before performing the binary search
		Collections.sort(list);
		System.out.println("List: " + list);
		// Find Donna
		int index = Collections.binarySearch(list, "Donna");
		System.out.println("Donna in List is at " + index);
		// Find Ellen
		index = Collections.binarySearch(list, "Ellen");
		System.out.println("Ellen in List is at " + index);
	}

}
