package com.oops;

public class Enscapulation {
	
	private void Student(String name) {
		System.out.println(name);
	}
	private void Student(int id) {
		System.out.println(id);
		
	}
	private void Student(float codeno) {
		System.out.println(codeno);
		
	}
	private void Student(char sec) {
		System.out.println(sec);
	}
	private void Student(short std) {
		System.out.println(std);
		
	}
	public static void main(String[] args) {
		Enscapulation s=new Enscapulation();
		s.Student("Harsh Ajith");
		s.Student(121);
		s.Student(45.454f);
		s.Student('A');
		s.Student(2);
	}

}
