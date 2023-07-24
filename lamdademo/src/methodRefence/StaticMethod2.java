package methodRefence;

interface Sayable{
	void say();
}

public class StaticMethod2 {
  public static void StaticMethod() {
	  System.out.println("Static  Method 2");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sayable sayable = StaticMethod2::StaticMethod;
       sayable.say();
	}

}
