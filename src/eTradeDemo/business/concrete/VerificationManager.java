package eTradeDemo.business.concrete;

import java.util.ArrayList;
import java.util.List;

import eTradeDemo.business.abstracts.CustomerCheckService;
import eTradeDemo.business.abstracts.VerificationService;
import eTradeDemo.entities.concrete.Customer;

public class VerificationManager implements VerificationService {
	List<String> verificatedEmails = new ArrayList<String>();
	CustomerCheckService checkService = new CustomerCheckManager();

	@Override
	public void sendEmail(Customer customer) {
		System.out.println( "Sevgili " + customer.getCustomerName() + ", "+ 
				customer.getEmail() + " Hesabýnýza doðrulamanýz için bir e posta gönderdik :)");
		verifyEmail(customer);
		
	}

	@Override
	public void verifyEmail(Customer customer) {
		verificatedEmails.add(customer.getEmail());
		System.out.println("Hesap baþarý ile doðrulandý seni aramýzda gördüðümüz için mutluyuz");
	}

	@Override
	public boolean isVerificated(Customer customer) {
		if(verificatedEmails.contains(customer.getEmail()) && checkService.isValid(customer)){
			return true;
		}
		else {
			return false;
		}
		
		
	}

}
