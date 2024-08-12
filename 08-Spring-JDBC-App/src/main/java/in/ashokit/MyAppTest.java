package in.ashokit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		BookService book = context.getBean(BookService.class);
		book.saveBook();
	}

}
