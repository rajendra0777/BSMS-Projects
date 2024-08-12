package in.ashokit.dao;

public class UserDao {
	
	private int age =20;

	public UserDao(int age) {
	
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDao [age=" + age + "]";
	}
	
	

}
