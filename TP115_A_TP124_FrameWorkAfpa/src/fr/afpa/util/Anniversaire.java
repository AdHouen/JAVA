package fr.afpa.util;

import java.time.LocalDate;


import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class Anniversaire {

    public static void main(String[] args) {

        do {

            String dateNaissance = JOptionPane.showInputDialog("Veuillez entrer votre date de naissance (jj/mm) : ");

            if (dateNaissance != null) {

                try {

                    MonthDay maDate;

                    maDate = MonthDay.parse(dateNaissance, DateTimeFormatter.ofPattern("dd/MM"));
                    int annee = LocalDate.now().getYear();
                    LocalDate newDateWithYear = maDate.atYear(annee);
                    LocalDate now = LocalDate.now();
                    if (newDateWithYear.isBefore(now)) {

                        newDateWithYear = newDateWithYear.plusYears(1);
//                        annee++;
//                        newDateWithYear = maDate.atYear(annee);
                    }
//                    LocalTime heureNow = LocalTime.now();
//                    LocalDateTime newDateTime = newDate.atTime(heureNow);
//                    long intervalDays = ChronoUnit.DAYS.between(LocalDateTime.now(), newDateTime);
                    long intervalDays = ChronoUnit.DAYS.between(LocalDate.now(), newDateWithYear);
                    JOptionPane.showMessageDialog(null, "Votre anniversaire est dans  " + intervalDays + " jours");

                } catch (DateTimeParseException ex) {
                    JOptionPane.showMessageDialog(null, "Veuillez entrer une date correcte");

                }
            } else {
                break;
            }

        } while (true);

    }
}
