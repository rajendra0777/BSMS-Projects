package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddressRepo;
import in.ashokit.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	
	private EmployeeRepo empRepo;
	
	private AddressRepo addRepo;

	
	// save
	public EmployeeService(EmployeeRepo empRepo, AddressRepo addRepo) {
		this.empRepo = empRepo;
		this.addRepo = addRepo;
	}
	
	public void saveEmployee() {
		
		Employee emp = new Employee();
		emp.seteId(1);
		emp.setEname("Amit Kumar");
		emp.seteAge(23);
		emp.seteGender("Male");
		emp.setePhone(123456789);
		
		Address a1 = new Address();
		a1.setAddId(1);
		a1.setAddType("Work Address");
		a1.setCity("Hyderabad");
		a1.setState("Telangana");
		a1.setFullAddress("SR Nagar, Hyderabad");
		
		
		Address a2 = new Address();
		a2.setAddId(2);
		a2.setAddType("Permanent Address");
		a2.setCity("Jabalpur");
		a2.setState("Madhya Pradesh");
		a2.setFullAddress("DeenDayal Bus Stand, Jabalpur");
		
		List<Address> addList = Arrays.asList(a1,a2);
		
		emp.setAddress(addList);
		a1.setEmployee(emp);
		a2.setEmployee(emp);
		
		empRepo.save(emp);
	}
	
	
	
	
	

}
