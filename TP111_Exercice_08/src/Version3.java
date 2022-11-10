import java.util.Scanner;



public class Version3 {
	
	static Scanner scanner = new Scanner(System.in);
	static int nbDiv;
	static int min;
	static int max;
	static String reponse;
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		String reponse;
		
		
		do {
			
			nbDiv();
			min();
			max();
			affichage();
			
			reponse();
			
			reponse = scanner.nextLine();
			
		} while ( reponse.equals("o"));
			
			
		
		scanner.close();
		
       
	}

	
	


    private static void reponse() {
		do {

			if (reponse.equals("o")) {
				System.out.println("On continue");
				break;

			} else if (reponse.equals("n")) {
				System.out.println("On arrete");
				break;
			} else {
				System.out.print("\n\nVoulez-vous continuer (O/N) ? ");
				reponse = scanner.nextLine();
			}
		} while (!reponse.equals("o") || !reponse.equals("n"));

	}


	private static void affichage() {
		System.out.println("\nAffichage des MULTIPLES de " + nbDiv + " entre 0 et 100\n");

		for (int x = min; x <= max; x++) {
			if (x % nbDiv == 0) {
				System.out.println(" (" + x + ") \t");

			} else {
				System.out.println(" " + x + " \t");
			}
		}
	}

	private static void max() {
		System.out.println("Veuillez saisir la valeur de l'intervale Maximal ");
		max = scanner.nextInt();

	}

	private static void nbDiv() {
		System.out.println("Veuillez saisir la valeur du modulo ");
		nbDiv = scanner.nextInt();

	}

	private static void min() {
		System.out.println("Veuillez saisir la valeur de l'intervale Minimal ");
		min = scanner.nextInt();
	}

}
