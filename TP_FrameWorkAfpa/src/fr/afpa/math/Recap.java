package fr.afpa.math;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class Recap {

    public static String saisirNb1 = JOptionPane.showInputDialog("Saisir nb1");
    public static String saisirNb2 = JOptionPane.showInputDialog("Saisir nb2");
    public static BigDecimal nb1 = new BigDecimal(saisirNb1);
    public static BigDecimal nb2 = new BigDecimal(saisirNb2);

    public static void main(String[] args) {

//        multiplier();
//        diviser();
//        addition();
//        soustraction();
        affichage();
    }

    private static void affichage() {
        JOptionPane.showMessageDialog(null, 
                "Multiplication " + nb1 + " x " + nb2 + " = " + nb1.multiply(nb2)
                + "\nDivision " + nb1 + " : " + nb2 + " = " + nb1.divide(nb2) 
                + "\nAddition " + nb1 + " + " + nb2 + " = " + nb1.add(nb2) 
                + "\nSoustraction " + nb1 + " - " + nb2 + " = " + nb1.subtract(nb2));
        
    }

    
//    public static BigDecimal multiplier() { 
//
//        BigDecimal result = nb1.multiply(nb2);
//        
//
//        return result;
//    }
//
//    public static BigDecimal diviser() {
//
//        BigDecimal result = nb1.divide(nb2);
//        
//
//        return result;
//    }
//
//    public static BigDecimal addition() {
//
//        BigDecimal result = nb1.add(nb2);
//        
//
//        return result;
//    }
//
//    public static BigDecimal soustraction() {
//
//        BigDecimal result = nb1.subtract(nb2);
//        
//
//        return result;
//    }

}
