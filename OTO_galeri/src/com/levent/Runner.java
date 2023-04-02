package com.levent;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import com.levent.AraYuz;

public class Runner {
	public static void main(String[] args) {
		AraYuz menu = new AraYuz();// Arayüz sınıfı içinden nesne oluşturduk
		menu.araYuz();// Oluşturduğumuz nesne üzerinden methoda ulaştık.

		Arac[] aracObj = {};// Araç ekleyeceğimiz araçlar tipinde dizi;
		Uye[] uyeObj = {};// Üye ekleyeceğimiz üyeler tipinde dizi;
		int tercih;
		boolean kontrol = true;
		int aracKurumNo = 0;
		int uyeKurumNo = 0;

		Scanner scanner = new Scanner(System.in);

		EkleSilme ekleSilmeObj = new EkleSilme();
		// Arayüz işlem tercihi b
		while (kontrol == true) {
			menu.araYuz();// Oluşturduğumuz nesne üzerinden methoda ulaştık.
			System.out.println("Lütfen tercihnizini giriniz:");
			tercih = scanner.nextInt();
			scanner.nextLine();

			if (tercih == 1) {

				aracObj = aracDiziArt(aracObj);// Diziyi dinamik büyütmek için
				System.out.println("Araç Ekleme");

				Arac arabaEklenen = ekleSilmeObj.aracOluştur();
				System.out.println(arabaEklenen.getAracMarka());
				aracObj[aracKurumNo] = arabaEklenen;
				arabaEklenen.setId(aracKurumNo);
				System.out.println(aracKurumNo + 1 + " araç nolu " + aracObj[aracKurumNo].getAracMarka()
						+ "sisteme başarıyla eklenmiştir");
				aracKurumNo++;
			} else if (tercih == 2) {
				uyeObj = uyeDiziArt(uyeObj);
				System.out.println("Üye Ekleme");
				uyeKurumNo++;
				Uye uyeEklenen = ekleSilmeObj.uyeOluştur();
				uyeEklenen.setId(uyeKurumNo);
				System.out.println(uyeEklenen);
				uyeObj[uyeKurumNo] = uyeEklenen;

			} else if (tercih == 3) {
				System.out.println("Üye Silme");
				System.out.println("SİLİNEBİLECEK ÜYELER");
				for (Uye uye : uyeObj) {
					if (uye != null)
						System.out.println(uye);
				}
				Uye bosUye = null;
				System.out.println("Silinecek üye no giriniz: ");
				int silinecekUye = scanner.nextInt();
				scanner.nextLine();
				uyeObj[silinecekUye] = bosUye;
				System.out.println("GÜNCEL ÜYELER");
				for (Uye uye : uyeObj) {
					if (uye != null)
						System.out.println(uye);
				}
			} else if (tercih == 4) {
				System.out.println("Araç Silme");
				System.out.println("SİLİNEBİLECEK ARAÇLAR ");
				for (Arac arac : aracObj) {
					if (arac != null)
						System.out.println(arac);
				}
				Arac bosUye = null;
				System.out.println("Silinecek arac no giriniz: ");
				int silinecekArac = scanner.nextInt();
				scanner.nextLine();
				aracObj[silinecekArac ] = bosUye;
				System.out.println("GÜNCEL ARAÇLAR");
				for (Arac arac : aracObj) {
					if (arac != null)
						System.out.println(arac);
				}

			} else if (tercih == 5) {
				System.out.println("Araç Kiralama");
				AracKiralama aracKiralamaObj=new AracKiralama();
				Uye girisYapan=aracKiralamaObj.uyeGiris(uyeObj);
				
				if (girisYapan!=null) {
					
					System.out.println("KİRALANABİLECEK ARAÇLAR ");
					for (Arac arac : aracObj) {
						if (arac != null)
							System.out.println(arac);
					}
					Arac kiraArac = null;
					System.out.println("Kiranalacak arac no giriniz: ");
					int kiralanacakArac = scanner.nextInt();
					scanner.nextLine();
					System.out.println(aracObj[kiralanacakArac] +"Aracımız" + girisYapan.getUyeAdi() + " Bey/Bayana günlüğü " + aracObj[kiralanacakArac].getFiyat() +"TL olarak kiralanmıştır");
					aracObj[kiralanacakArac ] = kiraArac;
					System.out.println("GÜNCEL ARAÇLAR");
					for (Arac arac : aracObj) {
						if (arac != null)
							System.out.println(arac);
					}
					
				}
				
			} else if (tercih == 6) {
				System.out.println("Çıkış");
				kontrol = false;
			} else {
				System.out.println("Gecerli değer giriniz");
			}

		}
		System.out.println(uyeObj[1]);
		System.out.println(uyeObj[2]);

	}

	// AUTO dizi boyutu artışı
	public static Arac[] aracDiziArt(Arac[] dizi) {

		Arac[] buyukDizi = new Arac[dizi.length + 2];

		for (int i = 0; i < dizi.length; i++) {
			buyukDizi[i] = dizi[i];
		}

		return buyukDizi;
	}

	public static Uye[] uyeDiziArt(Uye[] uyeObj) {

		Uye[] buyukDizi = new Uye[uyeObj.length + 2];

		for (int i = 0; i < uyeObj.length; i++) {

			buyukDizi[i] = uyeObj[i];
		}

		return buyukDizi;
	}
}
