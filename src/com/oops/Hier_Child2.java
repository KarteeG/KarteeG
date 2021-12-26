package com.oops;

public class Hier_Child2 extends Hier_Parent{
	
	private void Student() {
		System.out.println(12);
	}
	
	public static void main(String[] args) {
		Hier_Child1 s =new Hier_Child1();
		Hier_Child2 a = new Hier_Child2();
		s.Strudentname();
		s.StudentId();
		a.Student();
		a.Strudentname();
		
		
	}

}
