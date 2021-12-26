package com.control;

import java.util.Scanner;

public class Case {
	public static void main(String[] args) {
		System.out.println("Enter The Day");
		Scanner s = new Scanner(System.in);
		
		String a = s.nextLine();
		switch(a){
		case "fir":
			System.out.println("First");
			break;
		case "sec":
			System.out.println("Second");
			break;
			default:
			System.out.println("Not");
		}
		s.close();
		}
	}

