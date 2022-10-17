import java.util.Scanner;

public class Version2 {
	
	static Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Veuillez saisir la valeur du modulo ");
		
		int nbDiv = scanner.nextInt();
		
		System.out.println("Veuillez saisir la valeur de l'intervale Minimal ");
		
		int min =scanner.nextInt();
		
		System.out.println("Veuillez saisir la valeur de l'intervale Maximal ");
		
		int max =scanner.nextInt();
		
		
		System.out.println("\nAffichage des MULTIPLES de " + nbDiv + " entre 0 et 100\n");
		
		for ( int x = min ; x <= max ; x++) {
			if (x % nbDiv == 0) {
				System.out.println(" (" + x + ") \t");
				
			} else {
				System.out.println(" " + x + " \t");
				
			}
			
			
		}
	}
}
