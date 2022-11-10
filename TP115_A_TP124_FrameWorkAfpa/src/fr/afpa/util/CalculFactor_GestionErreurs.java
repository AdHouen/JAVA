package fr.afpa.util;

import javax.swing.JOptionPane;

import fr.afpa.math.Math2;

public class CalculFactor_GestionErreurs {

    public static String saisir;

    public static void main(String[] args) {
        long nbFacto;

        do {

            saisir = JOptionPane.showInputDialog("Entrer un nombre pour connaitre sa factorielle  ");

            if (saisir != null) {

                try {
                    nbFacto = Long.parseLong(saisir);
                    Math2.factorielleAvecException(nbFacto);
                    JOptionPane.showMessageDialog(null, "La factorielle de " + nbFacto + " est " + Math2.factorielleAvecException(nbFacto));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Veuillez entrer uniquement une valeur ");
                    continue;

                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());

                }

            }

        } while (saisir != null);

        System.exit(0);

    }
}
