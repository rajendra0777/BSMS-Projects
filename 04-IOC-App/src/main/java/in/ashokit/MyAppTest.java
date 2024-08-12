package in.ashokit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Service bean = context.getBean(Service.class);
		String namebById = bean.getNamebById(100);
		System.out.println(namebById);
	}

}
