package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
	@GetMapping("/welcome")
	public ModelAndView getData() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to the MVC Module");
		mav.setViewName("index.html");
		return mav;
	}

}
