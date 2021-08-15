package GroupTask;

public class Task5 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?

		int a=22;
		int b=13;
		boolean boo=false;
		
		while (b<=a/2) {
			boo=true;
			break;
		}
		
		b++;
	
	if (!boo) {
		System.out.println(a+" is a prime number");
	}else {
		System.out.println(a+" is not a prime number");
	}
}
}
