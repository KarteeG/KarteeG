package com.control;

import java.util.Scanner;

public class Selection {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter The Marks");
		int a = s.nextInt();
		if (a>=50 && a<=100) {
			System.out.println("First");
			
		}
		else if (a>=40 || a<=35) {
			System.out.println("Second");
			
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
