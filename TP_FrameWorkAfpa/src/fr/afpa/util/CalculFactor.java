package fr.afpa.util;

import javax.swing.JOptionPane;

import fr.afpa.math.Math2;

public class CalculFactor {

    public static void main(String[] args) {

        do {

            JOptionPane.showMessageDialog(null,
                    "Veuillez entrer un nombre pour connaitre la valeur de sa factorielle ");
            String saisir = JOptionPane.showInputDialog("Entrer un nombre ");

            long nbFacto = Long.parseLong(saisir);

            long result = Math2.factorielle(nbFacto);

            if (result == -1) {
                JOptionPane.showMessageDialog(null, "Erreur -1 : Le nombre choisi est negatif");

            } else if (result == -2) {
                JOptionPane.showMessageDialog(null, "Erreur -2 : Le nombre est trop grand");

            } else if (result > 0) {
                JOptionPane.showMessageDialog(null, "La factorielle de " + nbFacto + " est de " + result); 

            }

            Math2.rep = Math2.reponse();

        } while (Math2.rep.equalsIgnoreCase("o"));

    }
}