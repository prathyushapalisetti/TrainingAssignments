package collectionFramework;
import java.util.Map;
import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(10,  "abc");
		map.put(3, "pot");
		map.put(9, "uyc");
		map.put(5, "wet");
		map.put(10,  "lic");
		map.put(null,null);
		map.put(null, "tyu");
		System.out.println(map.get(10));
		System.out.println(map);
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		

	}

}
