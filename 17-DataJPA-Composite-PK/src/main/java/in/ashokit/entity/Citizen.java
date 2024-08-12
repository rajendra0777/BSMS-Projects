package in.ashokit.entity;

import java.security.PrivateKey;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Citizen {
	
	
	private String name;
	private Integer age;
	private Long phone;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	@EmbeddedId
	private PrimaryKeys pk;
	
	

	public Citizen() {
	
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

	public Long getPhone() {
		return phone;
	}

	public void setPhone(int i) {
		this.phone = phone;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public PrimaryKeys getPk() {
		return pk;
	}

	public void setPk(PrimaryKeys pk) {
		this.pk = pk;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", age=" + age + ", phone=" + phone + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", pk=" + pk + "]";
	}
	
	
	

}
