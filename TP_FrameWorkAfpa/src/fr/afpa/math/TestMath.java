package fr.afpa.math;

import java.math.BigDecimal;

public class TestMath {

    public static void main(String[] args) {
        
        factorielleTest45();
        factorielleTestMoinsUn();
        factorielleTest21();
        factorielleTest20();
        factorielleTestUn();
        factorielleTestZero();
        euroToDollarTest1();
        euroToDollarTest2();
        dollarToEuroTest1();
        dollarToEuroTest2();

    }

    private static void factorielleTest45() {
        if (Math2.factorielle(45) == -2) {
            System.out.println("Test 1 OK");

        } else {
            System.err.println("Test NOK : La factorielle de 45 vaut -2");
        }

    }

    private static void factorielleTestMoinsUn() {
        if (Math2.factorielle(-1) == -1) {
            System.out.println("Test 2 OK");

        } else {
            System.err.println("Test NOK : La factorielle de -1 vaut -1");
        }

    }

    private static void factorielleTest21() { 
        if (Math2.factorielle(21) == -2) {
            System.out.println("Test 3 OK");

        } else {
            System.err.println("Test NOK : La factorielle de 21 vaut -2");
        }

    }

    private static void factorielleTest20() {

        long max = 2432902008176640000L;

        if (Math2.factorielle(20) == max) {
            System.out.println("Test 4 OK");

        } else {
            System.err.println("Test NOK : La factorielle de 20 vaut 2432902008176640000");
        }

    }

    private static void factorielleTestUn() {

        if (Math2.factorielle(1) == 1) {
            System.out.println("Test 5 OK"); 

        } else {
            System.err.println("Test NOK : La factorielle de 1 vaut 1");
        }

    }

    private static void factorielleTestZero() {

        if (Math2.factorielle(0) == 1) {
            System.out.println("Test 6 OK");

        } else {
            System.err.println("Test NOK : La factorielle de 0 vaut 1");
        }

    }
    
    private static void euroToDollarTest1() {

        if (Math2.euroToDollar(new BigDecimal(10)).equals(new BigDecimal("9.9530")) ) {
            System.out.println("Test 7 OK");

        } else {
            System.err.println("Test NOK : La valeur en € to $ vaut 9.9530");
        }

    }
    private static void euroToDollarTest2() {

        if (Math2.euroToDollar(new BigDecimal(25)).equals(new BigDecimal("24.8825")) ) {
            System.out.println("Test 8 OK");

        } else {
            System.err.println("Test NOK : La valeur en € to $ vaut 24.8825");
        }

    }
    private static void dollarToEuroTest1() {

        if (Math2.dollarToEuro(new BigDecimal(10)).compareTo(new BigDecimal("10.0320")) == 0) {
            System.out.println("Test 9 OK");

        } else {
            System.err.println("Test NOK : La valeur en $ to € vaut 10.0320");
        }

    }
    private static void dollarToEuroTest2() {

        if (Math2.dollarToEuro(new BigDecimal(25)).compareTo(new BigDecimal("25.0800")) == 0) {
            System.out.println("Test 10 OK");

        } else {
            System.err.println("Test NOK : La valeur de $ to € vaut 25.0800");
        }

    }
    
    

}
