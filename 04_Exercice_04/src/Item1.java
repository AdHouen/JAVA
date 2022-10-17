import java.util.Scanner;

public class Item1 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
	
		System.out.println("Veuillez saisir une somme en Euros ");
		double euros = scanner.nextDouble();	
		
		double dollar = euros * 0.98;
		double dollarK = dollar /1e3;
		double dollarM = dollar/ 1e6;
		
		System.out.println();
		System.out.println("Somme saisie en Euros : " + euros + " €");
		System.out.println();
		System.out.println("Somme saisie en Dollar : " + dollar + " $");
		System.out.println("Somme saisie en Dollar : " + dollarK + " K$");
		System.out.println("Somme saisie en Dollar : " + dollarM + " M$");
		
		
	}

}
