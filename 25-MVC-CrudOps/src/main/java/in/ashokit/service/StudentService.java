package in.ashokit.service;

import in.ashokit.entity.Student;

public interface StudentService {
	
	// create
	public boolean saveStudent(Student student);
	
	// retrieve
		public Student getStudent(Integer studentId);
	
	// Update
	public String updateStudent(Student student);
	
	// delete
	public String deleteStudent(Integer StudentId);
	
	
	

}
