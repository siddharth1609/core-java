package java8.optional;

import java.util.Optional;

public class OptionalBasicExample {

	public static void main(String[] args) {
		
		Optional<String> gender = Optional.of("MALE");
		String answer1 = "yes";
		String answer2 = null;
		
		System.out.println("Non-Empty Optional:"+gender);
        System.out.println("Non Empty-Optional Gender Value:"+gender.get());
        System.out.println("Non Empty-Optional Gender Value isPresent:"+gender.isPresent());
       // System.out.println("Non Empty-Optional Gender Value ifPresent:"+gender.ifPresent(Optional.of(gender).get()));
        
        System.out.println("Empty Optional:"+Optional.empty());
        
        System.out.println("ofNullable on Non-empty Optional:"+Optional.ofNullable(answer1));
        System.out.println("ofNullable on empty Optional:"+Optional.ofNullable(answer2));
        
        System.out.println("OfNullable On Non-Empty Optional"+Optional.of(answer2));
		
		
		
	}
	
}
