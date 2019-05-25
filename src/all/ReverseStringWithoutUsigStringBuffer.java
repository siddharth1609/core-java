package all;

public class ReverseStringWithoutUsigStringBuffer {

	public static void main(String[] args) {
		
		String originalString ="SIDDHARTH";
		
		System.out.println("Original String"+originalString);
		System.out.println("Reverse String>>>>>>>>>>>-"+reverseString(originalString));
		
	}

	private static String reverseString(String originalString) {
         char arr[] = originalString.toCharArray();
          
         char temp;
         for(int i = 0,j = arr.length-1; i <(arr.length/2);i++,j--){
        	 
        	 temp = arr[i];
        	 arr[i] = arr[j];
        	 arr[j] = temp;
        	 
        			 
        	 
         }
         
         
		return new String(arr);
	} 
}
