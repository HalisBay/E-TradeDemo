package eTradeDemo.entities.concrete;

import eTradeDemo.entities.abstracts.Entity;

public class Customer implements Entity {
	
	private int id;
	private String customerName;
	private String customerLastName;
	private String phoneNumber;
	private String email;
	private String password;
	
	public Customer () {
		
	}

	public Customer(int id, String customerName, String customerLastName, String phoneNumber, String email,
			String password) {
		this.id = id;
		this.customerName = customerName;
		this.customerLastName = customerLastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
