package java8Feautures;

import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class MapFlatmap {

	public static void main(String[] args) {
		
// map - transformation
		
		List<String> names1 = Arrays.asList("prathyu" , "mouni" , "pravalli" , "vineetha" , "praveen");
		List<Integer> a = names1.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println(a);
		
// flat map - transformation + flattening
		
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5, 6);
		List<Integer> l3 = Arrays.asList(7, 8, 9);
		
		List<List<Integer>> l4 = Arrays.asList(l1, l2, l3);
		System.out.println(l4);
		
		List<Integer> main1 = l4.stream().flatMap(X->X.stream()).collect(Collectors.toList());
		System.out.println(main1);
		

	}

}
