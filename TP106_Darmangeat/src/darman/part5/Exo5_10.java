package darman.part5;

import java.util.Scanner;

public class Exo5_10 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("La valeur 0 terminera le programme");
		System.out.println();

		int achat = 1;

		int nbBillet10 = 0;
		int nbBillet5 = 0;
		int nbPiece1 = 0;
		int remboursement = 0;
		int prixTT = 0;

		while (achat != 0) {
			System.out.println("Veuillez saisir le montant de votre article : ");
			achat = scanner.nextInt();
			prixTT += achat;
			System.out.println("Total : " + prixTT);

		}
		System.out.println("Le prix total est de :  " + prixTT);

		System.out.println("combien d'argent avez vous pour regler ? ");
		remboursement = scanner.nextInt();

		remboursement -= prixTT;

		System.out.println("Votre remboursement sera de : " + remboursement);

		while (remboursement >= 10) {
			nbBillet10 += 1;
			remboursement -= 10;

		}

		while (remboursement >= 5) {
			nbBillet5 += 1;
			remboursement -= 5;

		}

		while (remboursement >= 1) {
			nbPiece1 += 1;
			remboursement -= 1;

		}

		System.out.printf("%d billet(s) de 10€ ", nbBillet10);
		System.out.printf("%d billet(s) de 5€ ", nbBillet5);
		System.out.printf("%d piece(s) de 1€ ", nbPiece1);

		scanner.close();

	}
}
		
		
		
		
		
