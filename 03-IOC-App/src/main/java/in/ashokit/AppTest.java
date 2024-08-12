package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	
public static void main(String[] args) {
	
	// for xml based config
	ClassPathXmlApplicationContext cnxt = new ClassPathXmlApplicationContext("spring-bean.xml");

	RestaurantService rs1 = cnxt.getBean(RestaurantService.class);
	
	
	// for annotation based config
	//new AnnotationConfigApplicationContext("");
	
	
	rs1.PaymentBill(1200.0);
	
}
}
