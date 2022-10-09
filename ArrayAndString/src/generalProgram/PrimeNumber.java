package generalProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		int temp=0; int num=11;
		for(int i=2; i<num; i++) {
				if(num%i==0) {
					temp=temp+1;
			}
		}
				if(temp==0) {
					System.out.println(num+" "+"is prime number");
				}
				else
					System.out.println(num+" "+"is not prime number");
	}
}


