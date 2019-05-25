package all;

public class RemiveDuplicateChrFromTwoString {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "bcse";

		System.out.println("s1 =" + s1 + "s2=" + s2);

		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();

		for (int i = 0; i < arr1.length; i++) {

			boolean bmatch = false;

			for (int j = 0; j < arr2.length; j++) {

				if ((String.valueOf(arr1[i])).toLowerCase().equals((String.valueOf(arr2[i])).toLowerCase())) {
					
					bmatch = true;
					break;

				}

			}
			
			if(bmatch) {
				
				
				s1 = s1.replaceAll(String.valueOf(arr1[i]).toLowerCase(), "");
				s1 = s1.replaceAll(String.valueOf(arr1[i]).toUpperCase(), "");
				s2 = s2.replaceAll(String.valueOf(arr2[i]).toLowerCase(), "");
				s2 = s2.replaceAll(String.valueOf(arr2[i]).toUpperCase(), "");
				
				
			}

		}
		System.out.println("Modified s1 ="+s1+", Modified s2 ="+s2);
		

	}

}
