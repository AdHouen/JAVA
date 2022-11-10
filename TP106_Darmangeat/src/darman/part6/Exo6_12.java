package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_12 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Veuilez saisir un nombre quelconque de valeur : ");
		int nombre = scanner.nextInt();
		int [] monTab = new int [nombre];
		
		
		for (int i = 0; i < nombre; i++) {
			System.out.printf("La valeur numero %d est : \n", i+1  );
			monTab [i]= scanner.nextInt();
			
		}
		System.out.println("Valeur du tableau : " + Arrays.toString(monTab));
		
		System.out.println();
		
		System.out.println("Maintenant toutes les valeurs vont etre augmentées de 1 ");
		
		System.out.println();
		
		int [] monTabSomme = new int [nombre];
		
		
		for (int i = 0; i < monTab.length; i++) {
			monTabSomme [i] = monTab[i] + 1 ;
			
		}
		
		System.out.println("Valeur du tableau Somme  : " + Arrays.toString(monTabSomme));
		
		
		
		

	}
	

}
