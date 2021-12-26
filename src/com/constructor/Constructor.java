package com.constructor;

public class Constructor {
	
	public Constructor() {
		System.out.println("Run Automatically");
	}
	public Constructor(int no) {
		this();
		System.out.println(no);
		
	}
	public Constructor(char sec) {
		System.out.println(sec);
	}
	public static void main(String[] args) {
		Constructor a= new Constructor('A');
		Constructor b = new Constructor(45);
		
	}

}
