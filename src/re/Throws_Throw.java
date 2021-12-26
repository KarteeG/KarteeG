package re;

public class Throws_Throw {
	 
	private static void divide() throws Throwable,Exception {
		int a =34;
		System.out.println(a/0);
         throw new Exception();
	}
	
	
	
	

	public static void main(String[] args) throws Throwable, Exception {
		divide();

	}

}
