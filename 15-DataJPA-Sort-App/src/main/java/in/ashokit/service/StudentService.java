package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Students;
import in.ashokit.repo.StudentRepo;

@Service
public class StudentService {

	private StudentRepo studentRepo;

	public StudentService(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	public String saveData(List<Students> students) {

		List<Students> allStudents = studentRepo.saveAll(students);

		if (!allStudents.isEmpty()) {
			return "Record saved..";
		} else {
			return "Failed to save record";
		}
	}

	public String sortData() {

		Sort sort = Sort.by("firstName", "studentId").descending();

		List<Students> all = studentRepo.findAll(sort);

		if (!all.isEmpty()) {

			all.forEach(e -> System.out.println(e));

			return "Record printed on the console";
		} else {
			return "No record found";
		}

	}

	public void getAllStudentPagination() {

		int pageSize = 5;
		int pageNumber = 2; // It will come from UI, 0 == means 1.

		Students s = new Students();

		PageRequest pg = PageRequest.of(pageNumber-1, pageSize);

		Page<Students> page = studentRepo.findAll(pg);

		List<Students> student = page.getContent();

		student.forEach(e -> System.out.println(e));

	}

	
	public void getAllStudentFilter() {
		
		Students entity = new Students();
		
		//entity.setFirstName("James");
		entity.setGpa(3.2);
		
		Example<Students> of = Example.of(entity);
		
		List<Students> all = studentRepo.findAll(of);
		
		all.forEach(e-> System.out.println(e));
				
				
	}
}
