package fr.afpa.math;
import java.util.Scanner;

public class Math1 {

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
	

		System.out.println("Veuillez entrer un nombre pour connaitre la valeur de sa factorielle ");

		long nbFacto = scanner.nextLong();
		scanner.nextLine();
		int facto = 1;
		int iteration = 1;

		while (iteration <= nbFacto) {
			facto = facto * iteration;
			iteration = iteration + 1;
		}

//		int facto = 1;
//		for (long i = facto-1 ; i > 0 ; i--){
//          facto *= i;
//      }

		System.out.println("La factorielle de " + nbFacto + " est de " + facto);
//		System.out.println("La factorielle est " + nbFacto) ;

	}

	private static String reponse() {
		String rep = "";
		do {
			System.out.print("\nVoulez-vous continuer (O/N) ? ");
			rep = scanner.nextLine();

			if (rep.equals("o")) {
				System.out.println("On continue");
				break;

			} else if (rep.equals("n")) {
				System.out.println("On arrete");
				break;
			}

		} while (!rep.equalsIgnoreCase("o") || !rep.equalsIgnoreCase("n"));

		return rep;

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
