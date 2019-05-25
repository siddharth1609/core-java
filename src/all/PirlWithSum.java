package all;

public class PirlWithSum {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 8, 8, 8, 8, 8 };
		int sum = 6;

		getPairCount(arr, sum);

	}

	private static void getPairCount(int[] arr, int sum) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length - 1; j++) {

				if (arr[i] + arr[j] == sum) {

					count++;
					System.out.println(">>>>>>>>>>>" + i + "" + j);

				}

			}

		}

	}

}
