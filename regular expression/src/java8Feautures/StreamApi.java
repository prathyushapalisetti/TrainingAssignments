package java8Feautures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Set;
import java.util.*;

public class StreamApi {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4, 3, 7, 8, 10, 1);
		
		// using loop
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				System.out.println(list.get(i));
			}
		}
		
		
		// using stream
		
		List<Integer> newList = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		// using method reference
		list.stream().filter(n -> n %2 == 0).forEach(System.out::println);
		System.out.println(list);
		
		long count = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println("the count is" + count);
		
		Stream.iterate(10, element -> element + 2).filter(n -> n % 5 == 0).limit(4).forEach(System.out::println);
		System.out.println();
		
		List<String> names = Arrays.asList("prathyu", "mouni", "pravalli", "vineetha", "prathyu");
// using list 
		//List<String> namesList = names.stream().filter(s -> s.startsWith("p")).collect(Collectors.toList());

// using set		
		Set<String> namesList = names.stream().filter(s -> s.startsWith("p")).collect(Collectors.toSet());
		
		System.out.println(namesList);
		
		Optional<String> output = names.stream().reduce((name1,name2) -> name1.length()>name2.length() ? name1:name2);
		if(output.isPresent());
		    System.out.println(output.get());
	}

}
