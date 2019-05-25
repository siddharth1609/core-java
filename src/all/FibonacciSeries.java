package all;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 15;
		generateFibonnaciSeries(n);
	}

	private static void generateFibonnaciSeries(int n) {

		int first = 0;
		int second = 1;
		int temp;
		for (int i = 0; i < n; i++) {

			temp = first + second;
			first = second;
			second = temp;
			System.out.println(temp + "");

		}

	}

}
