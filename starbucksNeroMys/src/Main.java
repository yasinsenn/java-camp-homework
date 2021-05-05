import java.sql.Date;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Yasin", "Þen", new Date(1996), "123456789"));

	}

}
