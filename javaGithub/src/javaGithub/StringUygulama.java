package javaGithub;

import java.util.Scanner;

public class StringUygulama {
	public static void main(String[] args) {
		String[] diziString= {"Turkiye","japonya","Mogulistan","Fransa"};
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("LUTFEN ULKE GIR");
		
		String ulkeString=scanner.nextLine();
		
//		if (ulkeString.equals("Turkiye")) {
//			System.out.println("ülke bulundu");
//		}
//		else if (ulkeString.equals("Japonya")) {
//			System.out.println("ülke bulundu");
//		}
//		else if (ulkeString.equals("Mogulistan")) {
//			System.out.println("ülke bulundu");
//		}
//		else if (ulkeString.equals("Fransa")) {
//			System.out.println("ülke bulundu");
//		}
//		else {
//			System.out.println("Ülke bulunamadı");
//		}
		
		//2.yol
//		for (int i = 0; i < diziString.length; i++) {
//			if (ulkeString.equals(diziString[i])) {
//				System.out.println("ülke bulundu");
//				break;
//			}else {
//				if (diziString.length-1==i) {
//					System.out.println("ülke bulunamadı");
//				}
//			}
//			
//			
//			}
		//3.yol
		Boolean kontrol=false;
		
		for (int i = 0; i < diziString.length; i++) {
			if (ulkeString.equalsIgnoreCase(diziString[i])) {
				System.out.println("ulke bulundu");
				kontrol=true;
			}
			
			}
		if (kontrol==false) {
			System.out.println("ulke bulunamadi");
		}
	}
}
