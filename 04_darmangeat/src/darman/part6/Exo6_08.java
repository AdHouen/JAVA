package darman.part6;

import java.util.Scanner;

public class Exo6_08 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		System.out.println("Combien de valeur dans le tableau ? ");
		int nombre = scanner.nextInt();
		int [] monTab = new int [nombre];
		
		int positif = 0;
		int negatif = 0;
		
		System.out.println("La longueur du tableau sera de : " + monTab.length);
		System.out.println();
		
		for (int i = 0; i < monTab.length; i++) {
			System.out.println("Rentrer la valeur numero " + (i+1) + " :" );
			monTab [i] = scanner.nextInt();
			
			if ( monTab [i] >= 0) {
				positif = positif +1;
				
			} else {
				negatif = negatif +1;
			}
			
		}	
		
		System.out.println("Le nombre de valeur positive est de : " + positif);
		System.out.println("Le nombre de valeur negative est de : " + negatif);
		
		scanner.close();
		
		

	}

}
