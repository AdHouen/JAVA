
import java.util.HashMap;

import java.util.Scanner;
import java.util.Set;

public class Item1_RepertoireTelephonique_HashMap {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Utilisation du Hashmap ");

		System.out.println();

		HashMap<String, String> repertoireTelephonique = new HashMap<>();
		repertoireTelephonique.put("Paul", "0156873421");
		repertoireTelephonique.put("Moham", "097845328654");
		repertoireTelephonique.put("Gunter", "0745632189");
		repertoireTelephonique.put("Adrien", "0601020304");
		repertoireTelephonique.put("Zoe", "0712345678");

		Set<String> keys = repertoireTelephonique.keySet();

		for (String prenom : keys) {
			String value = repertoireTelephonique.get(prenom);

			System.out.println("Prenom : " + prenom + " ==> Numero de Tel : " + value);

		}

	}

}
