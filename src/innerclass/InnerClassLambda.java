package innerclass;

public class InnerClassLambda {

	
	public static void main(String[] args) {
		
		Runnable r = ()->{
			System.out.println("in inner class with lambda");
		};
		 	
		Thread thread = new Thread(r);
		thread.start();
		
	}
}
