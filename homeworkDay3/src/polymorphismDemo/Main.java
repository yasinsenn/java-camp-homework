package polymorphismDemo;

public class Main {

	public static void main(String[] args) {

//		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new EmailLogger() };
//
//		for (BaseLogger baseLogger : loggers) {
//			baseLogger.log("Log mesajý");
//		}

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
