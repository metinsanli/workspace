import java.util.Scanner;

public class Araba {
	// STATIC SINIF DEGISKENLER
	public static double benzinLF = 5.1; // treu
	public static double dizelLF = 4.6; // false

	// SINIF DEGISKENLERI
	Scanner veri = new Scanner(System.in);
	public String marka, plaka, renk;
	double motorHacmi, km, yakitMiktari, yakitDeposuMax, gunlukKira, yakitTuketim, litreFiyat;
	public boolean vites; // true=manuel false=otomatik
	public String yakitTuru, vitesTuru;

	public Araba() {

	} // end DEFAULT Consructor Araba()

	@SuppressWarnings("static-access")
	public Araba(String marka, double motorHacmi, String plaka, String renk, double km, double yakitMiktari, double yakitDeposuMax, double gunlukKira, double yakitTuketim, boolean yakitTuru, boolean vites) {
		this.marka = marka;
		this.motorHacmi = motorHacmi;
		this.plaka = plaka;
		this.renk = renk;
		this.km = km;
		this.yakitMiktari = yakitMiktari;
		this.yakitDeposuMax = yakitDeposuMax;
		this.gunlukKira = gunlukKira;
		this.yakitTuketim = yakitTuketim;
		if (yakitTuru) {
			this.litreFiyat = this.benzinLF;
			this.yakitTuru = "Benzin";
		} else {
			this.litreFiyat = this.dizelLF;
			this.yakitTuru = "Dizel";
		}
		if (vites) {
			this.vitesTuru = "MAN";
		} else {
			this.vitesTuru = "OTO";
		}
	} // end constructor (...)

	public void arabaSur() {
		double kacKm;
		System.out.printf("\nArabaniz %s kac km yol gidilecek > ", marka);
		kacKm = veri.nextDouble();
		km += kacKm;
		double masraf = ((kacKm * yakitTuketim) / 100) * litreFiyat;
		System.out.println(masraf + " TL.");
	} // end method arabaSur()

	public void yakitAl() {
		double kacLitre = 0;
		System.out.printf("\n%s deposunda %.2f Litre benzin var.", marka, yakitMiktari);
		while (yakitMiktari < yakitDeposuMax) {
			System.out.printf("\nKac Litre benzin alinacak (en fazla = %.2f lt.) > ", Math.abs(yakitDeposuMax - yakitMiktari));
			kacLitre = veri.nextDouble();
			if (yakitDeposuMax > yakitMiktari + kacLitre) {
				yakitMiktari += kacLitre;
				break;
			}
		}
	} // end method yakitAl()

	public void baslikGetir() {
		System.out.printf("\n%-10s%-5s%-12s%-8s%-10s%-6s%-8s%-7s%-6s%-9s", "Marka", "CC.", "Plaka", "Renk", "KM", "Yakit", "Tuketim", "Turu", "Vites", "Gunluk");
		System.out.printf("\n%-10s%-5s%-12s%-8s%-10s%-6s%-8s%-7s%-6s%-9s", "---------", "----", "-----------", "-------", "---------", "-----", "-------", "------", "-----", "--------");
	} // end method baslikGetir()

	public void arabaBilgileri(boolean baslik) {
		if (baslik)
			baslikGetir();
		System.out.printf("\n%-10s%-5s%-12s%-8s%-10.2f%-6s%-8s%-7s%-6s%-5sTL", marka, motorHacmi, plaka, renk, this.km, yakitMiktari, yakitTuketim, yakitTuru, vitesTuru, gunlukKira);
	} // end method arabaBilgileri()

} // end class