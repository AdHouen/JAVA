package item1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Properties;

import javax.swing.JOptionPane;

public class WritePropertiesVM {

	public static void main(String[] args) {
		Properties properties = System.getProperties();

		serialisationProperties1(properties);
		serialisationProperties2(properties);

	}

	static void serialisationProperties1(Properties infoProperties) {

		FileOutputStream file = null;

		try {
			file = new FileOutputStream("infos.properties");

			infoProperties.store(file, "coucou");

			JOptionPane.showMessageDialog(null, "Export terminé", "Exportation", JOptionPane.INFORMATION_MESSAGE);
//			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Le fichier infos.properties est introuvable", "Erreur",
					JOptionPane.ERROR_MESSAGE);

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Problème d'écriture", "Erreur", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				file.close();
			} catch (IOException e) {
				System.out.println("Erreur");

			}

		}

	}

	static void serialisationProperties2(Properties infoProperties) {

		try (FileOutputStream file = new FileOutputStream("infos2.properties")) {

			infoProperties.store(file, "coucou");

			JOptionPane.showMessageDialog(null, "Export terminé", "Exportation", JOptionPane.INFORMATION_MESSAGE);
//			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Le fichier infos.properties est introuvable", "Erreur",
					JOptionPane.ERROR_MESSAGE);

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Problème d'écriture", "Erreur", JOptionPane.ERROR_MESSAGE);
		}

	}

}