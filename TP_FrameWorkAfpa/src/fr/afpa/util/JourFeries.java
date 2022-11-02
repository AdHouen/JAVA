package fr.afpa.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;

public class JourFeries {
    
    public static void main(String[] args) {
        
        String saisie = JOptionPane.showInputDialog(null, "Veuillez saisir l'année ");
        
        LocalDate anneeDate = LocalDate.parse(saisie);
        
        
        
        
        JOptionPane.showMessageDialog(null, "Calendrier Francais de " + anneeDate );
        
    }
    
    private static boolean isJourTravaille(Calendar p_date)
    {
        // On constitue la liste des jours fériés
        final List < Calendar > joursFeries = new ArrayList < Calendar > ();
        // On recherche les jours fériés de l'année de la date en paramètre
        final Calendar jourFerie = (Calendar) p_date.clone();
        jourFerie.set(jourFerie.get(Calendar.YEAR), Calendar.JANUARY, 1);
        joursFeries.add((Calendar) jourFerie.clone());
        jourFerie.set(jourFerie.get(Calendar.YEAR), Calendar.MAY, 1);
        joursFeries.add((Calendar) jourFerie.clone());
        jourFerie.set(jourFerie.get(Calendar.YEAR), Calendar.MAY, 8);
        joursFeries.add((Calendar) jourFerie.clone());
        jourFerie.set(jourFerie.get(Calendar.YEAR), Calendar.JULY, 14);
        joursFeries.add((Calendar) jourFerie.clone());
        jourFerie.set(jourFerie.get(Calendar.YEAR), Calendar.AUGUST, 15);
        joursFeries.add((Calendar) jourFerie.clone());
        jourFerie.set(jourFerie.get(Calendar.YEAR), Calendar.NOVEMBER, 1);
        joursFeries.add((Calendar) jourFerie.clone());
        jourFerie.set(jourFerie.get(Calendar.YEAR), Calendar.NOVEMBER, 11);
        joursFeries.add((Calendar) jourFerie.clone());
        jourFerie.set(jourFerie.get(Calendar.YEAR), Calendar.DECEMBER, 25);
        joursFeries.add((Calendar) jourFerie.clone());
 
        // Calcul du jour de pâques (algorithme de Oudin (1940))
        // Calcul du nombre d'or - 1
        final int intGoldNumber = p_date.get(Calendar.YEAR) % 19;
        // Année divisé par cent
        final int intAnneeDiv100 = (int) (p_date.get(Calendar.YEAR)
                / Constantes.FACTEUR_100);
        // intEpacte est = 23 - Epacte (modulo 30)
        final int intEpacte = (intAnneeDiv100 - intAnneeDiv100 / 4
                - (8 * intAnneeDiv100 + 13) / 25
                + (19 * intGoldNumber) + 15) % 30;
        // Le nombre de jours à partir du 21 mars
        // pour atteindre la pleine lune Pascale
        final int intDaysEquinoxeToMoonFull = intEpacte - (intEpacte / 28)
                * (1 - (intEpacte / 28) * (29 / (intEpacte + 1))
                        * ((21 - intGoldNumber) / 11));
        // Jour de la semaine pour la pleine lune Pascale (0=dimanche)
        final int intWeekDayMoonFull = (p_date.get(Calendar.YEAR)
                + p_date.get(Calendar.YEAR) / 4
                + intDaysEquinoxeToMoonFull + 2 - intAnneeDiv100
                + intAnneeDiv100 / 4) % 7;
        // Nombre de jours du 21 mars jusqu'au dimanche de ou
        // avant la pleine lune Pascale (un nombre entre -6 et 28)
        final int intDaysEquinoxeBeforeFullMoon =
            intDaysEquinoxeToMoonFull - intWeekDayMoonFull;
        // mois de pâques
        final int intMonthPaques = 3
            + (intDaysEquinoxeBeforeFullMoon + 40) / 44;
        // jour de pâques
        final int intDayPaques = intDaysEquinoxeBeforeFullMoon + 28
                                    - 31 * (intMonthPaques / 4);
        // lundi de pâques
        jourFerie.set(
                p_date.get(Calendar.YEAR), intMonthPaques - 1, intDayPaques + 1);
        final Calendar lundiDePaque = (Calendar) jourFerie.clone();
        joursFeries.add(lundiDePaque);
        // Ascension
        final Calendar ascension = (Calendar) lundiDePaque.clone();
        ascension.add(Calendar.DATE, 38);
        joursFeries.add(ascension);
        //Pentecote
        final Calendar lundiPentecote = (Calendar) lundiDePaque.clone();
        lundiPentecote.add(Calendar.DATE, 48);
        joursFeries.add(lundiPentecote);
        if (joursFeries.contains(p_date)
                || p_date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
                || p_date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            return false;
        }
        return true;
    }

}
