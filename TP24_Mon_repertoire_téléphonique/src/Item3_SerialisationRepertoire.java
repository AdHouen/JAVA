import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Item3_SerialisationRepertoire {

	static void serialisationRepertoireSurDisqueDur(Map<String, String> contacts) {
		try (PrintWriter writer = new PrintWriter("repertoire.txt", StandardCharsets.UTF_8)) {
			for (Map.Entry<String, String> values : contacts.entrySet()) {
				writer.println(values.getKey() + " : " + values.getValue());
			}
		} catch (IOException e) {
			System.out.println("Erreur dans l'écriture du fichier " + e.getMessage());
		}
	}

	static void serialisationRepertoireSurDisqueDur2(TreeMap<String, String> repertoireTelephonique) {

		try {
			FileOutputStream file = new FileOutputStream("repertoire.txt");
			ObjectOutputStream obj = new ObjectOutputStream(file);
			obj.writeObject(repertoireTelephonique);
			JOptionPane.showMessageDialog(null, "Export terminé", "Exportation", JOptionPane.INFORMATION_MESSAGE);
			obj.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Le fichier repertoire.txt est introuvable", "Erreur",
					JOptionPane.ERROR_MESSAGE);

		}
		catch (IOException e) {
        	JOptionPane.showMessageDialog(null, "Problème d'écriture","Erreur",JOptionPane.ERROR_MESSAGE);
        }

	}
}
