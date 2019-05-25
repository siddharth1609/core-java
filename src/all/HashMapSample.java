package all;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
	public static void main(String[] args) {

		Map<String, String> hmap = new HashMap();
		hmap.put("A", "SID");
		hmap.put("A", "SIDD");
		hmap.put("B", "SID");
		hmap.put("C", "SID");

		System.out.println(">>>>>>>>>>>>>>>>>>>>>" + hmap);
	}
}
