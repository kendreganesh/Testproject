package collection;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {

		ArrayList  list = new ArrayList ();//hetrogeneous data type
		
		list.add(123);
		list.add("Ganesh");
		list.add('*');
		list.add(434.09);
		list.add(1230);
		
		int size = list.size();
		System.out.println("size="+size);
		for (int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
			
			
		}
		list.remove(1);
		System.out.println("===============");
		for (int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
}
}