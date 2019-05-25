package singletone;

public class SingleToneThreadSafe extends SingleToneClass {

	private  SingleToneThreadSafe instance;
	
	String s;
	private SingleToneThreadSafe() {
		s  = "SIDDHARTH.....!";
	}
	
	private SingleToneThreadSafe getInstance() {
		
		 if(instance == null) {
			 instance = new SingleToneThreadSafe();
		 }
		
		return instance;
	}
	
	public static void main(String[] args) {
		
		//SingleToneThreadSafe.getInstance();
		
		//SingleToneThreadSafe safe = SingleToneThreadSafe.getInstance();
		//System.out.println("?????????????"+safe.s);
		
	}
	
}
