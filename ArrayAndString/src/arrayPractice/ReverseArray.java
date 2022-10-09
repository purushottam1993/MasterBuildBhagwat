package arrayPractice;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = {33,4,42,95,84,30,9,84,5};
	
		for(int i=array.length-1; i>=0; i--)
			System.out.print(array[i]+" ");
	}
}
