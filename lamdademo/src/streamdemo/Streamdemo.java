package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	
	int id;
	String name;
	Float price;
	
	public Product (int id, String name ,Float price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}
public class Streamdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Dell", 50000f));
		productList.add(new Product(1, "HP", 30000f));
		productList.add(new Product(1, "mac", 100000f));
		productList.add(new Product(1, "Lenovo", 20000f));

		List<Float> productList1 = productList.stream()
				.filter(p -> p.price > 30000)
				.map(p -> p.price)
				.collect(Collectors.toList());
		System.out.println(productList1);
		
	}

}
 