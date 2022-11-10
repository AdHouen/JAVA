package fr.afpa.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Math2 {

    public static Scanner scanner = new Scanner(System.in);

    public static String rep = "";
    public static long nbFacto, nbFacto2;

    public static final BigDecimal TAUX_EURO_DOLLAR = new BigDecimal("0.9953");
//    public static final BigDecimal TAUX_DOLLAR_EURO = new BigDecimal("1.0032");

    public static void factorielleFor() {

        JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre pour connaitre la valeur de sa factorielle ");
        String saisir = JOptionPane.showInputDialog("Entrer un nombre ");

        long nbFacto = Long.parseLong(saisir);

        long facto = 1;
        long iteration = 1;

        while (iteration <= nbFacto) {
            facto = facto * iteration;
            iteration = iteration + 1;

        }
        if (nbFacto > 0 && nbFacto <= 20) {
            JOptionPane.showMessageDialog(null, "La factorielle de " + nbFacto + " est de " + facto);

        }

        if (nbFacto < 1) {
            JOptionPane.showMessageDialog(null, "Erreur -1");

        }
        if (nbFacto > 20) {
            JOptionPane.showMessageDialog(null, "Erreur -2");

        }

//		long facto = 1;
//	      for (long i = facto-1 ; i > 0 ; i--){
//	          facto *= i;
//	      }

    }

    public static long factorielle(long i) {

        if (i == 0)
            return 1;
        else if (i < 0) {
            return -1;

        } else if (i > 20) {
            return -2;

        } else
            return (i * factorielle(i - 1));

    }

    public static long factorielleAvecException(long i) {

        if (i == 0) {
            return 1;
        } else if (i < 0) {
            throw new IllegalArgumentException("Pas de valeur negative");

        } else if (i > 20) {
            throw new IllegalArgumentException("Pas de valeur superieur a 20");
        }

        return (i * factorielleAvecException(i - 1));

    }

    public static String reponse() {
        String saisir = "";
        do {
//			JOptionPane.showMessageDialog(null,"\nVoulez-vous continuer (O/N) ? ");
            saisir = JOptionPane.showInputDialog("Voulez-vous continuer (O/N) ?");

//			rep = scanner.nextLine();

            if (saisir.equals("o")) {
                JOptionPane.showMessageDialog(null, "On continue");

                break;

            } else if (saisir.equals("n")) {
                JOptionPane.showMessageDialog(null, "On arrete");
                break;
            }

        } while (!saisir.equalsIgnoreCase("o") || !saisir.equalsIgnoreCase("n"));

        return saisir;

    }

//	public static boolean reponse2() {
//		
//		do {
//			System.out.print("\nVoulez-vous continuer (O/N) ? ");
//			reponse = scanner.nextLine();
//			
//			if (reponse.equals("o")) {
//				System.out.println("On continue");
//				return true;
//				
//
//			} else if (reponse.equals("n")) {
//				System.out.println("On arrete");
//				return false;
//			} 
//			
//		} while (!reponse.equalsIgnoreCase("o") || !reponse.equalsIgnoreCase("n"));
//		
//		
//		return false;
//	}

    public static BigDecimal euroToDollar(BigDecimal euro) {

        return euro.multiply(TAUX_EURO_DOLLAR);
    }

    public static BigDecimal dollarToEuro(BigDecimal dollar) {

        return dollar.divide(TAUX_EURO_DOLLAR, 4 , RoundingMode.HALF_UP);
    }

    public static BigInteger factorielleBig(BigInteger i) {
        

        if (i.equals(new BigInteger("0"))) {
            return BigInteger.valueOf(1);

        } else if (i.compareTo(new BigInteger("0")) < 0) {
            throw new IllegalArgumentException("Pas de valeur negative");

        }
//            else if (i.compareTo(new BigInteger("20")) > 20) {
//            throw new IllegalArgumentException("Pas de valeur superieur a 20");
//        }
        return i.multiply(factorielleBig(i.subtract(new BigInteger("1")))); 
      
    }
    
}
