package innerclass;

public class InnerClass {
 
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {

				System.out.println("in run for AIC");
			}
		};
		
		Thread t =  new Thread(r);
		
		t.start();
		
	}
}
