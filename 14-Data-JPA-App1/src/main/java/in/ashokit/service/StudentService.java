package in.ashokit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepo;

@Service
public class StudentService {

	private StudentRepo studentRepo;

	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	// Save
	public void saveStudents() {

		// proxy class
		String name = studentRepo.getClass().getName();
		System.out.println(name);

		Student s1 = new Student(101, "Subhash", 500.0);
		Student s2 = new Student(102, "Vinay Parihar", 600.0);
		Student s3 = new Student(103, "Prakasj", 700.0);
		Student s4 = new Student(104, "Venkatesh", 800.0);
		Student s5 = new Student(105, "Aman", 900.0);
		Student s6 = new Student(106, "Madan", 1000.0);
		Student s7 = new Student(107, "Mahendra", 1300.0);
		Student s8 = new Student(108, "Sai", 1200.00);

		List<Student> list = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8);

		studentRepo.saveAll(list);
	}

	// get based on Id
	public void getStudent(Integer id) {

		Optional<Student> student = studentRepo.findById(id);

		if (student.isPresent()) {
			Student s = student.get();
			System.out.println(s);

		} else {
			System.out.println("No recorde available");
		}
	}

	// get based on list
	public void getAllStudents(List<Integer> ids) {

		Iterable<Student> all = studentRepo.findAllById(ids);
		System.out.print(all);
	}

	public String deleteStudent(Integer id) {
		Optional<Student> student = studentRepo.findById(id);
		if (student.isPresent()) {
			studentRepo.deleteById(id);
			return "Record deleted";

		} else {
			return "Record is not available";
		}

	}

	public String deleteByIds(List<Integer> ids) {

		ArrayList<Integer> invalidIds = new ArrayList<>();

		// store invalid ids into list
		for (Integer id : ids) {
			Optional<Student> studets = studentRepo.findById(id);

			if (studets.isEmpty()) {
				invalidIds.add(id);
			}
		}

		// deletion abort with invalid ids

		if (!invalidIds.isEmpty()) {
			String str = invalidIds.stream().map(String::valueOf).collect(Collectors.joining(","));

			return "Entities with ids " + str + " not found. Deletion aborted.";
		}

		// if all ids are valid then delete

		Iterable<Student> deleteById = studentRepo.findAllById(ids);
		studentRepo.deleteAll(deleteById);

		return "Deleted with ids " + ids;
	}

	public void getAllData() {

		List<Student> allStudentsData = studentRepo.getAllStudentsData();
		System.out.println();
	}

}
