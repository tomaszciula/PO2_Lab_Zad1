package Cmd;

import Rachunek.Rachunek;
import Windows.Windows;
import Zakup.Zakup;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Cmd {
    //private static String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";

    public static Zakup pobierzPozycje() {
        float a = 0, p = 0, x = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj cenę jednostkową netto: ");
        try {
            a = s.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie \nW zależności od ustawień Twojego edytora używamy: \ndla ustawień US - kropka \ndla ustawień EU - przecinek");
            exit(1);
        }
        System.out.println("Podaj wysokość podatku VAT w procentach : ");
        try {
            p = s.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie \nW zależności od ustawień Twojego edytora używamy: \ndla ustawień US - kropka \ndla ustawień EU - przecinek");
            exit(1);
        }
        System.out.println("Podaj ilość sztuk zakupionego towaru: ");
        try {
            x = s.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie \nW zależności od ustawień Twojego edytora używamy: \ndla ustawień US - kropka \ndla ustawień EU - przecinek");
            exit(1);
        }
        Zakup zakup = new Zakup(a, x, p);
        return zakup;
    }

    public void consoleVersion() {
        List<Zakup> lista = new ArrayList<>();
        String choice = "";
        do {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Dodaj pozycję");
            System.out.println("2. Wydrukuj rachunek");
            System.out.println("3. Przejdź do wersji okienkowej");
            System.out.println("0. Wyjdź z programu");
            Scanner s = new Scanner(System.in);
            choice = s.next();
            switch (choice) {
                case "1":
                    lista.add(pobierzPozycje());
                    break;
                case "2":
                    Rachunek rachunek = new Rachunek();
                    rachunek.drukujRachunek(lista);
                    break;
                case "3":
                    new Windows().windowsVersion();
                    break;
                case "0":
                    exit(0);
                default:
                    System.out.println("Niepoprawny wybór!");
            }
        } while (choice.equals("1") || choice.equals("2"));
    }
}
