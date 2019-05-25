package java8.optional.sampl;

import java.util.Optional;

public class MobileTesterWithOptional {
	
	
	
	public void show() {
		
	}
	
	 private void show(int a) {
		
	}

	
	public static void main(String[] args) {
		
	 ScreenResolution screenResolution = new ScreenResolution(100,2000);
	 
	  DisplayFeatures displayFeatures = new DisplayFeatures("5.0",Optional.of(screenResolution));
	  
      Mobile mobile = new Mobile(1111111L,"Apple","iphone s6",Optional.of(displayFeatures));
      
	  MobileService mobileService = new MobileService();
	  int width  = mobileService.getMobileScreenWidth(Optional.of(mobile));
    
	  System.out.println("width"+width);
		
	}
}
