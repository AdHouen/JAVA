package fr.afpa.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


import javax.swing.JOptionPane;

public class MathBean {

  

    public  String rep = "";
    public  long nbFacto, nbFacto2;

    public  static final BigDecimal TAUX_EURO_DOLLAR = new BigDecimal("0.9953");
    
    


    public  void factorielleFor() {

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

//      long facto = 1;
//        for (long i = facto-1 ; i > 0 ; i--){
//            facto *= i;
//        }

    }

    public long factorielle(long i) {

        if (i == 0)
            return 1;
        else if (i < 0) {
            return -1;

        } else if (i > 20) {
            return -2;

        } else
            return (i * factorielle(i - 1));

    }

    public long factorielleAvecException(long i) {

        if (i == 0) {
            return 1;
        } else if (i < 0) {
            throw new IllegalArgumentException("Pas de valeur negative");

        } else if (i > 20) {
            throw new IllegalArgumentException("Pas de valeur superieur a 20");
        }

        return (i * factorielleAvecException(i - 1));

    }



    public BigDecimal euroToDollar(BigDecimal euro) {

        return euro.multiply(TAUX_EURO_DOLLAR);
    }

    public BigDecimal dollarToEuro(BigDecimal dollar) {

        return dollar.divide(TAUX_EURO_DOLLAR, 4 , RoundingMode.HALF_UP);
    }

    public BigInteger factorielleBig(BigInteger i) {
        

        if (i.equals(new BigInteger("0"))) {
            return BigInteger.valueOf(1);

        } else if (i.compareTo(new BigInteger("0")) < 0) {
            throw new IllegalArgumentException("Pas de valeur negative");

        }
        return i.multiply(factorielleBig(i.subtract(new BigInteger("1")))); 
      
    }
    
}
