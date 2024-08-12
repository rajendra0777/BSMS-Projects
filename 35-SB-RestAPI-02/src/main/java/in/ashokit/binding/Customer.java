package in.ashokit.binding;

public class Customer {
	
	public int id;
	public String name;
	public String email;
	
	
	public Customer() {
		
	}


	public Customer(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	

}
