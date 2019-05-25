package java8.optional;

import java.util.Optional;

public class OptionalOrElseExample {

	public static void main(String[] args) {
		
		Optional<String> gender = Optional.of("male");
		
		Optional<String>emptyGender = Optional.empty();
		
		System.out.println(gender.orElse("NA"));
		
		System.out.println(emptyGender.orElse("NA"));
		
		System.out.println(gender.orElseGet(()->"NA"));
		
		System.out.println(emptyGender.orElseGet(()->"NA"));
		
		
		
		
	}
}
