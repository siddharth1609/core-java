package abstra;
class Honda extends Bike{

	@Override
	void run() {
		
		System.out.println("running safetly");
	}
	
	public static void main(String[] args) {
		
		//Honda honda =  new Honda();
	//	Honda  honda = new 
		
		Bike  bike = new Honda();
		
		bike.run();
		
		
	}
	
}