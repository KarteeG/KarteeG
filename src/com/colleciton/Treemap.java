package com.colleciton;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {
	
	public static void main(String[] args) {
		Map<Object, Object> m = new TreeMap<Object, Object>();
		m.put(0, 121);
		m.put(1, 200);
		
		int size = m.size();
		System.out.println(m);
		
		Set<Entry<Object,Object>> entrySet = m.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
		}
	}

}
