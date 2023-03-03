package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ALUsingIterator {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
//		Iterator it = list.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
		
		System.out.println("element present at index 3 is" + list.get(3));

	}

}
