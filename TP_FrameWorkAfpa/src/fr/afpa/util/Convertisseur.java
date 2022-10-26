package fr.afpa.util;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.JOptionPane;

import fr.afpa.math.Math2;

public class Convertisseur {

    public static Scanner scanner = new Scanner(System.in);
    public static BigDecimal val;
    public static BigDecimal conVal;
    public static String saisie1;
    public static String saisie2;

    public static void main(String[] args) {
        ///////////////////// AVEC JOPTIONPANE /////////////////

        do {
            saisie1 = JOptionPane.showInputDialog("Voulez vous convertir des Euros € ===> Dollar $ (Taper 1) ou des Dollar $ ===> Euros € (Taper 2)");

            if (saisie1 != null) {
                long choix = Long.parseLong(saisie1);

                if (choix != 1 && choix != 2) {
                    JOptionPane.showMessageDialog(null, "Je n'ai pas compris votre choix");

                } else if (choix == 1) {

                    saisie2 = JOptionPane
                            .showInputDialog("Veuillez saisir la valeur en Euro € a convertir en Dollar $");

                    BigDecimal test = new BigDecimal(saisie2);

                    conVal = Math2.euroToDollar(test);

                    JOptionPane.showMessageDialog(null, "La valeur en dollars est de " + conVal + " $");

                } else if (choix == 2) {

                    saisie2 = JOptionPane
                            .showInputDialog("Veuillez saisir la valeur en Dollar $ a convertir en Euro €");

                    BigDecimal test = new BigDecimal(saisie2);

                    conVal = Math2.dollarToEuro(test);

                    JOptionPane.showMessageDialog(null, "La valeur en euros est de " + conVal + " € ");

                }

            }

        } while (saisie1 != null);

        System.exit(0);

        //////////////////// AVEC PRINTLN /////////////////
        
        
//        System.out.println(
//                "Voulez vous convertir des Euros € ===> Dollar $ (Taper 1) ou des Dollar $ ===> Euros € (Taper 2)");
//        int choix = scanner.nextInt();
//
//        if (choix != 1 && choix != 2) {
//            System.out.println("Je n'ai pas compris votre choix");
//            
//        } else if (choix == 1) {
//            System.out.println("Veuillez saisir la valeur en Euro € a convertir en Dollar $");
//            val = scanner.nextBigDecimal();
//
//            conVal = Math2.euroToDollar(val);
//
//            System.out.println("La valeur en dollars est de " + conVal + " $");
//
//        } else if (choix == 2) {
//
//            System.out.println("Veuillez saisir la valeur en Dollar $ a convertir en Euro €");
//            val = scanner.nextBigDecimal();
//
//            conVal = Math2.dollarToEuro(val);
//
//            System.out.println("La valeur en euros est de " + conVal + " €");
//
//        }
//
//        scanner.close();
//
//    }
    }

}

//String saisie = JOptionPane.showInputDialog("Veuillez entrer la valeur a convertir en Dollars :");

//Math2.euroToDollar("saisie");

//System.out.println("La valeur en dollars est de " + new BigDecimal(saisie));
//JOptionPane.showMessageDialog(null, "La valeur en dollars est de " + Math2.euroToDollar(Math2.valEuros) + " $" );