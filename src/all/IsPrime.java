package all;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IsPrime {
 
	
	
	
	public static void main(String[] args) {
	 
		boolean isPrime = isPrime(5);
		System.out.println(">>>>>>>>>>>>"+isPrime);
		
//		findSquareOfMaxOdd(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	}


	public static boolean isOdd(int i) {
		return i%2 !=0;
	}
	
	private static boolean isPrime(int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
	}

	/*private static boolean isPrime(int number) {
		if(number<2)return false;
		for(int i = 2;i < number;i++) {
			if(number % 2 == 0) return false;
		}
		
		return true;
	}*/
}
