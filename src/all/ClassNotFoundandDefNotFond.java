package all;

public class ClassNotFoundandDefNotFond {
	
	public void show() {
		System.out.println("SID");
	}
  
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
//    try {
//		
//    	Class.forName("SID");
//    	
//    	
//	} catch (ClassNotFoundException e) {
//		// TODO: handle exception
//		e.printStackTrace();
//	}
		try {
			ClassNotFoundandDefNotFond s2 =(ClassNotFoundandDefNotFond)Class.forName("all.ClassNotFoundandDefNotFond").newInstance();
			
			s2.show();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		ClassNotFoundandDefNotFond s3 = ClassNotFoundandDefNotFond.class.newInstance();
//		s3.show();
		
	}
	
}


class A {
	
}