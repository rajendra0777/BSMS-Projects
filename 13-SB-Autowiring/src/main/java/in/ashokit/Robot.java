package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	@Autowired
	@Qualifier("chip64")
	private IChip iChip;

	public Robot() {

		System.out.println("Robot :: Constructor");

	}
	
	public void doWork() {
		boolean status = iChip.process();
		
		
		if(status) {
			System.out.println("working");
		}else
		System.out.println("Failed to do work");
	}

}
