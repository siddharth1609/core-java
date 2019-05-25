package java8.optional;

import java.util.Optional;

public class OptionalIfPresentExample {

	
	
	public static void main(String[] args) {
		
		
		Optional<String>gender = Optional.of("MALE");
		
		Optional<String>emptygender = Optional.empty();
		
		if(gender.isPresent()) {
			
			System.out.println("true");
		}else {
			System.out.println("false");
			
		}
		
	gender.ifPresent(g -> System.out.println("value"+g));	
		
    emptygender.ifPresent(g ->System.out.println("empty:"+g));		
		
		
	}
}
