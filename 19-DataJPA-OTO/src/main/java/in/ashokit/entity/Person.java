package in.ashokit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	private String name;
	private Integer age;
	private Integer phone;
	
	
	@OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
	private Passport passport;


	
	
	public Person() {
		super();
	}


	public Integer getPersonId() {
		return personId;
	}


	public void setPersonId(Integer personId) {
		this.personId = personId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getPhone() {
		return phone;
	}


	public void setPhone(Integer phone) {
		this.phone = phone;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	

}
