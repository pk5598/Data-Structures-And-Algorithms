package java8;

public class Lambda {

	public static void main(String[] args) {
		LambdaUtil obj;
		obj=(int i)->
		    {
		    	System.out.println("Lambda"+i);
			
		    }; 
		    
		    obj.show(6); 
		
		
	
	}
	
}
