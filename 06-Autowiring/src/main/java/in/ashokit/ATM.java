package in.ashokit;

public class ATM {
	
	private IPrinter printer;
	
	public ATM() {
		System.out.println("Atm :: 0 Param Constructor");
	}

	public ATM(IPrinter printer) {
	System.out.println("ATM :: param constructor");
		this.printer = printer;
	}

	public void setPrinter(IPrinter printer) {
		System.out.println("ATM :: setter ()");
		this.printer = printer;
	}
	
	
	public void withdraw() {
		System.out.println("Printer - ATM :: withdraw ()");
		printer.print();	
	}

}
