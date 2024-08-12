package in.ashokit;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee bean = context.getBean(Employee.class);
		
		bean.doWork();
		context.close();
	}

}
