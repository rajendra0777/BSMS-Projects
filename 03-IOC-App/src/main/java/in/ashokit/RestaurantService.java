package in.ashokit;

public class RestaurantService {

	//field injection
	IPayment payment;

	
	//constructor
	public RestaurantService() {
		System.out.println("RestaurantService :: Construcotor");
	}

	
	//setter injection
	public void setPayment(IPayment payment) {
		System.out.println("RestaurantService : Setter Injection ");
		this.payment = payment;
	}



	public void PaymentBill(Double amount) {
		boolean status = payment.payBill(amount);
		
		if(status) {
			System.out.println("Payment successfull");
		}else {
			System.out.println("Payment failed");
		}
	}
	
}
