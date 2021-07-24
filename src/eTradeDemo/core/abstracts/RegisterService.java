package eTradeDemo.core.abstracts;

import eTradeDemo.entities.concrete.Customer;

public interface RegisterService {
	public void login(Customer customer);
	public void register(Customer customer);

}
