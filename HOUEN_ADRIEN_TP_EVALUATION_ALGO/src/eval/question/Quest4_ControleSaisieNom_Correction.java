package eval.question;

import java.util.Scanner;

/**
 * Contrôle du nom entré par l'utilisateur
 */

public class Quest4_ControleSaisieNom_Correction {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "*******************************************************************\n" +
                        "Question 4\n" +
                        "On demande la saisie d’un nom de famille.\n" +
                        "La saisie sera redemandée tant que :\n" +
                        "	le nom contiendra un caractère numérique ,\n" +
                        "	La longueur sera inférieure à 2,\n" +
                        "	La longueur sera supérieure à 10 .\n" +
                        "*******************************************************************\n\n\n"
        );

/////////////////

        System.out.println("Entrez un nom de famille");
        String nomDeFamille = scanner.nextLine();
        String[] nomDeFamilleLettreParLettre = nomDeFamille.split("");

        boolean problemeNomDeFamille = false;
        for (String lettre : nomDeFamilleLettreParLettre) {
            if (!lettre.matches("[A-z]")) {
                problemeNomDeFamille = true;
                break;
            }
        }
        
        if (nomDeFamille.length() < 2 || nomDeFamille.length() > 10) {
        	problemeNomDeFamille = true;
        }

        if (!problemeNomDeFamille) {
            System.out.println(nomDeFamille + " est correct");
        } else {
            System.out.println("Le nom de famille ne doit contenir que des caractères et avoir entre 2 et 10");
        }
    }
/////////////////

}


