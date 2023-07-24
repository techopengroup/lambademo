package functnalInfc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieDemo {
	public static void main(String[] args) {
		
		List<Movie> movieList = new ArrayList<Movie>();
		
		Movie movie1 = new Movie();
		movie1.setMovieName("Varisu");
		movie1.setActorName("Vijay");
		movie1.setYear(2023);
		
		Movie movie2 = new Movie();
		movie2.setMovieName("Vikram");
		movie2.setActorName("Surya");
		movie2.setYear(2022);
		
		movieList.add(movie1);
		movieList.add(movie2);
		
		//call interface methods
		findMovie2023(movieList);
		findMovieByActor(movieList);
		findMovieByMovie(movieList);
		
		//call generic methods
		getMovies(movieList, m-> m.getYear()==2023);
		getMovies(movieList, m-> m.getActorName()=="Surya");
		getMovies(movieList, m-> m.getActorName().equalsIgnoreCase("Vijay"));
		
		
	}
	
	//interface method created by year
	private static void findMovie2023(List<Movie> movieList) {
		for (Movie movie :movieList) {
			if(movie.getYear()==2023) {
				System.out.println(movie.getMovieName());
			}
		}
		
	}
	//interface method created by actor
	private static void findMovieByActor(List<Movie> moviesList) {
		for(Movie movie : moviesList) {
		//	if(movie.getActorName()=="Surya") {
				if(movie.getActorName().equalsIgnoreCase("Surya")){
				System.out.println(movie.getMovieName());
			}
		}
	}

	private static void findMovieByMovie(List<Movie> movList) {
		for(Movie movie : movList) {
			if(movie.getMovieName()=="Varisu");
			System.out.println(movie.getMovieName());
		}
	}
	
	
	//generic method
	private static void getMovies(List<Movie> moviList,Predicate<Movie> moviePredicates) {
		for (Movie movie : moviList) {
			if(moviePredicates.test(movie));
			System.out.println(movie.getMovieName());
		}
	}
	
}
