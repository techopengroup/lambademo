package lamdademo;

public class ClassThread {

	public static void main(String[] args) {

		
		//Without Lambda
		Runnable r1 = new Runnable() {
			public void run() {
			  System.out.println("Hii");
				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		//With lambda
		Runnable r2 =()->{
			System.out.println("Hello");
		};
		
		Thread t2 = new Thread(r2);
		t2.start();
	}
	
}
