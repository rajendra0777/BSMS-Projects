package in.ashokit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip64")
public class Chip64Bit implements IChip {

	public Chip64Bit() {
		System.out.println("chip64bit :: Constructor");
	}
	
	@Override
	public boolean process() {
		System.out.println("Chip64bit :: process()");
		return true;
	}

}
