package com.oops;

public class Child1 extends Child{
	private void Sports() {
		System.out.println("Sports");
	}
	@Override
	public void Dancing() {
		// TODO Auto-generated method stub
		super.Dancing();
	}
	@Override
	public void singing() {
		// TODO Auto-generated method stub
		super.singing();
	}
	public static void main(String[] args) {
		Child1 a = new Child1();
		a.Dancing();
		a.singing();
		a.Sports();

}}
