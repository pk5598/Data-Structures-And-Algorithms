package abstraction1;

public class FullImpl extends HalfImpl{
	
	 void method2() {
		 System.out.println("method2 implemented succcessfully");
	 }
	 

	public static void main(String[] args) {
		FullImpl fl=new FullImpl();
		fl.method1();
		fl.method2();
		

	}

}
