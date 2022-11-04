import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		MethodeAvecArraylist appelleDesMethodes = new MethodeAvecArraylist();

		while (true) {

			appelleDesMethodes.afficherLeContenu();
			System.out.println();
			appelleDesMethodes.choixEntrerSortir();

			String donneTonChoix = scanner.nextLine().toLowerCase();

			if (donneTonChoix.equals("n")) {
				appelleDesMethodes.ajoutElementCourse();

			}
			if (donneTonChoix.equals("q")) {
				break;

			}

		}

		appelleDesMethodes.byeBye();

	}

}
