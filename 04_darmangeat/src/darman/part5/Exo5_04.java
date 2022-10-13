package darman.part5;

import java.util.Scanner;

public class Exo5_04 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Veuillez entrer un nombre pour connaitre les 10 suivants :");
		int nombre = scanner.nextInt();
		int nombreMax = nombre + 10;

		System.out.println("Les nombres suivants sont : ");

		while (nombre < nombreMax) {
			System.out.println(nombre+1);
			nombre = nombre +1;

		}

	}

}
