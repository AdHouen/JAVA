package item2;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class AfficheFichierTexte {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Entrer le fichier a lire");

		try {
			// Le fichier d'entrée
			String fileName = scanner.nextLine();
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			System.out.println("Contenu du fichier : ");
			System.out.println();

			// renvoie true s'il y a une autre ligne à lire
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (IOException e) {
			System.out.println("Erreur de lecture ");
		}
	}
}
