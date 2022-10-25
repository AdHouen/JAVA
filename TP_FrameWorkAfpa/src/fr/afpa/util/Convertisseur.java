package fr.afpa.util;

import java.util.Scanner;

import fr.afpa.math.Math2;

public class Convertisseur {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(
                "Voulez vous convertir des Euros € ===> Dollar $ (Taper 1) ou des Dollar $ ===> Euros € (Taper 2)");
        int choix = scanner.nextInt();

        if (choix != 1 && choix != 2) {
            System.out.println("Je n'ai pas compris votre choix");
        }

        if (choix == 1) {
            System.out.println("Veuillez saisir la valeur en Euro € a convertir en Dollar $");

            Math2.euroToDollar(Math2.valEuros);

            System.out.println("La valeur en dollars est de " + Math2.conValDollars + " $");

        }
        if (choix == 2) {

            System.out.println("Veuillez saisir la valeur en Dollar $ a convertir en Euro €");

            Math2.dollarToEuro(Math2.valDollars);

            System.out.println("La valeur en euros est de " + Math2.conValEuros + " €");

        }

        scanner.close();

    }

}

//String saisie = JOptionPane.showInputDialog("Veuillez entrer la valeur a convertir en Dollars :");

//Math2.euroToDollar("saisie");

//System.out.println("La valeur en dollars est de " + new BigDecimal(saisie));
//JOptionPane.showMessageDialog(null, "La valeur en dollars est de " + Math2.euroToDollar(Math2.valEuros) + " $" );