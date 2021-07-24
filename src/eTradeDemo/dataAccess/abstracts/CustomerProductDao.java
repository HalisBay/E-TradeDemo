package eTradeDemo.dataAccess.abstracts;

import java.util.List;

import eTradeDemo.entities.concrete.Customer;

public interface CustomerProductDao {
	void customerRegister(Customer customer);
	void customerUpdate(Customer customer);
	void customerDelete(Customer customer);
	Customer getById(int id);
	List<Customer>  getAllByCustomers();

}
