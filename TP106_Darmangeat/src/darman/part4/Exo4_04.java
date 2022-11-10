package darman.part4;

import java.util.Scanner;

public class Exo4_04 {
	static Scanner  scanner = new Scanner(System.in); 
	
	
	public static void main(String[] args) {
		System.out.println("Veuillez entrer le nombre de photocopies à effectuer : ");
		int nbphoto = scanner.nextInt();		
		
		double prixTT = 0;
		
		for (int i = 1 ; i <= nbphoto ; i++  ) {
			
			if (i >= 1 && i <= 10) {
				prixTT = prixTT + 0.10;
			}
			if (i>= 11 && i <= 30) {
				prixTT = prixTT + 0.09;
			} 
			if (i > 30) {
				prixTT = prixTT + 0.08;
			} 
			
		}
		
			System.out.printf("Le prix de votre facture sera de : %.2f  €" , prixTT);
				
	}
	
    
}
	