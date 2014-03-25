import java.util.Scanner;

public class RentACar {
	static Scanner giris = new Scanner(System.in);
	static Araba[] araba = new Araba[6];

	public static void main(String[] args) {
		int secim;

		araba[0] = new Araba("Mercedes", 1.4, "34 THK 55", "Beyaz", 10450, 20, 50, 250, 4.7, true, false);
		araba[1] = new Araba("Audi", 1.6, "02 MGJ 22", "Gri", 20750, 26, 50, 190, 4.2, true, true);
		araba[2] = new Araba("Renault", 1.2, "06 LLK 11", "Yesil", 80055, 14, 50, 50, 2.7, false, true);
		araba[3] = new Araba("Skoda", 1.2, "27 OOP 47", "Kirmizi", 60555, 11, 50, 30, 2.1, false, false);
		araba[4] = new Araba("Ferrari", 2.4, "01 FRR 66", "Siyah", 10598, 22, 50, 950, 8.7, true, false);
		araba[5] = new Araba("Opel", 1.8, "34 AR 1001", "Siyah", 0, 50, 50, 5, 4, false, false);

		while (true)
			switch (anaMenu()) {
			case 0:
				System.out.println("! Program kapatildi.");
				System.exit(0);
			case 1:
				secim = arabaSec();
				if (secim != 0)
					araba[secim - 1].arabaSur();
				devamEt();
				break;
			case 2:
				araba[arabaSec() - 1].yakitAl();
				devamEt();
				break;
			case 3:
				araba[arabaSec() - 1].arabaBilgileri(true);
				devamEt();
				break;
			case 4:
				boolean baslik;
				for (int i = 0; i < araba.length; i++) {
					if (i == 0)
						baslik = true;
					else
						baslik = false;
					araba[i].arabaBilgileri(baslik);
				}
				devamEt();
				break;
			}
	} // end main()

	public static int anaMenu() {
		int sec = -1;
		System.out.printf("\n##### ANA MENU #####");
		System.out.printf("\n\n[1] - Arabayi sur\n[2] - Arabaya yakit al\n[3] - Araba bilgilerini goster\n[4] - Tum araba bilgilerini goster\n[0] - Cikis\n");
		while (sec <= -1 || sec > 4) {
			System.out.printf("\nLutfen seciminizi yapin > ");
			sec = giris.nextInt();
		}
		return sec;
	} // end method anaMenu()

	public static int arabaSec() {
		int sec = -1;
		System.out.printf("\n##### ARABA SEC #####");
		for (int i = 0; i < araba.length; i++) {
			System.out.printf("\n[%d] - %s", i + 1, araba[i].marka);
		}
		System.out.printf("\n[0] - Iptal\n");
		while (sec <= -1 || sec > araba.length) {
			System.out.printf("\nLutfen seciminizi yapin > ");
			sec = giris.nextInt();
		}
		return sec;
	}

	public static void devamEt() {
		int sec = 1;
		while (sec != 0) {
			System.out.printf("\nDevam etmek icin \"0\" girin > ");
			sec = giris.nextInt();
		}
	}

} // end class