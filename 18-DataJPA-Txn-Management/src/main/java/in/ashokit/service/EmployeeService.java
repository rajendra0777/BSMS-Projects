package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddressRepo;
import in.ashokit.repo.EmployeeRepo;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private AddressRepo addRepo;
	
	
	@Transactional(rollbackOn = Exception.class)
	public void saveEmployee() {
		Employee e = new Employee();
		
		e.setName("Dhoni");
		e.setValue(100.00);
		
		// save employee
		Employee emp = empRepo.save(e);
		
		System.out.println("Emp Record Saved");
		
		Address add = new Address();
		
		add.setAddress("Ammerpet, Hyderabad");
		
		add.setEid(emp.getEid());
		
		// save address
		
		int i = 10/0;
		Address save = addRepo.save(add);
		
		System.out.println("Addres Record Saved");
		
		
	}
	
}
