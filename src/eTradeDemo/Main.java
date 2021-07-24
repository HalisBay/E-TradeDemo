package eTradeDemo;

import eTradeDemo.business.concrete.CustomerManager;
import eTradeDemo.business.concrete.VerificationManager;
import eTradeDemo.core.abstracts.RegisterService;
import eTradeDemo.core.concrete.RegisterWithGoogleManagerAdapter;
import eTradeDemo.dataAccess.concrete.HibernateCustomerDao;
import eTradeDemo.business.concrete.CustomerCheckManager; 
import eTradeDemo.entities.concrete.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Halis", "Bay", "01234567890", "mail@hotmail.com", "123456x");
		Customer customer2 = new Customer(2, "Halis2", "Bay", "01234567890", "mail2@hotmail.com", "123456x");
		Customer customer3 = new Customer(3, "Halis3", "bay", "01234567890", "mail3@hotmail.com", "123456x");
		
		CustomerManager customerManager = new  CustomerManager(new CustomerCheckManager(),
				new HibernateCustomerDao(), new VerificationManager());
		
		customerManager.register(customer1);
		customerManager.login(customer1);
		customerManager.register(customer3);
		customerManager.login(customer3);
		
		RegisterService registerService = new RegisterWithGoogleManagerAdapter();
		registerService.register(customer2);
		registerService.login(customer2);
		
	}

}
