package ira;
import java.util.*;

public class SpudSol {
	
	public static List PrintObject(List<Spud> sp){
		
		
		return sp;
	}
	
	public static List sortObject(List<Spud> sp) {
		Collections.sort(sp,(o1,o2)->o1.getPrice()-o2.getPrice());
		return sp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		List<Spud> sp=new ArrayList<>();
		
		for(int i=0;i<3;i++) {
		    System.out.println("enter details");
			Spud sb=new Spud();
			int price=sc.nextInt();
			sc.nextLine();
			sb.setPrice(price);
			String country=sc.nextLine();
			sb.setCountry(country);
			
			sp.add(sb);
			
		}
		
		
		
		List<Spud> sp1=PrintObject(sp);
		for(Spud sb:sp) {
			System.out.println(sb.getPrice()+" "+sb.getCountry());
		}
		
		List<Spud> sp2=sortObject(sp);
		System.out.println("sorted List based on price");
		for(Spud sb:sp) {
			System.out.println(sb.getPrice()+" "+sb.getCountry());
		}
		
		

	}

}
