package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepo studentRepo;

	public StudentServiceImpl(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	public boolean saveStudent(Student student) {

		Student save = studentRepo.save(student);
		return true;
	}

	@Override
	public Student getStudent(Integer studentId) {

		return null;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer StudentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
