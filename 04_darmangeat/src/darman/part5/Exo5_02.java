package darman.part5;

import java.util.Scanner;

public class Exo5_02 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Veuillez entrer un numero compris entre 10 et 20");

		while (true) {
			
			int numero = scanner.nextInt();

			if (numero > 20) {
				System.out.println("Veuillez rentrer un nombre plus petit ");
			} else if (numero < 10) {
				System.out.println("Veuillez rentrer un nombre plus grand ");
			} else {
				System.out.println("Le numero indiqué me convient ");
				break;
			}

		}
	}

}
