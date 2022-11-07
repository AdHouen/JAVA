package eval.question;

public class Quest7_De_Correction2 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************\n" + "Question 7\n"
				+ "Lancer un dé ( valeur aléatoire de 1 à 6 ) 15 fois.\n"
				+ "Afficher les sorties et  afficher le nombre de sorties du\n"
				+ "chiffre 1, de 2, de 3, de 4, de 5 et de 6\n"
				+ "*******************************************************************\n\n\n");

		int nombreUn = 0;
		int nombreDeux = 0;
		int nombreTrois = 0;
		int nombreQuatre = 0;
		int nombreCinq = 0;
		int nombreSix = 0;

		for (int i = 1; i <= 15; i++) {
			int chiffreDe = (int) (Math.ceil(Math.random() * 6));
			System.out.println("Lancé numéro " + i + " = " + chiffreDe);

			switch (chiffreDe) {
			case 1:
				nombreUn++;
				break;
			case 2:
				nombreDeux++;
				break;
			case 3:
				nombreTrois++;
				break;
			case 4:
				nombreQuatre++;
				break;
			case 5:
				nombreCinq++;
				break;
			default:
				nombreSix++;
			}
		}

		System.out.println("Le chiffre 1 est sorti " + nombreUn + " fois");
		System.out.println("Le chiffre 2 est sorti " + nombreDeux + " fois");
		System.out.println("Le chiffre 3 est sorti " + nombreTrois + " fois");
		System.out.println("Le chiffre 4 est sorti " + nombreQuatre + " fois");
		System.out.println("Le chiffre 5 est sorti " + nombreCinq + " fois");
		System.out.println("Le chiffre 6 est sorti " + nombreSix + " fois");

	}

}
