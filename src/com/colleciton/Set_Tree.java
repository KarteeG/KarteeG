package com.colleciton;

import java.util.Set;
import java.util.TreeSet;

public class Set_Tree {
	
	public static void main(String[] args) {
		Set<Object> s = new TreeSet<Object>();
		s.add(10);
		s.add(11);
		s.add(45);
		s.add(78);
		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);
		
		boolean remove = s.remove(10);
		System.out.println(remove);
		
		boolean contains = s.contains(11);
		System.out.println(contains);
		
		Set<Object> k = new TreeSet<Object>();
		k.add(10);
		k.add(45);
		System.out.println(k);
		
		boolean addAll = s.addAll(k);
		System.out.println(s);
		
		boolean retainAll = s.retainAll(k);
		System.out.println(retainAll);
		
		
		
		
	}

}
