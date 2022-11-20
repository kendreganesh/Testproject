package collection;

import java.util.ArrayList;

public class ArrayHomogeneous {
	public static void main(String[] args) {
		
		ArrayList<Integer>  list = new 	ArrayList<Integer>();
		list.add(987);
		list.add(456);
		list.add(789);
		int size = list.size();
		System.out.println("size="+size);
	     for (int i=0;i<list.size();i++) {
	    	 System.out.println(list.get(i));
	     }
	     System.out.println("====================");
	     list.remove(1);
	     for (int i=0; i<list.size();i++) {
	    	 System.out.println(list.get(i));
	     }

	   
	
	}

}
