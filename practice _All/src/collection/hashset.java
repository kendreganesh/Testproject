package collection;

import java.util.HashSet;

public class hashset{
	public static void main(String[] args) {
	
		HashSet <Integer> set = new HashSet <Integer>();
	    
		set.add(34);
		set.add(765);
		set.add(900);
		set.add(198);
//insertion order is not maintain		
		for (int w:set) {//advance for loop
			System.out.println(w);
			
		}
	}

}
