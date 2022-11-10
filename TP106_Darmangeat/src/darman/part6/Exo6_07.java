package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_07 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		double[] monTabNote = new double[9];
		double total = 0;

		for (int i = 0; i < monTabNote.length; i++) {
			System.out.print("Veuillez entrer une note : ");
			monTabNote[i] = scanner.nextDouble();
			total = total + monTabNote[i];

		}

		double moyenne = total / monTabNote.length;

		System.out.printf(" Mes notes sont : %s\n ", Arrays.toString(monTabNote));

		System.out.printf("La moyenne de mes notes est %.2f ", moyenne);

	}

}
