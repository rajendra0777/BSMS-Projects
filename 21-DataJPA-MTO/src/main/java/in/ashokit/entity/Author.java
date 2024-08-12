package in.ashokit.entity;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;

@Entity
public class Author {
	
	private Integer authId;
	private String authName;
	private String authPhone;
	private String authGender;
	private Integer authAge;
	
	
	@CreationTimestamp
	private LocalDate registeredDate;
	
	private LocalDate validity;
	
	private List<Books> books; 

}
