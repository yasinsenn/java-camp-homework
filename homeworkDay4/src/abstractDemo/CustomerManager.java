package abstractDemo;

public class CustomerManager {

	private BaseDatabaseManager baseDatabaseManager;

	public CustomerManager(BaseDatabaseManager baseDatabaseManager) {

		super();
		this.baseDatabaseManager = baseDatabaseManager;
	}

	public void getCustomers() {

		baseDatabaseManager.getData();
	}
}
