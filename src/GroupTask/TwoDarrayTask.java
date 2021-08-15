package GroupTask;

public class TwoDarrayTask {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		int [][] num= {
				{12, 65, -25},
				{125, 1, 89, 45},
				{0, 55, 66, 47},
		};
		
		int sum=0;
		for (int i=0; i<num.length%2; i++) {
			for (int j=0; j<num[i].length;j++) {
				sum=sum+num[i][j];
				
			}
			System.out.print(sum+" ");
		}
		
	}

}
