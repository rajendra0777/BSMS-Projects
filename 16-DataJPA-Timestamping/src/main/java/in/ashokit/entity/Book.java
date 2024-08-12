package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double price;

	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;

	@Column(insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;

	public Book() {

	}

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Book(String name, Double price) {

		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
