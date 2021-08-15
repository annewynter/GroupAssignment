package GroupTask;

public class Task7 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int [][] num= {
				{1,25,69},
				{157,4,66},
				{879,22,45}
				
				
		};
		
		int largest = num[0][0];
		int smallest = num[0][0];
		
		for (int i=0; i<num.length;i++) {
			for (int j=0;j<num[i].length;j++) {
				if (num[i][j]>largest) {
				largest = num[i][j];
				}
				
			}
			
		}
		System.out.print(largest+" ");
		
		System.out.println();
		
		for (int i=0;i<num.length;i++) {
			for (int j=0; j<num[i].length;j++) {
				if (num[i][j]<smallest) {
					smallest=num[i][j];
				}
				
			}
		}
		
		System.out.println(smallest);
	}

}
