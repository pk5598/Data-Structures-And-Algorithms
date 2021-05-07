package dynamic_binding;

public class Dynamic_binding extends Dynamic_binding_util{
	
	public void print() {
		System.out.println("in dynamic binding method");
		
	}

	public static void main(String[] args) {
		
		Dynamic_binding_util s=new Dynamic_binding();
		s.print();
		Dynamic_binding_util s1=new Dynamic_binding_util();
		s1.print();
		
		// since the print method is not static....there is no 
		// chance of compile time polymorphism
		//things happen in run time polymorphism
		//if print method is static then the result would be the parent class method
		// here  overiding is taking place 
		//static metehods cant be overridden
		
		

	}

}
