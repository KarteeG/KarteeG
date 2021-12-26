package com.abstraction;

public class Abs1 extends Abs {
	private void pin() {
		System.out.println(25);
	}
	@Override
	public void salary() {
		// TODO Auto-generated method stub
		super.salary();
	}
	@Override
	public void code() {
		System.out.println(121);
	}
	public static void main(String[] args) {
		Abs1 s = new Abs1();
		s.salary();
		s.code();
		s.pin();
		
		
	}
}
