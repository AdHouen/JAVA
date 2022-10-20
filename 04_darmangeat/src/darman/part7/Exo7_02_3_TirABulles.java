package darman.part7;

import java.util.Arrays;
import java.util.Scanner;

public class Exo7_02_3_TirABulles {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.printf("Tri par A BULLE  \n");

		System.out.println("Combien de valeur voulez vous rentrer ?");
		int nombre = scanner.nextInt();
		Integer[] monTab = new Integer[nombre];

		for (int i = 0; i < monTab.length; i++) {
			System.out.printf("Veuillez entrer la valeur %s : ", (i + 1));
			monTab[i] = scanner.nextInt();

		}

		System.out.println("Mon tableau est : " + Arrays.toString(monTab));

		boolean trouver = true;

		while (trouver) {
			trouver = false;
			for (int i = 0; i < monTab.length - 1; i++) {
				if (monTab[i] < monTab[i + 1]) {
					int temp = monTab[i];
					monTab[i] = monTab[i + 1];
					monTab[i + 1] = temp;
					trouver = true;
				}

			}
		}
		
		System.out.println("Mon tableau trier avec la methode de trie à bulle est : " + Arrays.toString(monTab));
		

	}
}
