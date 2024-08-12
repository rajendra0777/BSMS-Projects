package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {
	
	@Id
	private Integer bookId;
	private String serialNumber;
	private String name;
	private String subject;
	private String publisher;
	private Double price;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate publishDate;
	
	
	@Column(insertable = false)
	@UpdateTimestamp
	private LocalDate newPublish;
	
	
	private Author author;
	
	

}
