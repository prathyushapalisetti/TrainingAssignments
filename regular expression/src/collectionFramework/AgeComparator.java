package collectionFramework;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		if(o1.age == o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return-1;

	}
	
	

}
