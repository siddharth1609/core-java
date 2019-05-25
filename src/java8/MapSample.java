package java8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapSample {
	
	public static void main(String[] args) {
		
		
		//Map<Integer, String> hhashtable =  new Hashtable<>();
		/*Map<Integer, String> hashmap =  new HashMap();
		Map<Integer, String> treemap =  new TreeMap<>();
		Map<Integer, String> hmap =  new Li();
		*/
		
		Map<Integer,String> hashmap = new HashMap<>();
		
		hashmap.put(10,"A");
		hashmap.put(20,"B");
		hashmap.put(30,"C");
		hashmap.put(40,"D");
		hashmap.put(50,"E");
		
		/*for(Map.Entry<Integer, String>entry:hashmap.entrySet()) {
			
			System.out.println("Key"+entry.getKey()+"Value"+entry.getValue());
		}
		*/
		
		hashmap.forEach((k,v)->System.out.println("Key"+k+"Value"+v));
		
		
	}

}
