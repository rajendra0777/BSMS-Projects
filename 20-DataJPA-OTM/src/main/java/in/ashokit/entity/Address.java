package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="emps_add")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addId;
	private String addType;
	private String city;
	private String state;
	private String fullAddress;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate createDate;
	
	@Column(insertable = false)
	@UpdateTimestamp
	private LocalDate UpdatedDate;
	
	@ManyToOne
	@JoinColumn(name="eId")
	private Employee employee;

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public String getAddType() {
		return addType;
	}

	public void setAddType(String addType) {
		this.addType = addType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		UpdatedDate = updatedDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

	
}
