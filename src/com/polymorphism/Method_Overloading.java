package com.polymorphism;

public class Method_Overloading {

	private void Student(String name) {
		System.out.println(name);
	}

	private void Student(int id) {
		System.out.println(id);

	}

	public static void main(String[] args) {
		Method_Overloading s=new Method_Overloading();
		s.Student("Harsh Ajith");
		s.Student(121);
		

	}
}