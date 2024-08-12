package in.ashokit;

public class CreditCardPayment implements IPayment{

	
	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: Constructor");
	}
	
	@Override
	public boolean payBill(Double amount) {
		System.out.println("CreditCardPayment :: Impl");
		return true;
	}

}
