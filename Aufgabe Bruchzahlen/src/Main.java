public class Main {
    public static void main(String[] args) {

        Bruchzahl x = new Bruchzahl(5,7);
        Bruchzahl y = new Bruchzahl(3,5);

        x.addiere(y).zeigeAn();
        x.multiplizieren(y).zeigeAn();
        x.subtrahieren(y).zeigeAn();
        x.dividiere(y).zeigeAn();

    }
}