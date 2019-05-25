package all;

public class FindMissing1to100 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		int number = getMissingNumber(arr);
		System.out.println(">>>>>>>>" + number);

	}

	private static int getMissingNumber(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			if (arr[i] != (i + 1)) {
				return i + 1;

			}

		}

		return n + 1;
	}

}
