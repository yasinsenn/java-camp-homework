package abstractClasses;

public abstract class GameCalculator {

	// hesapla ortak bir metotdur yani hem kadýn, hem erkek, hem de çocuk oyucular
	// için gereklidir
	// fakat hesaplama yöntemleri deðiþebilir
	// bu gibi durumlarda metot içerisine kodlar yazýlýp bu sýnýfý miras alan
	// sýnýflarda override edebiliriz
	// ama içeriðine bir þey yazmak istemiyorsak ve miras alan sýnýflar bu metodu
	// override etmek zorundaysa
	// ABSTRACT türünde metot yazýyoruz. Metodun içerisini kullanýlan sýnýflarda
	// doldururyoruz
	public abstract void hesapla();

	public void gameOver() {
		System.out.println("Oyun bitti...");

	}

}
