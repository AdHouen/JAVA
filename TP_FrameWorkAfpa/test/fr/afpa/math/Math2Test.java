package fr.afpa.math;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class Math2Test {
    
    //////////////FACTORIELLE AVEC EXCEPTION ////////////////

    @Test
    void facto0() {
        assertEquals("Test NOK : La factorielle de 0 est 1", Math2.factorielleAvecException(0), 1);
    }

    @Test
    void facto1() {
        assertEquals("Test NOK : La factorielle de 1 est 1", Math2.factorielleAvecException(1), 1);
    }

    @Test
    void facto3() {
        assertEquals("Test NOK : La factorielle de 3 est 6", Math2.factorielleAvecException(3), 6);
    }

    @Test
    void facto20() {
        assertEquals("Test NOK : La factorielle de 20 est 2 432 902 008 176 640 000", Math2.factorielleAvecException(20), 2_432_902_008_176_640_000L);
    }

    @Test
    void facto21() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Math2.factorielleAvecException(21);
                },
                "La factorielle de 21 est Hors Limite");
    }

    @Test
    void factoMoins1() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Math2.factorielleAvecException(21);
                },
                "On ne peut pas obtenir la factorielle d'un nombre négatif");
    }

    @Test
    void facto45() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Math2.factorielleAvecException(45);
                },
                "La factorielle de 45 est Hors Limite");
    }
    
    
    ////////////// FIN FACTORIELLE AVEC EXCEPTION ////////////////
    
    ////////////// FACTORIELLE AVEC BIGINTEGER //////////////////
    @Test
    void factoBig0() {
        assertEquals("Test NOK : La factorielle de 0 est 1", Math2.factorielleBig(new BigInteger("0")), new BigInteger("1"));
        
    }
    
    @Test
    void factoBig1() {
        assertEquals("Test NOK : La factorielle de 0 est 1", Math2.factorielleBig(new BigInteger("1")), new BigInteger("1"));
    }
    
    @Test
    void factoBig3() {
        assertEquals("Test NOK : La factorielle de 3 est 6", Math2.factorielleBig(new BigInteger("3")), new BigInteger("6"));
    }
    
    @Test
    void factoBig20() {
        assertEquals("Test NOK : La factorielle de 20 est 2 432 902 008 176 640 000",
                Math2.factorielleBig(new BigInteger("20")), new BigInteger("2432902008176640000"));
    }
    
    @Test
    void factoBig21() {
        assertEquals("Test NOK : La factorielle de 21 est 51 090 942 171 709 440 000",
                Math2.factorielleBig(new BigInteger("21")), new BigInteger("51090942171709440000"));
    }
    
    @Test
    void factoBigMoins1() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Math2.factorielleBig(new BigInteger("-1"));
                },
                "On ne peut pas obtenir la factorielle d'un nombre négatif");
    }
    @Test
    void factoBig9000() {
        assertThrows(StackOverflowError.class,
                () -> {
                    Math2.factorielleBig(new BigInteger("9000"));
                },
                "Depacement de capactite ");
    }
    
    

}
