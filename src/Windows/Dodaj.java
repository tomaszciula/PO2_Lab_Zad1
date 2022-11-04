package Windows;

import Zakup.Zakup;

import javax.swing.*;
import java.util.List;

import static javax.swing.JOptionPane.QUESTION_MESSAGE;

public class Dodaj {
    List<Zakup> lista;
    JTextField netto = new JTextField();
    JTextField podatek = new JTextField();
    JTextField ilosc = new JTextField();

    Object[] fields = {
            "Wartość netto:", netto,
            "Wysokość podatku w %:", podatek,
            "ilość sztuk:", ilosc,
    };

    public List dodajPozycje(List<Zakup> lista) {
        Zakup zakup = new Zakup();
        JOptionPane pane = new JOptionPane(null, QUESTION_MESSAGE);
        pane.showInputDialog(null, fields, "Dodaj zakup", QUESTION_MESSAGE);
        zakup.cenaNetto = Float.parseFloat(netto.getText());
        zakup.podatekVAT = Float.parseFloat(podatek.getText());
        zakup.iloscSztuk = Float.parseFloat(ilosc.getText());
        lista.add(zakup);
        return lista;
    }
}