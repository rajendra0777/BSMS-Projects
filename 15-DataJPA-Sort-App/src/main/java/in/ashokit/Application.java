package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Students;
import in.ashokit.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentService student = context.getBean(StudentService.class);

		Students s1 = new Students("John", "Doe", "2001-05-15", "johndoe@example.com", "123-456-7890", "123 Elm St",
				"Springfield, IL", "2020-08-20", 3.5);

		Students s2 = new Students("Jane", "Smith", "2000-11-22", "janesmith@example.com", "234-567-8901",
				"456 Oak St, Springfield, IL", "2019-08-20", "Biology", 3.8);

		Students s3 = new Students("Michael", "Johnson", "2002-03-30", "michaeljohnson@example.com", "345-678-9012",
				"789 Pine St, Springfield, IL", "2021-08-20", "Mathematics", 3.2);

		Students s4 = new Students("Emily", "Davis", "2001-07-19", "emilydavis@example.com", "456-789-0123",
				"321 Birch St, Springfield, IL", "2020-08-20", "Chemistry", 3.6);

		Students s5 = new Students("Daniel", "Martinez", "1999-12-05", "danielmartinez@example.com", "567-890-1234",
				"654 Maple St, Springfield, IL", "2018-08-20", "Physics", 3.9);

		Students s6 = new Students("Sophia", "Lopez", "2001-02-10", "sophialopez@example.com", "678-901-2345",
				"987 Cedar St, Springfield, IL", "2020-08-20", "English", 3.4);

		Students s7 = new Students("James", "Wilson", "2002-09-15", "jameswilson@example.com", "789-012-3456",
				"321 Fir St, Springfield, IL", "2021-08-20", "History", 3.3);

		Students s8 = new Students("Olivia", "Garcia", "2000-04-25", "oliviagarcia@example.com", "890-123-4567",
				"654 Spruce St, Springfield, IL", "2019-08-20", "Political Science", 3.7);

		Students s9 = new Students("Ethan", "Clark", "2001-10-10", "ethanclark@example.com", "901-234-5678",
				"987 Palm St, Springfield, IL", "2020-08-20", "Economics", 3.5);

		Students s10 = new Students("Ava", "Rodriguez", "2002-06-05", "avarodriguez@example.com", "012-345-6789",
				"321 Poplar St, Springfield, IL", "2021-08-20", "Sociology", 3.6);

		List<Students> list = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);

//		 String saveData = student.saveData(list);
//
//		 System.out.println(saveData);
//
//		String sortData = student.sortData();
//		System.out.println(sortData);
		
		//student.getAllStudentPagination();
		
		student.getAllStudentFilter();

	}

}
