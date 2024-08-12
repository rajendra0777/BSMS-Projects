package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {

	private UserDao userDao;

	
//	@Autowired
//	public UserService() {
//
//		System.out.println("UserService :: 0- Param constructor");
//		}
//	
	@Autowired
	public UserService(UserDao userDao) {

		System.out.println("UserService :: Param constructor");

		this.userDao = userDao;
	}


//	@Autowired
//	public void setUserDao(UserDao userDao) {
//		System.out.println("UserService :: Setter");
//		this.userDao = userDao;
//	}

	public void userService() {
		String age = userDao.getAge(44);
		System.out.println("User Name: " + age);
	}

}
