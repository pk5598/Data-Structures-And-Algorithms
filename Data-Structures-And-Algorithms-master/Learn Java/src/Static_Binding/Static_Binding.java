package Static_Binding;

import java.awt.print.Printable;

/* 
 * if a method has static,private,final modifier
   then the binding happens at compile time
   (binding means connecting methods to reference variable)
*/

public class Static_Binding extends Static_Binding_Util{
	
	public static void print() {
		System.out.println("In Static_Binding Class");
	}

	public static void main(String[] args) {
		Static_Binding s=new  Static_Binding();
		
		Static_Binding_Util s1= new Static_Binding();
		s.print();
		
		s1.print();
		
		/* 
		 Here object created is not valued here but reference is valued
		 b'coz static methods are binded at compile time only
		*/
		
		

	}

}
