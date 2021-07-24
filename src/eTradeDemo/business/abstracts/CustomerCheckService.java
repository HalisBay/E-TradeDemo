package eTradeDemo.business.abstracts;

import eTradeDemo.entities.concrete.Customer;

public interface CustomerCheckService {
	 boolean checkCustomerName(Customer customer);
	 boolean checkCustomerLastName(Customer customer);
	 boolean checkPhoneNumber(Customer customer);
	 boolean checkEmail(Customer customer);
	 boolean checkPassword(Customer customer);
	 boolean isNewEmail(Customer customer);
	 boolean isValid(Customer customer);
	

}
