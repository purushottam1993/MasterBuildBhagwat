package arrayPractice;

public class DuplicateArray {

	public static void main(String[] args) {
	int[] ar = {1,2,2,4,6,4,6,8,3,9};
	for(int i=0; i<ar.length; i++) {
		for(int j=i+1; j<ar.length; j++) {
			if(ar[i]==ar[j]) 
				System.out.println(ar[i]);
				
		  	}
	   	}
   	}
	
}
