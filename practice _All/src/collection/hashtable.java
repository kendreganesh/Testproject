package collection;

import java.util.Hashtable;
import java.util.Map;

public class hashtable {
	public static void main(String[] args) {
		Hashtable <Integer,String> map = new 	Hashtable <Integer,String> ();
		map.put(45, "pune");
        map.put(56, "Mumbai");
        map.put(67, "api");
        map.put(null, "Delhi");
        map.put(89, "maharshtra");
        
        for(Map.Entry<Integer, String> q:map.entrySet()) {
        	System.out.println("key="+q.getKey()+"value="+q.getValue());
        }
	
	
	}

}
