package generalProgram;

public class SwapingTwoNumber {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		System.out.println("Before swaping a: "+a);
		System.out.println("Before swaping b: "+b);
		a=a-b;
		b=b+a;
		a=b/a;
		b=20-b;
		System.out.println();
		System.out.println("After swaping a: "+a);
		System.out.println("After swaping b: "+b);
		
	}
}
