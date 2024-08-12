package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{
	
	@Query("from Student")
	public List<Student> getAllStudentsData();
		
		
	

}
