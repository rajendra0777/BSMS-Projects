package in.ashokit;

public class SonyPrinter implements IPrinter {

	public SonyPrinter() {
		System.out.println("SonyPrinter :: 0 Param Consrutor");
	}
	
	@Override
	public void print() {
		System.out.println("SonyPrinter :: print()");

	}

}
