package interface_exmpl;

public class Interface_Implementation implements Interface_Example {
    
	@Override
	public void run() {
		System.out.println("yes ur running");
		
	}
	
	public static void main(String[] args) {
		Interface_Example i=new Interface_Implementation();
		i.run();

	}

	

}
