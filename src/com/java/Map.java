package com.java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {
	public static void main(String[] args) {
		HashMap<Object,Object> a = new HashMap<Object,Object>();
		       //key    value
		a.put(67,"aswin");
		a.put(99,"murali");
		System.out.println(a);
		System.out.println(a.containsKey(99));
		System.out.println(a.containsValue("praveen"));
		System.out.println(a.get(99));
		System.out.println(a.keySet());
		System.out.println(a.values());
		for (int i = 0; i < a.size(); i++) {
			System.out.println();
		}
		
		
		
	}

}
