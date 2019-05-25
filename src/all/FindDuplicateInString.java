package all;

public class FindDuplicateInString {

	public static void main(String[] args) {

		String input = "SIDDHARTHRRRRRRRRRRRR";

		char arr[] = input.toCharArray();

		int coutn = 0;

		for (int i = 0; i < input.length(); i++) {

			for (int j = i + 1; j < input.length(); j++) {
				if (arr[i] == arr[j]) {

					System.out.println(">>>>>>>>>>>>>>>" + arr[j]);

					coutn++;
					System.out.println("count>>>>>>>>>>>" + coutn);
					break;

				}

			}

		}

	}

}
