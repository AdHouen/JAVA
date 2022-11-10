
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class MethodeAvecInterfaceList {

	static Scanner scanner = new Scanner(System.in);
//////// MEME CHOSE MAIS AVEC LINKEDLIST ////////////////
//	En modifiant l'ArrayList par la LinkedList on ne change pas le fonctionnement du programme 
//	mais son emplacement en mémoire
//  Google :
//  ArrayList internally uses a dynamic array to store the elements.
//  LinkedList internally uses a doubly linked list to store the elements
//  Le temps d'exécution sera plus long pour l'ArrayList si on a une mega liste 
//	et qu'on y supprime un élément.
     
	
	public static List<String> contenuDuPanier = new ArrayList<>();

	
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








//private final List<String> objetList = new List<String>() {

//        @Override
//        public int size() {
//            return 0;
//        }
//
//        @Override
//        public boolean isEmpty() {
//            return false;
//        }
//
//        @Override
//        public boolean contains(Object o) {
//            return false;
//        }
//
//        @Override
//        public Iterator<String> iterator() {
//            return null;
//        }
//
//        @Override
//        public Object[] toArray() {
//            return new Object[0];
//        }
//
//        @Override
//        public <T> T[] toArray(T[] a) {
//            return null;
//        }
//
//        @Override
//        public boolean add(String s) {
//            return false;
//        }
//
//        @Override
//        public boolean remove(Object o) {
//            return false;
//        }
//
//        @Override
//        public boolean containsAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public boolean addAll(Collection<? extends String> c) {
//            return false;
//        }
//
//        @Override
//        public boolean addAll(int index, Collection<? extends String> c) {
//            return false;
//        }
//
//        @Override
//        public boolean removeAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public boolean retainAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public void clear() {
//
//        }
//
//        @Override
//        public String get(int index) {
//            return null;
//        }
//
//        @Override
//        public String set(int index, String element) {
//            return null;
//        }
//
//        @Override
//        public void add(int index, String element) {
//
//        }
//
//        @Override
//        public String remove(int index) {
//            return null;
//        }
//
//        @Override
//        public int indexOf(Object o) {
//            return 0;
//        }
//
//        @Override
//        public int lastIndexOf(Object o) {
//            return 0;
//        }
//
//        @Override
//        public ListIterator<String> listIterator() {
//            return null;
//        }
//
//        @Override
//        public ListIterator<String> listIterator(int index) {
//            return null;
//        }
//
//        @Override
//        public List<String> subList(int fromIndex, int toIndex) {
//            return null;
//        }




/*
Si on implemente l'interface List, il faut @Override l'ensemble de ses méthodes.
Dans ce cas on Overrride List par PanierVirtuel qui est son enfant c'est donc un down-casting
 */
