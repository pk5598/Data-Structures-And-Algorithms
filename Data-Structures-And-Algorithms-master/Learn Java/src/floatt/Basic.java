package floatt;

public class Basic {

	public static void main(String[] args) {
		float f= 1.233f;
        
		
		System.out.println(f);
		
		float f1=(float)(Math.round(f*10.0)/10.0);
		
		System.out.println(f1);
		System.out.println(f1+""+"INR");
		System.out.println((float)(Math.round(f*100.0)/100.0));

	}

}
