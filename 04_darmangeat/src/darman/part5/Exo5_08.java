package darman.part5;

import java.util.Scanner;

public class Exo5_08 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int nbPlusGrand = 0;
		int nbPlusGrandPosition = 0;

		

		for (int i = 1; i <= 20 ; i++) {
			System.out.print("Entrez le nombre numéro " + i + "/20 :");
			int nbchoixIni = scanner.nextInt();
			if (nbchoixIni > nbPlusGrand) {
				nbPlusGrand = nbchoixIni;
				nbPlusGrandPosition = i;

			}
		}
		System.out.println();

		System.out.println("Le nombre le plus grand est : " + nbPlusGrand);
		System.out.println("Il est placé en position : " + nbPlusGrandPosition + " /20 ");

	}
}

