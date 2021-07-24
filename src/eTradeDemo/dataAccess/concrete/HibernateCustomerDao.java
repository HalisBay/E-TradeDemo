package eTradeDemo.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import eTradeDemo.dataAccess.abstracts.CustomerProductDao;
import eTradeDemo.entities.concrete.Customer;

public class HibernateCustomerDao implements CustomerProductDao{
	
	List<Customer> customerList = new ArrayList<>();

	@Override
	public void customerRegister(Customer customer) {
		System.out.println(customer.getCustomerName() + " isimli müþteri Hbirnate ile veri tabanýna kaydedilmiþtir");
		
	}

	@Override
	public void customerUpdate(Customer customer) {
		System.out.println(customer.getCustomerName() + " isimli müþteri bilgilerini güncellemiþtir");
		
	}

	@Override
	public void customerDelete(Customer customer) {
		System.out.println(customer.getCustomerName() + " isimli müþteri bilgilerini silmiþtir");
		
		
	}

	@Override
	public Customer getById(int id) {
		List<Customer> customers = getAllByCustomers();
		if(customers != null) {
			for(Customer customer:customers ) {
				if(customer.getId() == id);
				return customer;
			}
		}
		return null;
	}

	@Override
	public List<Customer> getAllByCustomers() {
		// TODO Auto-generated method stub
		return customerList;
	}

}
