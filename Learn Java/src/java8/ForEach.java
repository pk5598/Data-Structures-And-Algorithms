package java8;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<Integer> vaList=Arrays.asList(1,2,3,4);
		 
	    /*for (Integer val : vaList) {
	    	System.out.println(val );
			
		}
		*/
		vaList.forEach(i-> System.out.println(i));
	    
				
	}

}
