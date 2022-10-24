package fr.afpa.math;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Math2 {

	static Scanner scanner = new Scanner(System.in);

	static String rep = "";
	static long nbFacto, nbFacto2;

	public static void main(String[] args) {

		do {

			factorielleFor();

			rep = reponse();

		} while (rep.equalsIgnoreCase("o"));
//		} while (reponse2());

	}

	private static void factorielleFor() {

		JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre pour connaitre la valeur de sa factorielle ");
		String saisir = JOptionPane.showInputDialog("Entrer un nombre ");

		long nbFacto = Long.parseLong(saisir);

		long facto = 1;
		int iteration = 1;

		

		while (iteration <= nbFacto) {
			facto = facto * iteration;
			iteration = iteration + 1;
		
			

		}
		if (nbFacto > 0 && nbFacto <= 20) {
			JOptionPane.showMessageDialog(null, "La factorielle de " + nbFacto + " est de " + facto);
			
		}
		
		if (nbFacto < 1) {
			JOptionPane.showMessageDialog(null, "Erreur -1");
			
		}
		if (nbFacto > 20) {
			JOptionPane.showMessageDialog(null, "Erreur -2");
			
		}
		
		
		 

//		int facto = 1;
//		for (long i = facto-1 ; i > 0 ; i--){
//          facto *= i;
//      }

	}

	private static String reponse() {
		String saisir = "";
		do {
//			JOptionPane.showMessageDialog(null,"\nVoulez-vous continuer (O/N) ? ");
			saisir = JOptionPane.showInputDialog("Voulez-vous continuer (O/N) ?");

//			rep = scanner.nextLine();

			if (saisir.equals("o")) {
				JOptionPane.showMessageDialog(null, "On continue");

				break;

			} else if (saisir.equals("n")) {
				JOptionPane.showMessageDialog(null, "On arrete");
				break;
			}

		} while (!saisir.equalsIgnoreCase("o") || !saisir.equalsIgnoreCase("n"));

		return saisir;

	}

//	private static boolean reponse2() {
//		
//		do {
//			System.out.print("\nVoulez-vous continuer (O/N) ? ");
//			reponse = scanner.nextLine();
//			
//			if (reponse.equals("o")) {
//				System.out.println("On continue");
//				return true;
//				
//
//			} else if (reponse.equals("n")) {
//				System.out.println("On arrete");
//				return false;
//			} 
//			
//		} while (!reponse.equalsIgnoreCase("o") || !reponse.equalsIgnoreCase("n"));
//		
//		
//		return false;
//	}

}
