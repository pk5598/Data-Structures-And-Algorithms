package exceptionHandling;

public class TryCatchExample {

	public static void main(String[] args) {
		
		try {
			int i=10/0;
			
		}

		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		
		
		/*
		 * there will be multile catch blocks also
		 */
		try {
			int i=Integer.parseInt("hello");
			
		} catch (NumberFormatException e) {
			System.out.println(e);
			
		} 
		
		finally {
			System.out.println("this block always executes");
		}
		
		/*
		 * A finally block must be associated with a try block,
		 *  you cannot use finally without a try block.
		 *  
		 */
		
		
		/*
		 * throw key word is used to throw an exception
		 */
		
		try {
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("throwed exception because of throw keyword");
		}
		
		/*
		 * throws keyword does not throw exception but
		 * is used to specify there may raise any exception
		 * its used to declare exception
		 */
		
	}

}
