package eval.question;

import java.util.Arrays;
import java.util.Scanner;

public class Quest3_Addition {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("*******************************************************************\n" + "Question 3\n"
				+ "L'utilisateur saisit 5 nombres maximum.\n" + "Chaque nombre saisi est suivi de la touche [Entrée].\n"
				+ "La saisie est terminée quand les 5 nombres sont saisis ou si on entre le nombre zéro.\n"
				+ "Réafficher la liste des nombres saisis sous la forme d'une addition avec la somme de ses nombres.\n"
				+ "( exemple: 8 + 9 + 2 + 1  = 20 )\n"
				+ "*******************************************************************\n\n\n");
		;

		int somme = 0;

		int[] monTab = new int[5];

		System.out.println("Il y aura 5 valeur au maximum, 0 pour arreter :");

		for (int i = 0; i < monTab.length; i++) {
			System.out.println("La valeur  " + (i + 1) + " est : ");
			int a = scanner.nextInt();
			monTab[i] = a;
			somme = somme + monTab[i];
			if (a == 0) {
				break;
				
			}
			

		}
		System.out.println("La somme des valeurs dans le tableau est : "   + somme);

	}

}
