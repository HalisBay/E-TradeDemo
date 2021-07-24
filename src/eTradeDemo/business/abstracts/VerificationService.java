package eTradeDemo.business.abstracts;

import eTradeDemo.entities.concrete.Customer;

public interface VerificationService {
	void sendEmail(Customer customer);
	void verifyEmail(Customer customer);
	boolean isVerificated(Customer customer);

}
