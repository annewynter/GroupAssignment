package GroupTask;

public class Task3 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will
		// calculate the sum of  even and odd numbers for that array.

		int[][] num = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 21, 23, 35 }, };

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					sumEven += num[i][j];
				} else if (num[i][j] % 2 != 0) {
					sumOdd += num[i][j];
				}

			}

		}

		System.out.println(sumEven);
		System.out.println();
		System.out.println(sumOdd);
	}

}
