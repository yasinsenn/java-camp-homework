package staticDemo;

public class ProductManager {

	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();

		// static metotlar direkt class ismiyle �a��r�labilir new gerekmez
		// her duruma uygun bir y�ntem de�ildir ara ara�lar i�in kullan�l�r
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi...");
		} else {
			System.out.println("�r�n bilgileri ge�ersiz...");
		}

	}
}
