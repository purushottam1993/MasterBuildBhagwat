package stringPractice;

public class PrintWelComeToJava {

	public static void main(String[] args) {
		String st ="WELCOMETOJAVA";
		int a=3;
		for(int i=0; i<st.length()-a;i++) {
			for(int j=i; j<i+3;j++) {
				System.out.print(st.charAt(j));
			}
			System.out.println();
		}
	}
	}

