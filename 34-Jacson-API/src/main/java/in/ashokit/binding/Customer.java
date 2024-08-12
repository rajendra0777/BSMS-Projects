package in.ashokit.binding;

public class Customer {
	
	public Integer id;
	public String name;
	public Integer phone;
	
	

	public Customer() {
		
	}

	public Customer(Integer id, String name, Integer i) {
		
		this.id = id;
		this.name = name;
		this.phone = i;
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	

}
