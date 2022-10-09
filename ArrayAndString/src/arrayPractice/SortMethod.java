package arrayPractice;

import java.util.Arrays;

public class SortMethod {

	public static void main(String[] args) {
		int[] array = {3,342,54,-6,-45,0,6,50,745,75,23,68,93};
		
		Arrays.sort(array);
		for(int i=0; i<array.length;i++)
			System.out.print(array[i]+" ");
		
		System.out.println();
		
		for(int i=array.length-1; i>=0; i--)
			System.out.print(array[i]+" ");
   }
}
