public class Auto implements Runnable {
    private int pocetKol = 0;
    private String cislo;

    public Auto(String cislo) {
        this.cislo = cislo;
    }

    @Override
    public void run() {
        int x = (int) (Math.random( )*10)+1;


        for (int i = 0; i < x; i++) {
            pocetKol++;
            Zavod.pridejKolo(cislo,pocetKol);


        }
    }

    public synchronized int getPocetKol() {
        return pocetKol;
    }
}
