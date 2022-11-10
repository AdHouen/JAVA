package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_09 {
	
	static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		int somme = 0;
		
		System.out.println("Combien de valeur veux tu saisir ? ");
		int nombre = scanner.nextInt();
		int [] monTab = new int [nombre];
		
		System.out.println("Il y aura " + monTab.length + " valeur dans mon tableau");
		
		for (int i = 0 ; i < monTab.length ; i++ ) {
			System.out.println("La valeur  " + (i+1) + " est : ");
			monTab [i] = scanner.nextInt();
			somme = somme + monTab [i];
			// somme += monTab [i];
			
		}
		System.out.println("Les valeurs dans le tableau sont : " + Arrays.toString(monTab));
		
		System.out.println("La somme des valeurs saisies est de : " + somme);
		
		
		
		
		
		

	}

}
