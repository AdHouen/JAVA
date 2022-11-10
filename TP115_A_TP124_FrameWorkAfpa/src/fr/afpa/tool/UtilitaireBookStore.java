package fr.afpa.tool;

import java.time.LocalDate;

import java.time.Period;

public class UtilitaireBookStore {
    
    
   static UtilitaireBookStore coucou = new UtilitaireBookStore();

    public static void main(String[] args) {
        coucou.displayAge();


    }

    
    
    
    
    
    
    
    
    
    static boolean isPretEnRetard(LocalDate dateEmpruntEffective, LocalDate maintenant, int dureeMaxPret) {

        if (maintenant.isBefore(dateEmpruntEffective))
            throw new IllegalArgumentException("La date de l'emprunt ne peut pas être supérieure à la date courante");
        {

            return maintenant.isAfter(dateEmpruntEffective.plusDays(dureeMaxPret));

        }

    }

    public int getAge(LocalDate dateNaiss, LocalDate now) {

        if (dateNaiss.equals(now)) {
            return 0;
        }
        if (dateNaiss.isBefore(now)) {

            return Period.between(dateNaiss, now).getYears();
        }

        return -1;

    }
    
    public void displayAge() {
        
        int age = coucou.getAge(LocalDate.of(2023, 11, 13), LocalDate.now());

        if (age == -1) {
            System.out.println("Erreur de date");

        } else {
            System.out.println("L'age est : " + age + " ans");        }
    }

}

//    static int getAge(LocalDate dateNaiss, LocalDateTime now) {
//        return 0;
//
//    }
