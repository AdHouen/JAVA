import java.util.ArrayList;
import java.util.Scanner;

public class MethodeAvecArraylist {

	static Scanner scanner = new Scanner(System.in);

	public static ArrayList<String> contenuDuPanier = new ArrayList<>();

	public void afficherLeContenu() {
		System.out.println("Contenu du Panier");
		for (String element : contenuDuPanier) {
			System.out.println("- " + element);
		}
	}

	public void ajoutElementCourse() {
		System.out.println("Entrer l'article : ");
		contenuDuPanier.add(scanner.nextLine());
	}
	
	public void choixEntrerSortir () {
		System.out.println("                 Pour entrer un nouvel article : n");
		System.out.println("                 Pour sortir de l'application : q");
		System.out.println("                 Donnez votre choix");
	}
	
	public void byeBye () {
		System.out.println("Merci et à bientôt");
	}
	
	
}


