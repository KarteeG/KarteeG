package com.typecasting;

public class Up_Child extends Upcast_Parent {
	private void age() {
		System.out.println(40);
	}
	@Override
	public void name() {
		// TODO Auto-generated method stub
		super.name();
	}
	public static void main(String[] args) {
		Upcast_Parent s = new Up_Child();
		s.name();
	}
	

}
