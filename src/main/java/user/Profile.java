package user;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import util.Gender;
import util.GenderConverter;

@Entity
public class Profile {
	private Integer id;
	private String name;
	private String email;
	private Integer age;
	private Address address;
	public Gender gender;
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(String name, String email, Integer age, Gender gender, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.address = address;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	@Convert( converter = GenderConverter.class )
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
