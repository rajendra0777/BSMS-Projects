package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Customer;

@RestController
public class CustomerRestController {
	
	// ResponseEntity: Get control over the http response
	@GetMapping(value="/customers", produces="Application/json")
	public ResponseEntity<List<Customer>> getAllCostomers(){
		Customer c1 = new Customer(1, "Amit", "amit@gmail.com");
		Customer c2 = new Customer(2,"Aman","aman@gmail.com");
		Customer c3 = new Customer(3,"Ajeet","ajeet@gmail.com");
		
		List<Customer> list = Arrays.asList(c1,c2,c3);
		return new ResponseEntity<List<Customer>>(list,HttpStatus.CREATED);
	}

}
