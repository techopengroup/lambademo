package collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id, String name ,float price) {
		
		this.id=id;
		this.name=name;
		this.price=price;
	}
		
	
}


public class ListofCollectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Product> productList = new ArrayList<Product>(); 
     
     productList.add(new Product(1, "HP", 50000));
     productList.add(new Product(1, "Dell", 50000));
     productList.add(new Product(1, "Asis", 60000));
     productList.add(new Product(1, "Lenovo", 40000));
     productList.add(new Product(1, "mac", 100000));

     List<Float> productLists = productList.stream()
    		                     .map(p->p.price)
    		                     .collect(Collectors.toList());
     System.out.println(productLists);
     
	}

}
