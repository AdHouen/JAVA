package darman.part7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exo7_02_1 {
	
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Combien de valeur voulez vous rentrer ?");
		int nombre = scanner.nextInt();
		Integer [] monTab = new Integer[nombre];
		
		for (int i = 0; i < monTab.length; i++) {
			System.out.printf("Veuillez entrer la valeur %s : ", (i+1));
			monTab [i] = scanner.nextInt();
			
		}
		
		System.out.println("Les valeurs de votre tableau sont : " + Arrays.toString(monTab));
		
		Arrays.sort(monTab, Comparator.reverseOrder());
		System.out.println("");
		System.out.println("Les valeurs de votre tableau TRIER DECROISSANT  sont : " + Arrays.toString(monTab));
		
		Arrays.sort(monTab);
		System.out.println("");
		System.out.println("Les valeurs de votre tableau TRIER CROISSSANT  sont : " + Arrays.toString(monTab));
	
		
		

	}

}
