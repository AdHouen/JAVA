package darman.part4;

import java.util.Scanner;

public class Exo4_01 {
	static Scanner scanner = new Scanner(System.in); //Sortir le scanner et le mettre en static pour pouvoir l'utiliser dans toutes les methodes
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Entrer 2 valeurs et ecrire la chaine de caractere \"Ok\": ");
		double tutu = scanner.nextDouble();
		double toto = scanner.nextDouble();
		scanner.nextLine();
		String tata = scanner.nextLine().toUpperCase();
		
		
		
		
		
		
		
		if (tutu > (toto +4) || tata.equals("OK")) {
			tutu = tutu +1;
			
		} else {
			tutu = tutu - 1 ;
		}
		
		System.out.println("tutu : " + tutu);
		
	}
    
}
