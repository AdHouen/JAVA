package eval.question;

import java.util.Scanner;

public class Quest5_Intervalle {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("*******************************************************************\n" + "Question 5\n"
				+ "Demander les deux intervalles [a ; b] et [c ; d]\n"
				+ "Si b < c ou bien a > d, l'intersection est vide\n"
				+ "Sinon, calculer deux variables : m (maximum de a et de c) et M (minimum de b et de d)\n"
				+ " et afficher l'intervalle [m; M]\n"
				+ "*******************************************************************\n\n\n");

		System.out.println("Entrer l'intervalle a :");
		int a = scanner.nextInt();
		System.out.println("Entrer l'intervalle b :");
		int b = scanner.nextInt();
		System.out.println("Entrer l'intervalle c :");
		int c = scanner.nextInt();
		System.out.println("Entrer l'intervalle d :");
		int d = scanner.nextInt();

		int min = 1;

		if (b < c || d < a) {

			System.out.println("Ensemble vide");

		} else if (c < b) {

			min = c;

			System.out.println("Intervalle [" + min + ";" + b + "]");

		}

	}

}
