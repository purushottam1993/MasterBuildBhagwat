package arrayPractice;

public class AscendingArray {

	public static final void main(String[] args) {
		int empty;
		int[] ar = {3,342,54,-6,-45,0,6,50,745,75,23,68,93};
		for(int i=0; i<ar.length;i++) {
			for(int j=i+1; j<ar.length; j++) {
			if(ar[i]>ar[j]) {
				empty=ar[i];
				ar[i]=ar[j];
				ar[j]=empty;
			}
				
		}
	}
		for(int i=0; i<ar.length; i++)
			System.out.print(ar[i]+" ");
}
}
