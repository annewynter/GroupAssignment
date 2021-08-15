package GroupTask;

public class Task4 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?

		int a=20;
		int b=17;
		
		// need to swap
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
	}

}
