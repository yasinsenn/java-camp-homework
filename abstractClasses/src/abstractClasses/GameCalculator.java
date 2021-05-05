package abstractClasses;

public abstract class GameCalculator {

	// hesapla ortak bir metotdur yani hem kad�n, hem erkek, hem de �ocuk oyucular
	// i�in gereklidir
	// fakat hesaplama y�ntemleri de�i�ebilir
	// bu gibi durumlarda metot i�erisine kodlar yaz�l�p bu s�n�f� miras alan
	// s�n�flarda override edebiliriz
	// ama i�eri�ine bir �ey yazmak istemiyorsak ve miras alan s�n�flar bu metodu
	// override etmek zorundaysa
	// ABSTRACT t�r�nde metot yaz�yoruz. Metodun i�erisini kullan�lan s�n�flarda
	// doldururyoruz
	public abstract void hesapla();

	public void gameOver() {
		System.out.println("Oyun bitti...");

	}

}
