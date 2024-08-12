package in.ashokit.entity;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Students")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String email;
	private String phoneNumber;
	private String address;
	
	@CreationTimestamp
	private String enrollmentDate;
	private String major;
	private Double gpa;
	
	
	
	
	public Students() {
		
	}


	public Students(String firstName, String lastName, String dateOfBirth, String email,
			String phoneNumber, String address, String enrollmentDate, String major, Double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.enrollmentDate = enrollmentDate;
		this.major = major;
		this.gpa = gpa;
	}
	
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
	
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", enrollmentDate=" + enrollmentDate + ", major=" + major + ", gpa=" + gpa + "]";
	}
	
	
}
