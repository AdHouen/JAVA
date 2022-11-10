import java.util.Scanner;

public class Item1 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String a, b;

		do {
			System.out.println("Veuillez saisir la premier chaine de caractere : ");
			a = scanner.nextLine();
			if (a.equalsIgnoreCase("fin")) {
				break;

			}

			System.out.println("Veuillez saisir la deuxieme chaines de caractere : ");
			b = scanner.nextLine();
			if (b.equalsIgnoreCase("fin")) {
				break;

			}

			if (a.equalsIgnoreCase(b)) {
				System.out.println("IDENTIQUE");

			}

		} while (!a.equalsIgnoreCase("fin") || !b.equalsIgnoreCase("fin"));

		System.out.println("FIN DU PROGRAMME");
	}
}
