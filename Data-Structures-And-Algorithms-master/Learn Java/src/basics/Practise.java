package basics;



import java.util.*;

public class Practise {
	
	

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    String input1="hello{hi}";
	    String result="error";
	    int check=0;
	    
	    Stack<Character> st=new Stack<>();
	    
	    for(int i=0;i<input1.length();i++) {
	    	if (input1.charAt(i)=='{') st.add('{');
	    	else if(input1.charAt(i)=='}') {
	    		if(st.isEmpty()==true) {
	    		    check =1;
	    			break;
	    		}
	    		else {
	    			st.pop();
	    		}
	    		
	    	}
	    		
	    	
	    }
	    
	    if(st.isEmpty()==true && check!=1) System.out.println("correct");
    	else {
    		
    		System.out.println(result);
    	}
	    		
	    		
	
	}

	


	}


