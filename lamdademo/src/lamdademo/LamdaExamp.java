package lamdademo;

import java.util.ArrayList;
import java.util.List;

public class LamdaExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> nameList = new ArrayList<>();
         
         
         //add some name list
         nameList.add("Name 1");
         nameList.add("Name 2");
         nameList.add("Name 3");
         nameList.add("Name 4");
         
         //using lambda function
         nameList.forEach((name)-> System.out.println(name));
	}

}
