package in.ashokit;

public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {

		System.out.println("UserDaoImpl :: Constructor");
	}

	@Override
	public String findName(int id) {
		if (id == 100) {

			return "Raja";
		}

		else if (id == 101) {

			return "Rani";
		}
		return null;
	}
}
