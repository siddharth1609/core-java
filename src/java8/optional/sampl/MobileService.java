package java8.optional.sampl;

import java.util.Optional;

public class MobileService {
	
	public Integer getMobileScreenWidth(Optional<Mobile> mobile) {
		
		
		return mobile.flatMap(Mobile::getDfeature)
				.flatMap(DisplayFeatures::getResolution).
				map(ScreenResolution::getWidth).orElse(0);
		
	}
}
