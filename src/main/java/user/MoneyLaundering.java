package user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class MoneyLaundering {
	private Integer id;
	private Float price;

	public MoneyLaundering() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MoneyLaundering(Float price) {
		super();
		this.price = price;
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

	@ColumnTransformer(read = "price / 100", write = "? * 100")
	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	

}
