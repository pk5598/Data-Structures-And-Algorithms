package ira;

public class Exception {
	
	public void process() {
		 throw new ArithmeticException("wrong code");
	}

	public static void main(String[] args) {
		
		Exception ex=new Exception();
		try {
			ex.process();
		}
		
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			
		}

	}

}
