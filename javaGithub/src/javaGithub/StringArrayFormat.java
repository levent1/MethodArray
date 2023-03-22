package javaGithub;

public class StringArrayFormat {
public static void main(String[] args) {
	//String turn to array
	//Show this view in the consol first
	//Array[0]="01-Adana"
	//Array[0]="02-Adiyaman"
	//Each element of the array should be outputted
	//Output format is ** Adana's is license plate no = 01
	
	//Declare string
	String cityString="01-Adana;02-Adiyaman;03-Afyonkarahisar;04-Agri;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydin;";
	
	//String turn to Array format (We use split);
	
	String[] cityArrayString=cityString.split(";");
	//We controling array format now
	
	for (int i = 0; i < cityArrayString.length; i++) {
		System.out.println("Array index: "+i+" inside: "+cityArrayString[i]);
	}
	System.out.println("*****************************************************");
	//we will change inside of the array
	
	for (int i = 0; i < cityArrayString.length; i++) {
		//we are changeing array format /we change the array format as desired
		cityArrayString[i]=cityArrayString[i].replace(cityArrayString[i].substring(0,3), "").trim().concat("'s is license plate no = ")+cityArrayString[i].substring(0,2);
		System.out.println(cityArrayString[i]);
	}
}
}
