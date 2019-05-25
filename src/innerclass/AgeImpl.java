package innerclass;

public class AgeImpl {

	
	public static void main(String[] args) {
		
		Age age = new Age() {
			
			@Override
			public void getAge() {
                System.out.println("age is"+x);				
			}
		};
		
		age.getAge();
		
	}
}
