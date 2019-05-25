package java8.optional;

import java.util.Optional;

public class OptionalFilterExample {

	public static void main(String[] args) {
		
		Optional<String>gender = Optional.of("male");
		
	    Optional<String>emptyGender = Optional.empty();
	    
	    System.out.println("Optional Empty:"+gender.filter(g -> g.equals("MALE")));
	    
	    System.out.println("Optional of Male:"+gender.filter(g ->g.equalsIgnoreCase("male")));
	    
	    System.out.println("Optional of Male 1:"+gender.filter(g ->g.equalsIgnoreCase("MALE")));
	    
	    System.out.println("Optional .empty:"+emptyGender.filter(g ->g.equalsIgnoreCase("male")));
	    
	    
	    
	}	
}
