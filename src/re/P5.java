package re;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		Scanner  s= new Scanner (System.in);
		System.out.println("Enter The Number");
		int n = s.nextInt();
		int a =0;
		for (int i = 1; i <=n; i++) {
			a=a*10+i;
			System.out.println(a);
			
		}
	}
}

