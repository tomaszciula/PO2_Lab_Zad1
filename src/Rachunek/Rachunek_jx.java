package Rachunek;

import Zakup.Zakup;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Rachunek_jx {
    public static float round(float d, int decimalPlace) {
        return BigDecimal.valueOf(d).setScale(decimalPlace, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    public void drukujRachunekJx(List<Zakup> lista) {

        System.out.println(lista.get(0).cenaNetto);
        List<String> listaZakupów = new ArrayList<String>() {
        };
        String labels = "";
        float wartoscNetto = 0, wartoscVAT = 0;

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("lista " + lista.get(i).cenaNetto);
            listaZakupów.add(" Cena jedn. netto: " + lista.get(i).cenaNetto + " ilość: " + lista.get(i).iloscSztuk + " VAT: " + lista.get(i).podatekVAT + "%");
            wartoscNetto += (lista.get(i).cenaNetto * lista.get(i).iloscSztuk);
            wartoscVAT += ((lista.get(i).podatekVAT / 100) * lista.get(i).cenaNetto * lista.get(i).iloscSztuk);
        }

        for (int i = 0; i < listaZakupów.size(); i++) {
            labels += listaZakupów.get(i) + "\n";
        }
        labels += "\nSuma netto: " + round(wartoscNetto, 2) + "\nWartość podatku VAT: " + round(wartoscVAT, 2);

        JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, labels);
    }
}
