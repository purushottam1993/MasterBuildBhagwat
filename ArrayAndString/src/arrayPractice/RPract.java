package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class RPract {

	public static void main(String[] args) {
		int[] ar = {53,545,32,545,84,32,64,43,6,45,422,33,35,5,33,53};
		
		TreeSet treeset = new TreeSet();
		for(int are:ar)
			treeset.add(are);
		
		ArrayList arraylist = new ArrayList(treeset);
		System.out.println("second largest array:"+arraylist.get(arraylist.size()-2));
	}
}

