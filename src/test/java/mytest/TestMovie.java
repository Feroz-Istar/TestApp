package mytest;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.Session;

import association.Movie;
import association.MovieCategory;
import association.Phone;
import association.PhoneDetails;
import util.HibernateUtil;

public class TestMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createMovie();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		MovieCategory movieCategory  = (MovieCategory) session.get("association.MovieCategory", 1);
		for(Movie movie:movieCategory.getMovies()) {
			System.out.println(movie.getMovie_name());
		}
		
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
		
	}

	private static void createMovie() {
		Movie movie1 = new Movie("Kaho na pyar hai ", new Date(), new BigDecimal("19993993"));
		Movie movie2 = new Movie("Kaho na pyar hai111 ", new Date(), new BigDecimal("2393393"));
		MovieCategory movieCategory = new MovieCategory("Bollywood", "india");
		movie1.setMovieCategory(movieCategory);
		movie2.setMovieCategory(movieCategory);

		movieCategory.getMovies().add(movie1);
		movieCategory.getMovies().add(movie2);

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(movieCategory);
		

		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}

}
