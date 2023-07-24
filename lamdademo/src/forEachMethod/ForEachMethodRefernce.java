package forEachMethod;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodRefernce {
	
	public static void main(String[] args) {
		List<String> gameList = new ArrayList<String>();
		
		gameList.add("HandBall");
		gameList.add("VolleyBall");
		gameList.add("Chess");
		gameList.add("Cricket");
		
		gameList.stream().forEachOrdered(System.out::println);
		
	}

}
