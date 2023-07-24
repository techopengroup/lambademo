package forEachMethod;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambdaExpression {
   public static void main(String[] args) {
	
	   List<String> gameList = new ArrayList<String>();
	   
	   gameList.add("HandBall");
	   gameList.add("VollyBall");
	   gameList.add("Chess");
	   gameList.add("Criket");
	   
	   gameList.stream().forEachOrdered(games-> System.out.println(games));
	   
  }
   
}
