package streamdemo;

import java.util.ArrayList;
import java.util.List;

class Productone{
	int id;
	String name;
	float amount;
	
	public Productone(int id,String name , float amount) {
		this.id=id;
		this.name=name;
		this.amount=amount;
	}
}

public class Streamdemo1 {
	public static void main(String[] args) {
		
		List<Productone> product = new ArrayList<Productone>();
		
		product.add(new Productone(1,"Hp",40000f));
		product.add(new Productone(1,"Dell",60000f));
		product.add(new Productone(1,"Lenovo",40000f));
		product.add(new Productone(1,"mac",100000f));
		
		
		product.stream()
                    .filter(p->p.amount == 40000)
                    .forEach(p-> System.out.println(p.name));
	}
	
}
	