package com.oops;

public class S_Child extends Single_Parent{
	
	private void salary() {
		System.out.println(85000);
	}
	@Override
	public void name() {
		// TODO Auto-generated method stub
		super.name();
	}
	@Override
	public void age() {
		// TODO Auto-generated method stub
		super.age();
	}
	public static void main(String[] args) {
		S_Child s=new S_Child();
		s.name();
		s.age();
		s.salary();
	}
}
