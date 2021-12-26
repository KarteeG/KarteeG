package com.polymorphism;

public class Overriding_Child extends Overriding_Parent {
	private void age(int age) {
		System.out.println(age);
	}
	@Override
	public void name(String name) {
		// TODO Auto-generated method stub
		super.name(name);
	}
	public static void main(String[] args) {
		Overriding_Child s = new Overriding_Child();
		s.name("Ajith");
		s.age(5);
			}
}
