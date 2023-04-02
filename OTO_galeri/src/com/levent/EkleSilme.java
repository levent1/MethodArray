package com.levent;

import java.util.Scanner;

public class EkleSilme {


	Scanner scanner=new Scanner(System.in);
	
	
	public Arac  aracOluştur( ) {
		
	
		System.out.println("Lütfen arac markası girin");
		String aracMarka1=new String();
		aracMarka1=scanner.nextLine();
		
		System.out.println("Lütfen arac model girin");
		String aracModel1=new String();
		aracModel1=scanner.nextLine();
		
		System.out.println("Lütfen arac km girin");
		String aracKm1=new String();
		aracKm1=scanner.nextLine();
		
		System.out.println("Lütfen arac kaza durumu girin");
		String kazaDurumu1=new String();
		kazaDurumu1=scanner.nextLine();
		
		System.out.println("Lütfen arac kasa tipi girin");
		String tipi1=new String();
		tipi1=scanner.nextLine();
		
		System.out.println("Lütfen arac fiyat girin");
		int fiyat1;
		fiyat1=scanner.nextInt();scanner.nextLine();
		int aracId=0;
		
		Arac arac=new Arac(aracId,aracMarka1, aracModel1,aracKm1,kazaDurumu1,tipi1,fiyat1); 
		return arac;
	}
	
	public Uye uyeOluştur() {
		System.out.println("Lütfen üye adını giriniz");
		String uyeAdi1=new String();
		uyeAdi1=scanner.nextLine();
		
		System.out.println("Lütfen üye maili giriniz");
		String uyeMail1=new String();
		uyeMail1=scanner.nextLine();
		
		System.out.println("Lütfen sifre  giriniz");
		String uyeSifre1=new String();
		uyeSifre1=scanner.nextLine();
		
		System.out.println("Lütfen  tel giriniz");
		String uyeTel1=new String();
		uyeTel1=scanner.nextLine();
		
		Uye uye=new Uye(0, uyeAdi1, uyeMail1, uyeSifre1, uyeTel1);
		return uye;
	}
	

}
