package in.ashokit.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	public String getAge(int age) {
		if(age==40) {
			return "Smith";
		}
		return "Steven";
	}

}
