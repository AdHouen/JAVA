package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_03 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		double[] monTabNote = new double[9];

		for (int i = 0; i < monTabNote.length; i++) {
			System.out.print("Veuillez entrer une note : ");
			monTabNote[i] = scanner.nextDouble();

		}

		System.out.printf("Mes notes sont : %s ", Arrays.toString(monTabNote));

	}

}
