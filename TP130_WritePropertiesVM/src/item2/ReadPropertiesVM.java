package item2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;

import javax.swing.JOptionPane;

public class ReadPropertiesVM {
	public static void main(String[] args) {
		Properties properties = new Properties();
		

		lireFichier1(properties);
		properties.forEach((k, v) -> System.out.println(k + " =====> " + v));
		lireFichier2(properties);
		properties.forEach((k, v) -> System.out.println(k + " =====> " + v));
		
		

	}

	private static void lireFichier1(Properties lireFichierProperties) {
		FileInputStream file = null;

		try {
			file = new FileInputStream("infos_new.properties");
			lireFichierProperties.load(file);

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Le fichier repertoire.txt est introuvable", "Erreur",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Problème de lecture", "Erreur", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				file.close();
			} catch (IOException e) {
				System.out.println("Erreur");

			}
		

		}
		

	}

	private static void lireFichier2(Properties lireFichierProperties) {

		try (FileInputStream file = new FileInputStream("infos_new.properties")) {

			lireFichierProperties.load(file);

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Le fichier repertoire.txt est introuvable", "Erreur",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Problème de lecture", "Erreur", JOptionPane.ERROR_MESSAGE);
		}

	}
}
