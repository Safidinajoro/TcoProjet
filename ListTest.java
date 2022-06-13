package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Richard");
		list.add("Donna");
		list.add("Ken");
		list.add(2, "Bin");
		list.add(5, "Lyl");
		list.add(0, "Cop");
		System.out.println("List: " + list);
		//Backward
		ListIterator<String> itr = list.listIterator(7);
		while(itr.hasPrevious())
		{
			System.out.printf("previous element   : %10s%n ", itr.previous());
		}
		//Forward
		itr = list.listIterator(3);
		while(itr.hasNext())
		{
			System.out.printf("next element       : %10s%n ", itr.next());
		}
		 
		//Previous and next indexes
		itr = list.listIterator(3);
		System.out.printf("previous Index without next()  : %5s%n ", itr.previousIndex());
		System.out.printf("next index without next()      : %5s%n ", itr.nextIndex());
		itr = list.listIterator(3);
		itr.next();
		System.out.printf("previous Index with next')     : %5s%n ", itr.previousIndex());
		System.out.printf("next index with next()         : %5s%n ", itr.nextIndex());
		
		//Remove
		System.out.println("List: " + list);
		System.out.println("Remove : " + list.remove(5));
		System.out.println("List: " + list);
		
		//Contains
		System.out.println("List contains Lyl : " + list.contains("Lyl"));
		System.out.println("List contains Ken : " + list.contains("Ken"));
	}

}
