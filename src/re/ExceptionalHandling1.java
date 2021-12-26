package re;

public class ExceptionalHandling1 {

	public static void main(String[] args) {
// TYPES OF EXCEPTIONS

		// (1) : ArimeticException

//		int a =24;
//		System.out.println(a/0);
//		// java.lang.ArithmeticException

		// (2) : NullPointerException
//		
//		String s =null;
//		System.out.println(s.length());
		// java.lang.NullPointerException

//IndexOutofBoundException has two Types.(1)ArrayIndexOutOfBound;(2)StringIndexOutOfBound

		// (3) : StringIndexOutOfBoundException

//		 String r= "Coding";
//		 System.out.println(r.charAt(8));
		// java.lang.StringIndexOutOfBoundsException
		// String index out of range: 8

		// (4) : ArrayIndexOutOfBoundException

//		int a[]=new int [4];
//	    System.out.println(a[6]);
		// java.lang.ArrayIndexOutOfBoundsException: 6

		// (5) : NumberFormatException

//		String s = "java";
//		int b = Integer.parseInt(s);
//		System.out.println(b);
//java.lang.NumberFormatException: For input string: "java"at java.lang.Number

		int z = 19;
		try {
			System.out.println(z / 0);
		} catch (ArithmeticException e) {

			e.printStackTrace();
			System.out.println("We Can't divide a Number by Zero");

		} catch (Exception e) {
			System.out.println("We can divide a Number by Number");
		} finally {
			System.out.println("This is finally Block");
		}

	}

}