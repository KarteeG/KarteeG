package com.variables;

public class Variable {
	
	static byte a = 121;
	short b = 1021;
	static String d = "Karthick";
	private void no() {
		int c = 121;
		System.out.println(c);
	}
	private void sec() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		Variable s = new Variable();
		System.out.println(a);
		System.out.println(d);
		s.no();
		s.sec();
	}
	
	
	
	

}
