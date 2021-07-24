package eTradeDemo.business.concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTradeDemo.business.abstracts.CustomerCheckService;
import eTradeDemo.entities.concrete.Customer;

public class CustomerCheckManager implements CustomerCheckService{
	
	List<String> oldListEmails = new ArrayList<String>();

	@Override
	public boolean checkCustomerName(Customer customer) {
		if(customer.getCustomerName().length() <=2) {
			System.out.println("Say�n kullan�c�, isim en az 3 karakter olmal�.");
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean checkCustomerLastName(Customer customer) {
		if(customer.getCustomerLastName().length()<2) {
			System.out.println("Say�n kullan�c�, soy isim en az 2 karakter olmal�.");
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean checkPhoneNumber(Customer customer) {
		if(customer.getPhoneNumber().length() != 11) {
			System.out.println("Say�n kullan�c�, telefon numaran�z ba��nda 0 olacak bi�imde 11 haneden olu�mal�,bo�luk vs b�rak�lmamal�. �r:01234567890");
			return false;
		}
		else {
			return true;
		
		}
		
	}

	@Override
	public boolean checkEmail(Customer customer) {
		String regex="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(customer.getEmail());
		if(!(matcher.matches())) {
			System.out.println("Say�n kullan�c�, E-postan�n do�ru oldu�una emin olun.");
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean checkPassword(Customer customer) {
		if(customer.getPassword().length() <=6 ) {
			System.out.println("Say�n kullan�c�, Parolan�z en az 6 karakterden olu�mal�.");
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean isNewEmail(Customer customer) {
		if(oldListEmails.contains(customer.getEmail())){
			System.out.println("Bu email adresi daha �nce kullan��m��t�r, l�tfen farkl� bir email adresi ile kay�t olunuz.");
			return false;
		}
		
		else {
			oldListEmails.add(customer.getEmail());
			return true;
		}
		
	}

	@Override
	public boolean isValid(Customer customer) {
		if(checkCustomerName(customer) && checkCustomerLastName(customer) && checkPhoneNumber(customer)
				&& checkEmail(customer) && checkPassword(customer) && isNewEmail(customer)) {
			return true;
		}
		else {
			return false;
	}
		}
	
}
