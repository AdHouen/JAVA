package darman.part3;

import java.util.Scanner;

public class Exo3_06{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("Veuillez entrer l'age de votre enfant : ");
		
		int a = scanner.nextInt();
		
		if (a < 6) {
			System.out.println("Votre enfant est trop jeune pour s'inscrire cette année");
			
		}
		
		else if ( a >= 6 && a <= 7 ){
			
			System.out.println("Votre enfant est dans la catégorie \"Poussin\" (entre 6 et 7 ans)");
				
		}
		else if ( a >= 8 && a <= 9 ){
			
			System.out.println("Votre enfant est dans la catégorie \"Pupille\" (entre 8 et 9 ans)");
			
		} 
		else if ( a >= 10 && a <= 11 ){
			
			System.out.println("Votre enfant est dans la catégorie \"Minime\" (entre 10 et 11 ans)");
			
		} 
		else {
			System.out.println("Votre enfant est dans la catégorie \"Cadet\" (plus de 12 ans)");
		}
		
		

	}
	
}

