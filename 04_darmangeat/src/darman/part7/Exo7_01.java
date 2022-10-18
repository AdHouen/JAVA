package darman.part7;

import java.util.Arrays;
import java.util.Scanner;

public class Exo7_01 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Entrer le nombre de valeurs : ");
		int nombre = scanner.nextInt();
		int[] monTab = new int[nombre];

		for (int i = 0; i < monTab.length ; i++) {
			System.out.println("Entrez le nombre numero " + (i + 1) + " :");

			monTab[i] = scanner.nextInt();

		}
		
		System.out.println("Les valeurs du tableau sont : " + Arrays.toString(monTab));

		
		int pointDedepart = monTab[0];
		boolean drapeau = true;
		
		for (int i = 0; i < monTab.length ; i++) {
			if (pointDedepart != ((monTab[i]-1)+1)) {
				drapeau = false;
				break;
			}
			pointDedepart++;
			


		}
		if (drapeau) {
			
			System.out.println("Les nombre sont consecutifs");

		} else {
			
			System.out.println("Les nombres ne sont pas consecutifs");
		}

	}

}
