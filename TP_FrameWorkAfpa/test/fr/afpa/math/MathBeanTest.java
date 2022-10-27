package fr.afpa.math;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathBeanTest {

    MathBean boubou;

    @BeforeEach
    void setUp() throws Exception {
        boubou = new MathBean();
    }

    @AfterEach
    void tearDown() throws Exception {
        
        boubou = null ;
    }

    @Test
    void factoBig0() {
        assertEquals("Test NOK : La factorielle de 0 est 1", boubou.factorielleBig(new BigInteger("0")),
                new BigInteger("1"));

    }

    @Test
    void factoBig1() {
        assertEquals("Test NOK : La factorielle de 0 est 1", boubou.factorielleBig(new BigInteger("1")),
                new BigInteger("1"));
    }

    @Test
    void factoBig3() {
        assertEquals("Test NOK : La factorielle de 3 est 6", boubou.factorielleBig(new BigInteger("3")),
                new BigInteger("6"));
    }

    @Test
    void factoBig20() {
        assertEquals("Test NOK : La factorielle de 20 est 2 432 902 008 176 640 000",
                boubou.factorielleBig(new BigInteger("20")), new BigInteger("2432902008176640000"));
    }

    @Test
    void factoBig21() {
        assertEquals("Test NOK : La factorielle de 21 est 51 090 942 171 709 440 000",
                boubou.factorielleBig(new BigInteger("21")), new BigInteger("51090942171709440000"));
    }

    @Test
    void factoBigMoins1() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    boubou.factorielleBig(new BigInteger("-1"));
                },
                "On ne peut pas obtenir la factorielle d'un nombre négatif");
    }

    @Test
    void factoBig9000() {
        assertThrows(StackOverflowError.class,
                () -> {
                    boubou.factorielleBig(new BigInteger("9000"));
                },
                "Depacement de capactite ");
    }

}
