package lambdaExpressions;

@FunctionalInterface
interface Calculator{
	void add(int n1,int n2);
}

class Cal{
	public static void addC(int n1,int n2) {
		System.out.println(n1+n2);
	}
	
	public  void letsAdd(int n1,int n2) {
		System.out.println(n1+n2);
	}
}

//functional interface
interface Messenger{
	Message getMessage(String msg);
}

class Message{
	Message(String msg){
		System.out.println(">> Message is : "+msg);
	}
}

public class MethodRefeApp {

	public static void main(String[] args) {
		
		//Cal.addC(10,20);
		
		/* the method in the Cal class addC is 
		 * mapped to method present in functional interface
		 */
		
		
		//Referring to static method
		Calculator cal=Cal::addC;
		
		cal.add(10,20);
		
		
		////Referring to non static method
		
		Cal cal1=new Cal();
		Calculator calc=cal1::letsAdd;
		
		calc.add(19,20);
		
		
		//Referring to functional interface
		
		Messenger msngr=Message::new;
		msngr.getMessage("Helo");
		
		

	}

}
