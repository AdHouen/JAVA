package fr.afpa.util;


import java.math.BigInteger;

import javax.swing.JOptionPane;

import fr.afpa.math.Math2;



public class CalculFactorBig {
    
    

    public static void main(String[] args) {
        
        do {
            
            try {
                
                String saisie = JOptionPane.showInputDialog(null,
                        "Veuillez entrer un entier naturel pour calculer sa factorielle :  ");

                if (saisie != null) {
                    BigInteger val = new BigInteger(saisie);
                    JOptionPane.showMessageDialog(null,
                            "La facotorielle de " + saisie + " est " + Math2.factorielleBig(val));
                }
                else {
                    break;
                }
            } catch (StackOverflowError e) {
                JOptionPane.showMessageDialog(null, "Dépassement de capacité");

            } 
        } while (true);
        

    }

}
