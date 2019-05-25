package java8;

public interface TestInterface {
    public void sqare(int a);
    
    //default method 
    default void show() {
    	System.out.println("Test Interface default Method");
    }
}
