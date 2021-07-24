package eTradeDemo.business.abstracts;

import eTradeDemo.entities.concrete.Customer;

public interface CustomerService {
	void login(Customer  customer);
	void register(Customer customer);
	
}
