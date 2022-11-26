package practicecollection;

import java.util.Hashtable;
import java.util.Map;

public class hashtable {
	public static void main(String[] args) {
		
		Hashtable <Integer,String> table = new Hashtable<Integer,String > ();
		
		table.put(65, "sagar");
		table.put(89, null);
		table.put(56, "karishma");
		table.put(76, "raviraj");
		table.put(54, "sagar");
		
		for(Map.Entry<Integer, String> q:table.entrySet()) {
			System.out.println("key="+q.getKey()+"value ="+q.getValue());
		}
		
	}

}
