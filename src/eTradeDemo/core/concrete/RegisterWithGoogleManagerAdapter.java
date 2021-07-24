package eTradeDemo.core.concrete;

import eTradeDemo.core.abstracts.RegisterService;
import eTradeDemo.entities.concrete.Customer;
import eTradeDemo.google.RegisterWithGoogle;

public class RegisterWithGoogleManagerAdapter implements RegisterService {

	RegisterWithGoogle googleManager = new RegisterWithGoogle();
	@Override
	public void login(Customer customer) {
		googleManager.googleLogin(customer.getEmail(), customer.getPassword());
		System.out.println("Sisteme giriþ yapýldý hoþgeldin " + customer.getCustomerName());
		
	}

	@Override
	public void register(Customer customer) {
		googleManager.googleRegister(customer.getEmail(), customer.getPassword());
		System.out.println("Sevgili, " + customer.getCustomerName() + " Google ile kaydýnýz baþarý ile oluþturulmuþtur.");
		
	}

}
