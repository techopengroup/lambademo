package methodRefence;


interface Sayable1{
	void say();
}

public class InstanceMethod {
   public void SaySomething() {
	   System.out.println("This is Instance Method");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object 
		InstanceMethod instanceMethod = new InstanceMethod();
		
		//call interface method
		Sayable1 sayable = instanceMethod::SaySomething;
		sayable.say();
		
		//call interface method
		Sayable1 sayable2 = new InstanceMethod()::SaySomething;
		sayable2.say();
	}

}
