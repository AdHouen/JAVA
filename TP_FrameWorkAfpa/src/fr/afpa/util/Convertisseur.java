package fr.afpa.util;

import java.util.Scanner;

import javax.swing.JOptionPane;

import fr.afpa.math.Math2;



public class Convertisseur {
    
    public static Scanner scanner = new Scanner(System.in);
    
    

    public static void main(String[] args) {
        
        JOptionPane.showInputDialog("Veuillez entrer la valeur a convertir en Dollars :");

       
//        Math2.valEuros = scanner.nextBigDecimal();
//
//        Math2.euroToDollar(Math2.valEuros);
        
        JOptionPane.showMessageDialog(null, "La valeur en dollars est de " + Math2.valDollars + " $" );

        

    }

}
