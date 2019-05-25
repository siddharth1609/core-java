package java8.optional;

import java.util.Optional;

public class OptionalMapFlapMapExample {

   public static void main(String[] args) {
	
   Optional<String>nonEmptyGender = Optional.of("male"); 
   Optional<String>emptyGender = Optional.empty();
   
   System.out.println("Non Empty Gender:"+nonEmptyGender.map(String::toUpperCase));
   
   System.out.println("Non Empty Gender print:"+nonEmptyGender);
   
   System.out.println("Empty Gender:"+emptyGender.map(String::toUpperCase));
   System.out.println("Empty Gender print :"+emptyGender.map(String::toUpperCase));
   
   Optional<Optional<String>> nonEmptyOptionalgender = Optional.of(Optional.of("male"));
   
   System.out.println("Optional Value:"+nonEmptyOptionalgender);
   
   System.out.println("Optional map::"+nonEmptyOptionalgender.map(gender -> gender.map(String::toUpperCase)));
   
   System.out.println("Optional flat map::"+nonEmptyOptionalgender.flatMap(gender ->gender.map(String::toUpperCase)));
   
   

	}
}
