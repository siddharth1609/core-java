package java8;

public class TestClass implements TestInterface
{

	 public static void main(String[] args) {
	  
		 TestClass testClass = new TestClass();
		 testClass.sqare(4);
		 
		 testClass.show();
	}
	
	@Override
	public void sqare(int a) {
     	System.out.println(a*a);	
	}
 
	
	
}
