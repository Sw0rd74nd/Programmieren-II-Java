public class Main {
    public static void main(String[] args) {

        Kunde dagobert = new Kunde("Dagobert", "Duck", "KN 000351");
        Bestellung best = new Bestellung(dagobert);
        Bestellposition pos;
        Ware w;

        w = new Ware("01019010", "Hammer", 19.00);
        pos = new Bestellposition(w, 30);
        best.nimmAuf(pos);

        w = new Ware("01019020", "Zange", 17.00);
        pos = new Bestellposition(w, 20);
        best.nimmAuf(pos);

        best.zeigAn();

        Kunde emil = new Kunde("Emil", "Erpel", "KN 000462");
        emil.setBekommtRabatt(true);
        best = new Bestellung(emil);

        w = new Ware("01019011", "Schere", 33.00);
        pos = new Bestellposition(w, 30);
        best.nimmAuf(pos);

        w = new Ware("01019021", "Treppe", 8.00);
        pos = new Bestellposition(w, 20);
        best.nimmAuf(pos);
        best.zeigAn();
   }
}