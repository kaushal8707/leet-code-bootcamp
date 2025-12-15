package optional;

import com.java.selfdeveloped.spring.java8.api.model.Customer;
import com.java.selfdeveloped.spring.java8.api.model.EKartDataBase;

public class OptionalWithStreamDemo {

	public static void main(String[] args) throws Exception {

		//Get Customer By Email Id
		System.out.println(getCustomerByEmail1("abc"));
		System.out.println(getCustomerByEmail("joh@gmail.com"));
		
	}

	private static Customer getCustomerByEmail1(String email) throws Exception {
		return EKartDataBase.getAll().stream()
					.filter(customer->customer.getEmail().equals(email))
							.findAny().orElseThrow(()->new Exception("Email Not Found"));	
		
	}

	private static Customer getCustomerByEmail(String email) {
		return EKartDataBase.getAll().stream()
				.filter(customer->customer.getEmail().equals(email))
						.findAny().orElse(new Customer());		
	}
}
