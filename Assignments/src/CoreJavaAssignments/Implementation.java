package CoreJavaAssignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Implementation {

	public static void main(String[] args) {
		
		List<Candidate>list = new ArrayList<>();
		list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
		
//        System.out.println(Implementation.getCount(list));
//        System.out.println(Implementation.getAverageAge(list));
//        System.out.println(Implementation.countCandidatesDepartmentWise(list));
          System.out.println(Implementation.getYoungestCandidateDetails(list));
	}
         
	
	static Map<String, Long> getCount(List<Candidate> list) {
		Map<String, Long> count = list.stream()
				.collect(Collectors.groupingBy(Candidate::getGender, Collectors.counting()));
		return count;
		
	}
	
	static Map<String, Double> getAverageAge(List<Candidate> list) {
		Map<String, Double> count = list.stream()
				.collect(Collectors.groupingBy(Candidate::getGender, Collectors.averagingInt(Candidate::getAge)));
		return count;
				
	}
	
	static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list) {
		Map<String, Long> count = list.stream()
				.collect(Collectors.groupingBy(Candidate::getDepartment, Collectors.counting()));
		return count;
		
	}
	
	static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list) {
		Optional<Candidate> age = list.stream().filter(e -> e.getGender() == "Male"&& e.getDepartment() == "ProductDevelopment")
				.min(Comparator.comparingInt(Candidate::getAge));
		return age;
				
	}
			
	
}
	
	
	
	

