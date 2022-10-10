package darman.part3;

import java.util.Scanner;

public class Exo3_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez entrer 3 Noms");
		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();
		
//		if ((a < b) || (b < c)) {
//			
//			
//		}
		if (a.compareToIgnoreCase(b)< 0 & b.compareToIgnoreCase(c)< 0) {
			System.out.println("Ces noms sont classés alphabétiquement");
			
		} else {
			System.out.println("Ces noms ne sont pas classés alphabétiquement");
			
		}
		
	}

}
