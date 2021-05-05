package interfaces;

public class CustomerManager {

	private CustomerDal customerDal;

	public CustomerManager(CustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	public void add() {
		// iþ kodlarý

		customerDal.add();

	}
}
