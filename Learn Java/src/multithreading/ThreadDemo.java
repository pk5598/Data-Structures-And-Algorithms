package multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// upto now we only have main thread
		
		MyThread mt=new MyThread();// create child thread
		mt.start();// starting the child thread
		for (int i=0;i<5;i++) {
		    System.out.println("main thread");
		}
		

	}

}
