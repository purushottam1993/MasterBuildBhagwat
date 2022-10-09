package stringPractice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharinString {

	public static void main(String[] args) {
	String a = "dajksdfhiehalhDNLhlhJlhKBJKVJYklHlihILkjeqbdqdadbJBAKSKBKBDFdwwvbKBDKJGUQEUFGW";
	char[] ar = a.toCharArray();
	
	HashMap<Character,Integer> smap = new HashMap<Character,Integer>();
	//we use collection group here...i.e HashMap because it has facility to provide keys And Values.
	//key=unique thats why we set character=key
	
	for(char str:ar)
		if(smap.containsKey(str))
			smap.put(str, smap.get(str)+1);
		else
			smap.put(str, 1);
	
	Set<Character> keys = smap.keySet();
	for(char key:keys)
		if(smap.get(key)>1)
			System.out.print(key+":"+smap.get(key)+" ");
		
	}
}
