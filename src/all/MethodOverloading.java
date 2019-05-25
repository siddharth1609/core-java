package all;

public class MethodOverloading {

	 int add(int a, int b) {
		int d  = a +b;
		return  d;
	}
	
//    double add(int a, int b) {
//		int d  = a +b;
//		return  d;
//	}
      double add(double a,double b) {
     	double d = 0;
    	return d = a + b;
    	
    }
	

      float mymethod(int a, float b) {
    	  float c = 0;
    	  return c = a + b;
      }
      float mymethod(float var1, int var2) {
    	  float c = 0;
    	  return c = var1 + var2;
    	  
      }
      
	public static void main(String[] args) {
		
		 MethodOverloading methodOverloading = new MethodOverloading();
		 System.out.println(""+methodOverloading.add(2, 2));
		 System.out.println("3"+methodOverloading.mymethod(10.5f, 2));
		
	}
}
