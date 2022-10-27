package fr.afpa.util;

import java.math.BigInteger;

import javax.swing.JOptionPane;

import fr.afpa.math.MathBean;

public class CalculFactor2 {

    static String saisie;


    public static void main(String[] args) {

        MathBean bean = new MathBean();

        do {
            saisie = JOptionPane.showInputDialog(null,
                    "Veuillez entrer un entier naturel pour calculer sa factorielle :  ");
            if (saisie != null) {
                try {

                    BigInteger val = new BigInteger(saisie);

                    JOptionPane.showMessageDialog(null,
                            "La facotorielle de " + saisie + " est " + bean.factorielleBig(val));
                } catch (StackOverflowError e) {
                    JOptionPane.showMessageDialog(null, "Dépassement de capacité");

                }
            }

        } while (saisie != null);

    }
}