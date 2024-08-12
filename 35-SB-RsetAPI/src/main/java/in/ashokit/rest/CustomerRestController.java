package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	// Query Parameter
	@GetMapping("/welcome")
	public String getWelcomeMsg(@RequestParam("name")String name) {
		String msg = "Hey! "+name+", Wolcome the the SR Digitals World.";
		return msg;
	}

	//Path Parameter
	@GetMapping("/greet/{name}")
	public String getGreetMsg(@PathVariable("name") String name) {
		String msg = "Hii Mr/Ms "+name+". Good Morning. Have a great day!";
		return msg;
	}
	
	// customize http response
	
	@GetMapping(value="/custome", produces="text/plain")
	public ResponseEntity<String> getCustomeResponse(){
		
		String msg = "Welcome to the era of this customized response";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
}
