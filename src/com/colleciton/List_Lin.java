package com.colleciton;

import java.util.LinkedList;
import java.util.List;

public class List_Lin {
	public static void main(String[] args) {
		List<Object> k = new LinkedList<Object>();
		List<Object> l = new LinkedList<Object>();
		l.add("Karhtick");
		l.add(21);
		l.add(200);
		k.add(21);
		k.add(200);
		k.add("Karthick");
		
		int size = l.size();
		System.out.println(size);
		
		Object object = l.get(1);
		System.out.println(object);
		
		Object set = l.set(1,200);
		System.out.println(set);
		System.out.println(l);
		
		Object remove = l.remove(0);
		System.out.println(remove);
		System.out.println(l);
		
		int indexOf = k.indexOf(21);
		System.out.println(indexOf);
		
//		k.clear();
//		System.out.println(k);
		
		boolean addAll = k.addAll(l);
		System.out.println(k);
		
		boolean retainAll = l.retainAll(k);
		System.out.println(l);
		
		boolean removeAll = l.removeAll(k);
		System.out.println(removeAll);
		System.out.println(l);
		
		
		
		
		
		
	}

}
