package GroupTask;

public class Task6 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
int n=10, firstT=0, secondT=1;

for (int i=0; i<=n; i++) {
	
	System.out.print(firstT+" ");
	
	
	//compute next term
	
	int nextT=firstT+secondT;
	firstT=secondT;
	secondT=nextT;
	
	i++;
}
	}

}
