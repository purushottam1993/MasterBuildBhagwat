package arrayPractice;

import java.util.ArrayList;
import java.util.TreeSet;

public class SecondLargestArray {

	public static void main(String[] args) {
		int ar[] = {12,55,26,8,66,74,89,5,6,78,559,9,5,559};
		TreeSet	treeset = new TreeSet();// all the elements from the given collection get stored in treeSet
		//tree set maintain object in sorted order
		for(int are:ar)
			treeset.add(are);
		ArrayList arlist = new ArrayList(treeset);
	//ArrayList in Java is used to store dynamically sized collection of elements
   //Arraylist has no size limit(when new element add they grow their size)
	//We can add duplicate element in ArrayList class..
		System.out.println("second largest array: "+arlist.get(arlist.size()-1));
	}
}
