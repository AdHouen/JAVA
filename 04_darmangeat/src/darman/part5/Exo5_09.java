package darman.part5;

import java.util.Scanner;

public class Exo5_09 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int nbChoix = 0;
		int nbPlusGrandPosition = 0;
		int nbPlusGrand = 0;
		int i = 1;
		System.out.println("Appuyer sur 0 pour arreter");

		do {
			System.out.print("Entrez un nombre numéro " + i + " : ");
			nbChoix = scanner.nextInt();

			if (nbChoix > nbPlusGrand) {
				nbPlusGrand = nbChoix;
				nbPlusGrandPosition = i;

			}

			i = i + 1;

		} while (nbChoix != 0);

		System.out.println();

		System.out.println("Le nombre le plus grand est : " + nbPlusGrand);
		System.out.println("Il est placé en position : " + nbPlusGrandPosition + " /20 ");

	}
}
