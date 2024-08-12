package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="emps")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;

	private String name;
	private Double value;
	
	
	
	
	public Employee() {
		
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", value=" + value + "]";
	}
	
	
	
	

}
