package collectionFramework;

import java.util.*;
import java.util.Collections;
import java.util.List;

public class ComparablePractice {

	public static void main(String[] args) {
		
		 List<Students> list = new ArrayList<>();
	        list.add(new Students(10, "webc", 110));
	        list.add(new Students(6, "zxc", 30));
	        list.add(new Students(3, "abcf", 20));
	        list.add(new Students(2, "poiu", 100));
	        
//	        Collections.sort(list);

	        for (Students s : list) {
	            System.out.println(s.id + " " + s.name + " " + s.age);
	        }	
	}
}
