package com.stringtypes;

public class Immutable {
	public static void main(String[] args) {
		
	
	StringBuffer s = new StringBuffer("Karthick");
	StringBuffer t = new StringBuffer("Karthick");
	
	int identityHashCode = System.identityHashCode(s);
	System.out.println(identityHashCode);
	
	int identityHashCode2 = System.identityHashCode(t);
	System.out.println(identityHashCode2);
	
	StringBuffer append = s.append(t);
	System.out.println(append);
	
	int identityHashCode3 = System.identityHashCode(append);
	System.out.println(identityHashCode3);


}
}