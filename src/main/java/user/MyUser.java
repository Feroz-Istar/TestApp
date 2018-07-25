package user;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import variety.UserType;

@Entity
public class MyUser {
	private Integer id;
	private String email;
	

	private UserType userType;
	
	private Date timestamp;
	private Date updatedOn;

	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyUser( String email) {
		super();
		this.email = email;
	}
	
	
	
	public MyUser(String email, UserType userType) {
		super();
		this.email = email;
		this.userType = userType;
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

	@Enumerated(EnumType.STRING)
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	@Column(name = "`timestamp`")
	@CreationTimestamp
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	@Column(name = "updated_on")
	@UpdateTimestamp
	public Date getUpdatedOn() {
		return updatedOn;
	}
	

	
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}
