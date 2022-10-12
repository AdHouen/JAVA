package darman.part4;

import java.util.Scanner;


public class Exo4_08 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Veuillez entrer un le numero correspondant au jour actuel : ");
		int jour = scanner.nextInt ();
		System.out.println("Veuillez entrer un le numero correspondant au mois actuel : ");
		int mois = scanner.nextInt();
		System.out.println("Veuillez entrer un le numero correspondant a l'année actuel : ");
		int annee = scanner.nextInt();
		
		boolean bisextile = (((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0)) ;
		boolean cas1 = ((mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12 ) && (jour >= 1 && jour <=31));
		boolean cas2 = ((mois == 4 || mois == 6 || mois == 9 || mois == 11) && (jour >= 1 && jour <=30)); 
		boolean cas3 = (mois == 2 && bisextile && jour >= 1 && jour <=29);
		boolean cas4 = (mois == 2 && jour >= 1 && jour <=28);
		
		if (cas1 || cas2 || cas3 || cas4 ) {
			System.out.printf("La date du %d / %d / %d est valide ", jour, mois, annee);
		} else {
			System.out.printf("La date du %d / %d / %d n'est pas valide ", jour, mois, annee);
		}
		
	}
    
}
