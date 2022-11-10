package darman.part5;

import java.util.Scanner;

public class Exo5_11 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Entrer le nombre de chevaux partant :");
		int chxPartant = scanner.nextInt();

		System.out.println("Entrer le nombre de chevaux joués :");
		int chxJoues = scanner.nextInt();
		
		
		
		////////////////////////  CHOIX 1 //////////////////////////////////

		int chanceOrdre = factoriel(chxPartant) / factoriel((chxPartant - chxJoues));
		int chanceDesordre = factoriel(chxPartant) / (factoriel(chxJoues) * factoriel(chxPartant - chxJoues));

		System.out.printf("Dans l'ordre vous avez 1 chance sur  %d\n", chanceOrdre);
		System.out.printf("Dans le desordre vous avez 1 chance sur  %d\n", chanceDesordre);

	}

	private static int factoriel(double chiffre) {
		int result = 1;
		for (int i = 1; i <= chiffre; i++) {
			result *= i;
		}
		return result;

	

		////////////////////////CHOIX 2 //////////////////////////////////

//		int chanceOrdre = 1;
//		int chanceDesordre = 1;
//		if (chxJoues > chxPartant) {
//			System.out.printf("Tu ne peux pas jouer plus de chevaux qu'il n'y en a");
//		} else {
//			for (int i = 1; i <= chxJoues; i++) {
//				chanceOrdre *= (chxPartant - chxJoues + i);
//				chanceDesordre *= i;
//			}
//			System.out.printf(
//					"Dans l'ordre : une chances sur %d de gagner\nDans le desordre : une chances sur %d de gagner",
//					chanceOrdre, chanceOrdre / chanceDesordre);
//		}
		
		//////////////////////////////////////////////////////////////////

	}
}
