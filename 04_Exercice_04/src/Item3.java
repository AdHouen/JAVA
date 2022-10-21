
import java.util.Scanner;

public class Item3 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		double a, b, c;
		double delta, x1, x2;

		System.out.println("Resolution d'une equation du second degre de la forme ax² + bx + c = 0");

		for (;;) {
			for (;;) {
				System.out.println("Entrer la valeur de A differente de 0 : ");
				a = scanner.nextDouble();
				if (a != 0) {
					break;

				}
				System.out.println("la valeur de A ne peu pas etre nulle ");

			}
			System.out.println("Entrer la valeur de B  : ");
			b = scanner.nextDouble();

			System.out.println("Entrer la valeur de C  : ");
			c = scanner.nextDouble();

			delta = Math.pow(b, 2) - 4 * a * c;
			if (delta >= 0) {
				break;

			}
			System.out.println("Les Coef ne donnent pas de solutions sur le corps des reels");

		}

		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("X1 = " + x1 + " X2 = " + x2);

	}

}