
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;



public class Item2_RepertoireTelephonique_TreeMap {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Maintenant trier par ordre ascendant par le prénom");

		System.out.println();

		TreeMap<String, String> repertoireTelephonique = new TreeMap<>();
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

		Item3_SerialisationRepertoire.serialisationRepertoireSurDisqueDur(repertoireTelephonique);
		
		Item4_DeSerialisationRepertoire.lireFichierTexte();
		
		

	}

	
	
	

}
