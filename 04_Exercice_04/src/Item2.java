import java.util.Scanner;

public class Item2 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Veuillez entrer votre opération");
		System.out.println("Entrer 1 pour une Addition");
		System.out.println("Entrer 2 pour une Soustraction");
		System.out.println("Entrer 3 pour une Division");
		System.out.println("Entrer 4 pour une Multiplication");
		
		
		int operation = scanner.nextInt();
		
		double a = 0;
		double b = 0;
		
		
		if (operation >= 1  && operation <= 4) {
			System.out.println("Veuillez entrer le premier nombre ");
			a = scanner.nextDouble();
			System.out.println("Veuillez entrer le deuxieme nombre ");
			b = scanner.nextDouble();
		}
		
		
		
		switch (operation) {
		case 1 :
			System.out.printf("Le resultat de l'addtion est : %.2f + %.2f = %.2f ", a, b, (a+b));
			break;
		case 2 :
			System.out.printf("Le resultat de la soustraction est : %.2f - %.2f = %.2f ", a, b, (a-b));
			break;
		case 3 :
			System.out.printf("Le resultat de la division est : %.2f / %.2f = %.2f ", a, b, (a/b));
			break;
		case 4 :
			System.out.printf("Le resultat de la multiplication est %.2f * %.2f = %.2f ", a, b, (a*b));
			break;

		default:
			System.out.println("Je n'ai pas compris votre demande");
			break;
		}
		
	}

}
