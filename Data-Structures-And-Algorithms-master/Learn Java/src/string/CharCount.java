package string;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] table=new int[26];
		String s="tac cao";
		for (int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    
		    if (c>='a' && c<='z'){
		        table[c-'a']+=1;
		    }
		    
		}
		for (int i=0;i<table.length;i++){
			
			 if (table[i]>0){
		        System.out.println((char)(i+'a')+" "+table[i]);
	         }
			 
		}

	
	
	}

}
