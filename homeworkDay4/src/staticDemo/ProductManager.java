package staticDemo;

public class ProductManager {

	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();

		// static metotlar direkt class ismiyle çaðýrýlabilir new gerekmez
		// her duruma uygun bir yöntem deðildir ara araçlar için kullanýlýr
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi...");
		} else {
			System.out.println("Ürün bilgileri geçersiz...");
		}

	}
}
