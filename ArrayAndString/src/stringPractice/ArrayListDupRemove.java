package stringPractice;

import java.util.ArrayList;

public class ArrayListDupRemove {

	public static void main(String[] args) {
		ArrayList<Object> arlst = new ArrayList<Object>();
		arlst.add("java");
		arlst.add("Automation");
		arlst.add("Manual");
		arlst.add("Python");
		arlst.add("java");
		arlst.add("Manual");
		arlst.add("Ruby");
		arlst.add("java");
		arlst.add("Manual");
			
		System.out.println("Before remove dupliate element: "+arlst);
		for(int i=0; i<arlst.size(); i++) {
			for(int j=i+1; j<arlst.size(); j++) {
				if(arlst.get(i).equals(arlst.get(j))) {
					arlst.remove(j);
				    j--;
			}
		}
	}
	System.out.print("after removing duplicate element: "+arlst);
    }
}

		
	

