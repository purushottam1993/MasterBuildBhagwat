package generalProgram;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=121;
		int rem; int temp=num;
		int result = 0;
		while(temp!=0) {
			
			rem = temp%10;//1.2.1
			result = result*10+rem;//1.12.121
			temp = temp/10;//12.
		}
		if(num==result)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrpone");
	}
}
