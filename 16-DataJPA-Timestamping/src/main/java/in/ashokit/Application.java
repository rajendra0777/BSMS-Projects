package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.BookService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contex = SpringApplication.run(Application.class, args);
		
		BookService book = contex.getBean(BookService.class);
		
		String saveBook = book.saveBook();
		System.out.println(saveBook);
	}

}
