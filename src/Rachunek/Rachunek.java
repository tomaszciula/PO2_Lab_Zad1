package Rachunek;

import Zakup.Zakup;

import java.math.BigDecimal;
import java.util.List;

public class Rachunek {
    List<Zakup> listaZakupów;

    public static float round(float d, int decimalPlace) {
        return BigDecimal.valueOf(d).setScale(decimalPlace, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    public float wartoscNetto(List<Zakup> lista) {
        float n = 0;
        for (Zakup x : lista) {
            n += x.cenaNetto * x.iloscSztuk;
        }
        return round(n, 2);
    }

    public float wartoscVAT(List<Zakup> lista) {
        float w = 0;
        for (Zakup x : lista) {
            w += x.obliczWartoscPodatku();
        }
        return round(w, 2);
    }

    public void drukujRachunek(List<Zakup> lista) {
        for (Zakup x : lista) {
            System.out.println(lista.indexOf(x) + " Cena jedn. netto: " + x.cenaNetto + " ilość: " + x.iloscSztuk + " VAT: " + x.podatekVAT + "%");
        }
        System.out.println("Wartość netto: " + wartoscNetto(lista));
        System.out.println("Wartość podatku VAT: " + wartoscVAT(lista));
    }
}
