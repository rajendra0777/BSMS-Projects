package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentService student = context.getBean(StudentService.class);

		 student.saveStudents();
		// student.getStudent(102);

	//	List<Integer> list = Arrays.asList(102, 103, 104);
		//student.getAllStudents(list);
		
//		String deleteStudent = student.deleteStudent(103);
//		System.out.println(deleteStudent);
		 
		List<String> list = Arrays.asList("104","105","106","107");
		List<Integer> id = list.stream().map(Integer::valueOf).collect(Collectors.toList());
		// String deleteByIds = student.deleteByIds(id);
		// System.out.println(deleteByIds);
		
		
		
	List<Student> allData = student.getAllData();
	
	System.out.print(allData);
	}
	
	

}
