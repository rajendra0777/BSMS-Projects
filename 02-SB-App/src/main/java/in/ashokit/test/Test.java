package in.ashokit.test;

import in.ashokit.dao.UserDao;

public class Test {
	
	public static void main(String[] args) {
		
		UserDao user = new UserDao(40);
		System.out.println(user);
	}

}
