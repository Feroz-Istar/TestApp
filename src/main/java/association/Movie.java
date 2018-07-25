package association;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Movie {
	private Integer id;
	private String movie_name;
	private Date release_date;
	private BigDecimal box_office_collection;
	private MovieCategory movieCategory;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String movie_name, Date release_date, BigDecimal box_office_collection) {
		super();
		this.movie_name = movie_name;
		this.release_date = release_date;
		this.box_office_collection = box_office_collection;
	}
	
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	public BigDecimal getBox_office_collection() {
		return box_office_collection;
	}
	public void setBox_office_collection(BigDecimal box_office_collection) {
		this.box_office_collection = box_office_collection;
	}
	/*@ManyToOne
	public MovieCategory getCategory() {
		return movieCategory;
	}
	
	public void setCategory(MovieCategory movieCategory) {
		this.movieCategory = movieCategory;
	}*/
	
	@ManyToOne
	public MovieCategory getMovieCategory() {
		return movieCategory;
	}
	public void setMovieCategory(MovieCategory movieCategory) {
		this.movieCategory = movieCategory;
	}
	
	
	
}
