package in.ashokit.entity;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="emps")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eId;
	private String ename;
	private Integer eAge;
	private String eGender;
	private Integer ePhone;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;
	
	
	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	private List<Address> address;


	public Integer geteId() {
		return eId;
	}


	public void seteId(Integer eId) {
		this.eId = eId;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public Integer geteAge() {
		return eAge;
	}


	public void seteAge(Integer eAge) {
		this.eAge = eAge;
	}


	public String geteGender() {
		return eGender;
	}


	public void seteGender(String eGender) {
		this.eGender = eGender;
	}


	public Integer getePhone() {
		return ePhone;
	}


	public void setePhone(Integer ePhone) {
		this.ePhone = ePhone;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	public LocalDate getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	

}
