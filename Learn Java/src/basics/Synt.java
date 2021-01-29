package basics;

public class Synt{
	
	int x=12;
	
	public int filled() {
		int y=21;
		return y;
	}
	public void empty(Synt synt) {
	
		
		System.out.println(synt.filled());
	}
	public static void main(String[] args) {
		//int[5] arr= new int[]{1,2,3};
		
		//System.out.println("hello");
		Synt synt1= new Synt();
		synt1.empty(synt1);
		
	}


}
