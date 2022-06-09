package ira;

public class Practise {
	
	
	public void add(int i,int j) {
		
		System.out.println(i+j);
	}
	

	public static void main(String[] args) {
		
		Practise ps=new Practise();
		ps.add(7,10);
		
		GST g=new GST();
		System.out.println(g.getName());
		System.out.println(g.getAge());
		
		g.setAge(34);
		g.setName("pk");
		
		System.out.println(g.getName());
		System.out.println(g.getAge());

	}

}
