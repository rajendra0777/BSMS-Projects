package in.ashokit;

import org.springframework.stereotype.Component;

@Component
public class Chip32Bit implements IChip {
	
	public Chip32Bit() {
		System.out.println("Chip32bit :: constructor");
	}

	@Override
	public boolean process() {
		System.out.println("Chip32Bit :: process()");
		return true;
	}

}
