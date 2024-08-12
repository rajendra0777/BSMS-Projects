package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	
	public static void main(String[] args) throws Exception {
		
		App a = new App();
		//a.JavaToJson();
		
			a.jsonToJava();
	}
	
	
	public void JavaToJson() throws Exception{
		
		Customer customer = new Customer(1001, "Amit", 1234560);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), customer);
		System.out.println("Serialization is completed");
		
	}
	
	
	public void jsonToJava()throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		Customer value = mapper.readValue(new File("customer.json"), Customer.class);
		System.out.println(value);
	}

}
