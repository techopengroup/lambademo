package methodRefence;

public class StaticMethd {
   public static void ThreadMethod() {
	   System.out.println("This is Static Method");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Thread t2 = new Thread(StaticMethd::ThreadMethod);
          t2.start();
	}

}
