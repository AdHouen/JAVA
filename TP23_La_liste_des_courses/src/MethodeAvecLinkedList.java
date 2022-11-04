import java.util.LinkedList;
import java.util.Scanner;

public class MethodeAvecLinkedList {

	static Scanner scanner = new Scanner(System.in);
//////// MEME CHOSE MAIS AVEC LINKEDLIST ////////////////
//	En modifiant l'ArrayList par la LinkedList on ne change pas le fonctionnement du programme 
//	mais son emplacement en mémoire
//  Google :
//  ArrayList internally uses a dynamic array to store the elements.
//  LinkedList internally uses a doubly linked list to store the elements
//  Le temps d'exécution sera plus long pour l'ArrayList si on a une mega liste 
//	et qu'on y supprime un élément.
     
	
	public static LinkedList<String> contenuDuPanier = new LinkedList <>();

	
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


