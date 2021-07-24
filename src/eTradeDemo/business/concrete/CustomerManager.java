package eTradeDemo.business.concrete;

import eTradeDemo.business.abstracts.CustomerCheckService;
import eTradeDemo.business.abstracts.CustomerService;
import eTradeDemo.business.abstracts.VerificationService;
import eTradeDemo.dataAccess.abstracts.CustomerProductDao;
import eTradeDemo.entities.concrete.Customer;

public class CustomerManager implements CustomerService{
	CustomerCheckService customercheckService;
	CustomerProductDao customerProductDao;
	VerificationService verificationService;
	
	
	public CustomerManager(CustomerCheckService customercheckService, CustomerProductDao customerProductDao,
			VerificationService verificationService) {
		
		this.customercheckService = customercheckService;
		this.customerProductDao = customerProductDao;
		this.verificationService = verificationService;
	}
	

	@Override
	public void login(Customer customer) {
		if(verificationService.isVerificated(customer)) {
			System.out.println("Sisteme giriþ yapýldý hoþgeldin, " + customer.getCustomerName());
			System.out.println("------------------------------------------------------------------------------------------------");
		}
		else {
			System.out.println("Sisteme giriþ yapýlamadý. Lütfen bilgilerinizi kontrol edin.");
			System.out.println("-------------------------------------------------------------------------------------------------");
		}
		
	}

	@Override
	public void register(Customer customer) {
		if(customercheckService.isValid(customer)) {
			verificationService.sendEmail(customer);
			System.out.println("kullanýcý sisteme eklendi : " + customer.getCustomerName() + " "+ 
			customer.getCustomerLastName());
			customerProductDao.customerRegister(customer);
			
		}
		else {
			System.out.println("Kayýt baþarýsýz oldu");
		}
		
	}


}
