package innerclass;

public class SayHelloImpl {

	
	public static Hello hello =  new Hello() {
		
		@Override
		public void sayHello() {
         System.out.println("Hello nested anonymous class");				
		}
	};
	
	public static void main(String[] args) {
		
	 Hello h = new Hello() {
		
		@Override
		public void sayHello() {

			System.out.println("Hello anonymous class");
		}
	};
	
	h.sayHello();
		
	SayHelloImpl.hello.sayHello();
	}
}
