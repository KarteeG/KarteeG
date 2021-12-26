package re;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	int n,j;
	Scanner mt = new Scanner(System.in);
	System.out.println("Enter The Table");
	n = mt.nextInt();
	System.out.println("table Upto");
	j = mt.nextInt();
	for (int i = 1; i <=j; i++) {
		int c =n*i;
		System.out.println(i+"*"+n+"+"+c);
		}
		
	}
	
	
}
