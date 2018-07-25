package association;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class PersonDetail {
	private Integer id;
	private String email;
	private Person person;
	public PersonDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonDetail(String email) {
		super();
		this.email = email;
	}
	public PersonDetail(String email, Person person) {
		super();
		this.email = email;
		this.person = person;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phone_id")
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
