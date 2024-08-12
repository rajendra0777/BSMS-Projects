package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
    private StudentRepository studentRepository;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

}
