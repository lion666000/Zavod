public class Zavod {
    private static int pocetKol;

    public static synchronized void pridejKolo(String name, int kolo) {
        pocetKol++;
        System.out.println(name + " dokoncilo sve " + kolo + ". kolo. Celkový pocet kol je " + pocetKol + ".");
    }

    public static synchronized int getPocetKol() {
        return pocetKol;
    }
}
