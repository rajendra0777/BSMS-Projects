package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer sid;
	private String name;
	private Double fee;

	public Student() {

	}

	public Student(Integer sid, String name, Double fee) {
		this.sid = sid;
		this.name = name;
		this.fee = fee;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", fee=" + fee + "]";
	}

	
	
}
