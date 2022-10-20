package darman.part7;

import java.util.Arrays;
import java.util.Scanner;



public class Exo7_02_2_TriSelectif {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.printf("Tri par SELECTION \n");
		
		System.out.println("Combien de valeur voulez vous rentrer ?");
		int nombre = scanner.nextInt();
		Integer [] monTab = new Integer[nombre];
		
		for (int i = 0; i < monTab.length; i++) {
			System.out.printf("Veuillez entrer la valeur %s : ", (i+1));
			monTab [i] = scanner.nextInt();
			
		}
		
		System.out.println("Mon tableau est : " + Arrays.toString(monTab));
		
		for (int i = 0; i < monTab.length - 1; i++) {
			for (int j = i + 1; j < monTab.length; j++) {
				if (monTab[j] > monTab[i]) {
					int temp = monTab[j];
					monTab[j] = monTab[i];
					monTab[i] = temp;
				}
			}
		}
		System.out.printf("Mon tableau trier avec la methode de trie selectif est %s\n", Arrays.toString(monTab));
	}

}
