package in.ashokit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmyAppTest {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student student = context.getBean(Student.class);
		
		System.out.println(student);
	}

}
