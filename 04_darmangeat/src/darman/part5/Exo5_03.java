package darman.part5;

import java.util.Scanner;

public class Exo5_03 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Veuillez entrer un nombre pour connaitre les 10 suivants :");
		int nombre = scanner.nextInt();

		for (int i = nombre + 1; i < nombre + 11; i++) {
			System.out.println(i);

		}

	}

}
