package collectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorPractice {

	public static void main(String[] args) {
		
		List<Students> list = new ArrayList<>();
        list.add(new Students(10, "webc", 110));
        list.add(new Students(6, "zxc", 30));
        list.add(new Students(3, "abcf", 20));
        list.add(new Students(2, "poiu", 100));

 
        Collections.sort(list, new NameComparator());

 

        for (Students s : list) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }

        System.out.println();

        Collections.sort(list, new AgeComparator());
        for (Students s : list) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
        
	}
}
