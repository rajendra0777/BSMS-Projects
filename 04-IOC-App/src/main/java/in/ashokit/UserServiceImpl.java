package in.ashokit;

public class UserServiceImpl implements Service {
	
	private UserDao dao;

	public UserServiceImpl() {
		System.out.println("Userservice impl :: 0 Param constructor");
		
	}

	public UserServiceImpl(UserDao dao) {
		System.out.println("UserServiceImpl :: param constructor");
		
		this.dao = dao;
	}
	

	
	
	public void setDao(UserDao dao) {
		
		System.out.println("UserServiceImpl :: setter injection");
		this.dao = dao;
	}

	@Override
	public String getNamebById(int id) {
		return	dao.findName(id);
		
	}

	
	

	

}
