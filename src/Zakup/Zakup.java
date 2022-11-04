package Zakup;

public class Zakup {
    public float cenaNetto;
    public float iloscSztuk;
    public float podatekVAT;

    public Zakup() {
    }

    ;

    public Zakup(float cenaNetto, float iloscSztuk, float podatekVAT) {
        this.cenaNetto = cenaNetto;
        this.iloscSztuk = iloscSztuk;
        this.podatekVAT = podatekVAT;
    }

    public float obliczWartoscNetto() {
        return cenaNetto * iloscSztuk;
    }

    public float obliczWartoscPodatku() {
        return (podatekVAT / 100) * cenaNetto * iloscSztuk;
    }
}
