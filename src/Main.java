import Cmd.Cmd;
import Rachunek.Rachunek;
import Windows.Windows;
import Zakup.Zakup;
import Zakup.Zakup_jx;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wybierz wersję:");
        System.out.println("1. Konsola");
        System.out.println("2. Okienka");
        System.out.println("0. Wyjście");
        Scanner s = new Scanner(System.in);
        String choice = s.next();
        switch (choice) {
            case "1":
                Cmd cmd = new Cmd();
                cmd.consoleVersion();
                break;
            case "2":
                new Windows().windowsVersion();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Niepoprawny wybór!");
                break;
        }

    }
}