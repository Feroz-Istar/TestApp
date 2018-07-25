package user;


import javax.persistence.Embeddable;
@Embeddable
public class Address {
	private String type;
	private String street1;
	private String Street2;
	private Integer pincode;
	private String city;
	private String area;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String type, String street1, String street2, Integer pincode, String city, String area,
			String state) {
		super();
		this.type = type;
		this.street1 = street1;
		Street2 = street2;
		this.pincode = pincode;
		this.city = city;
		this.area = area;
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return Street2;
	}
	public void setStreet2(String street2) {
		Street2 = street2;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
