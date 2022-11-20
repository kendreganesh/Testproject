package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hashmap {
	public static void main(String[] args) {
		HashMap <Integer,String> map = new HashMap<Integer,String> ();
		
		map.put(46, "Jalna");
		map.put(45, "jalna");
		map.put(43, "jalna");
		map.put(null, "pune");
		
		for (Map.Entry<Integer, String>q :map.entrySet()) {
			System.out.println("Key=" +q.getKey() + "value=" +  q.getValue());
		}
		System.out.println("************");
		map.put(12, "Aurangabad");
		for (Map.Entry<Integer, String> q:map.entrySet()) {
		System.out.println("key"+q.getKey()+"value="+q.getValue());
		
	}

}
}