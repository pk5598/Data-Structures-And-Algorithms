package lambdaExpressions;

import java.io.PrintStream;

@FunctionalInterface
interface Cab{
	//void book();
	
	void book(String source,String destination);
}

public class LambdaApp {
	
	int instanceVar=1000;
	
	static int staticVar=10;

	public static void main(String[] args) {
		
		//zero parameterised lambda expression
		/* Cab cab=()->{
			System.out.println("Uber-Booked");
			
		};
		
		cab.book(); */
		
		
		
		
		//multi parameterised lambda expression
		
		Cab cab=(source,destination)->{
			int localVar=100;
			System.out.println("localVar:"+localVar);
			LambdaApp lapp = new LambdaApp();
			System.out.println("instanceVar:"+lapp.instanceVar);
			System.out.println("StaticVar:"+LambdaApp.staticVar);
			
			System.out.println("Uber-Booked from "+source+" to "+destination);
		};
		
		cab.book("bengaluru","hyderabad");
		

	}

}
