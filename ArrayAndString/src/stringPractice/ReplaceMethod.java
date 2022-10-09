package stringPractice;

public class ReplaceMethod {

	public static void main(String[] args) {
		
    String st = "sasjsjj2q8w2djkj##@^@*WIW@WH88ijjjsoHSdkdsk5845dsd5fhhhasssh267623&^&&&27^&82u2uhjsdG55^*I*D*SS$@Y&J";
	
    st = st.replaceAll("[^A-Za-z0-9]", "");//regex filter the describe set of string. 
    st = st.replaceAll("[0-9]", "");
    System.out.print(st);
	}
}
