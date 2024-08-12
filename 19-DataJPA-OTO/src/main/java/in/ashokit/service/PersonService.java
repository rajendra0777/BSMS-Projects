package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Passport;
import in.ashokit.entity.Person;
import in.ashokit.repo.PassportRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;
	
	
	public void savePerson() {
		
		Person p = new Person();
		p.setName("Amit Kumar");
		p.setAge(22);
		p.setPhone(123456789);
		
		Passport ps = new Passport();
		ps.setPsNumber("AWD42SJV5NJ72");
		ps.setExpDate(LocalDate.now().plusYears(10));
		
		ps.setPerson(p);
		p.setPassport(ps);
		
		personRepo.save(p);
		
	}
}
