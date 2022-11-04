package Windows;

import Rachunek.Rachunek;
import Rachunek.Rachunek_jx;
import Zakup.Zakup;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Windows {
    public void windowsVersion() {
        List<Zakup> lista = new ArrayList<>();
        Zakup zakup = new Zakup();
        final String[] choices = {"Dodaj pozycję", "Wyświetl rachunek", "Wyjście"};
        String choice;
        do {
            //JFrame frame = new JFrame("Input Dialog");
            choice = (String) JOptionPane.showInputDialog(null,
                    "Co chcesz zrobić?",
                    "Obliczanie ceny z podatkiem",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choices,
                    choices[0]);
            switch (choice) {
                case "Dodaj pozycję":
                    new Dodaj().dodajPozycje(lista);
                    break;
                case "Wyświetl rachunek":
                    new Rachunek_jx().drukujRachunekJx(lista);
                    break;
                case "Wyjście":
                default:

                    System.exit(0);
            }
        } while (choice != "Wyjście");
    }
}
