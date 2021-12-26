package com.abstraction;

public class Inter_Child2 implements Inter_Parent,Inter_Child1 {

	@Override
	public void name() {
		System.out.println("Karthick");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void age() {
		System.out.println(32);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salary() {
		System.out.println(850000);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pin() {
		System.out.println(154.454f);
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Inter_Child2 s = new Inter_Child2();
		s.name();
		s.salary();
		s.pin();
		s.age();
		
	}

}
