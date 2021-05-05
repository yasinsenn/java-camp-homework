package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		super();
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {

		if (checkService.CheckIfRealPerson(customer)) {

			System.out.println("Saved to DB: " + customer.getFirstName());
		}

		else {
			System.out.println("Not a valid person...");
		}

	}

}
