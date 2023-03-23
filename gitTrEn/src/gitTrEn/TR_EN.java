package gitTrEn;

import java.util.Scanner;

public class TR_EN {
	public static void main(String[] args) {
		//Girilen kelimedeki türkçe karakterleri ingilizce yapan program;
		
		System.out.println("Lutfen bir kelime giriniz");
		Scanner scanner=new Scanner(System.in);
		String kelimeString=scanner.nextLine();
		
		//Kurgu girilen kelime önce türkçe harf kontrolünden geçirilecek bunun için bir dizi bulunacak ve bir dizide replace için olacak orada türkçe dizinin ingilizcesi olacak.
		
		String[] diziTrKontrol= {"İ","ı","ş","Ş","ç","Ç","ğ","Ğ","Ü","ü","ö","Ö"};
		String[] diziIngReplace= {"I","i","s","S","c","C","g","G","U","u","o","O"};
		scanner.close();
		for (int i = 0; i < kelimeString.length(); i++) {
			for (int j = 0; j < diziTrKontrol.length; j++) {
				if (diziTrKontrol[j].equals(kelimeString.charAt(i)+"")) {
				kelimeString=kelimeString.replace((kelimeString.charAt(i)+""),  diziIngReplace[j]);
				}
			}
		}
		System.out.println("kelime:"+kelimeString);
	}
}
