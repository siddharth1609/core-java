package hashcode;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Filter;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindPerricularInStream {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Chris", "HTML", "XML", "C","SID");

		List<String> names2 = Arrays.asList("A", "B", "C", "D","E");
        
		/*List<String> collect = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        
		List<String> collect2 = names.stream().filter(s ->s.equals("XML") || s.equals("SID")).collect(Collectors.toList());
        
		System.out.println(">>>>>>>>>>>>>>>>>>>>"+collect);
        System.out.println("Find one :"+collect2);
        */
        
        List<String> collect3 = names.stream().flatMap(x -> names2.stream().filter(y -> x.equals(y.equals("C")))).
        		collect(Collectors.toList());
        
        System.out.println("collect3"+collect3);
	}
}
