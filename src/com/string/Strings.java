package com.string;

public class Strings {
	public static void main(String[] args) {
		String a ="Karthick is a Good";
		String b = " Ajith ";
		String c = "";
		
		int length = a.length();
		System.out.println(length);
		
		boolean equals = a.equals("Good");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase("karthick is a good");
		System.out.println(equalsIgnoreCase);
		
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = a.startsWith("K");
		System.out.println(startsWith);
		
		boolean endsWith = a.endsWith("d");
		System.out.println(endsWith);
		
		boolean contains = a.contains("Karthick");
		System.out.println(contains);
		
		int indexOf = a.indexOf("k");
		System.out.println(indexOf);
		
		int lastIndexOf = a.lastIndexOf("o");
		System.out.println(lastIndexOf);
		
		char charAt = a.charAt(2);
		System.out.println(charAt);
		
		String substring = a.substring(8);
		System.out.println(substring);
		
		boolean empty = c.isEmpty();
		System.out.println(empty);
		
		String replace = b.replace("Ajith", "Harsh Ajith");
		System.out.println(replace);
		
		String[] split = a.split(" ");
		for (String string : split) {
			System.out.println(string);
			
		char charAt2 = a.charAt(2);
		System.out.println(charAt);
		
		String trim = b.trim();
		System.out.println(trim);
		
		String concat = a.concat(b);
		System.out.println(concat);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
