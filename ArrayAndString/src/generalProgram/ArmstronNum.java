package generalProgram;

public class ArmstronNum {

	public static void main(String[] args) {
		int num=371; int rem;
		int result=0; int temp=num;
		while(temp!=0) {
			rem = temp%10;//1.7.3
			result = result+rem*rem*rem;//1.343.27
			temp = temp/10;//37
		}
		if(result==num)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
	}
}
