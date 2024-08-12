package in.ashokit;

public class DebitCardPayment implements IPayment{
	
	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: Constructor");
	}

	@Override
	public boolean payBill(Double amount) {
		System.out.println("Debit card payment processing...");
		return true;
	}

}
