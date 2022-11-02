package fr.afpa.tool;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import javax.swing.plaf.basic.BasicMenuBarUI;

import org.junit.Assert;

import org.junit.jupiter.api.AfterEach;
;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;





class UtilitaireBookStoreTest {
    
    UtilitaireBookStore baba;

//    @BeforeAll
//    static void setUpBeforeClass() throws Exception {
//    }
//
//    @AfterAll
//    static void tearDownAfterClass() throws Exception {
//    }

    @BeforeEach
    void setUp() throws Exception {
        baba = new UtilitaireBookStore();
    }

    @AfterEach
    void tearDown() throws Exception {
        baba = null;
    }


    @Test
    void testCalculAge() {
        
        LocalDate dateNaiss = LocalDate.of(1989, 11, 13);
        //exercise
        int actual = baba.getAge(dateNaiss, LocalDate.now());
        // assert
//        Assert.assertEquals(32, actual);
        
        System.out.println("Age de base : " + actual + " ans");
    }
    @Test
    void testCalculAgeSame() {
        
        LocalDate dateNaiss = LocalDate.of(2022, 11, 02);
        //exercise
        int actual = baba.getAge(dateNaiss, LocalDate.now());
        // assert
//        Assert.assertEquals(32, actual);
        
        System.out.println("Age Same : " + actual + " ans");
    }
    
    @Test
    void testCalculAgeNeg() {
        
        LocalDate dateNaiss = LocalDate.of(2023, 11, 02);
        //exercise
        int actual = baba.getAge(dateNaiss, LocalDate.now());
        // assert
//        Assert.assertEquals(32, actual);
        
        System.out.println("Age Neg : " + actual + " ans");
    }
    
    
    
    
}


