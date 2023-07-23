import java.util.ArrayList;
import java.util.List;

public class Bestellung {
    private Bestellposition[] positionen;
    private Kunde kunde;

    public Bestellung(Kunde kunde) {
        this.positionen = new Bestellposition[20];
        this.kunde = kunde;
    }

    public void nimmAuf(Bestellposition position) {
        for (int i = 0; i < positionen.length; i++) {
            if (positionen[i] == null) {
                positionen[i] = position;
                return;
            }
        }
    }

    public void zeigAn() {
        System.out.print("Bestellung von: " + this.kunde.getVorname() + " " + this.kunde.getNachname() + " " + this.kunde.getNummer() + " ");

        if (this.kunde.getBekommtRabatt()) {
            System.out.println("mit: " + Kundenrabatt.getRabattsatz() * 100 + "% Kundenrabatt");
        }
        System.out.println();
        for (Bestellposition bestellposition : positionen) {
            if (bestellposition == null) {
                return;
            }

            Ware w = bestellposition.getWare();
            int menge = bestellposition.getMenge();

            if (this.kunde.getBekommtRabatt()) {
                System.out.println(w.getNummer() + " " + w.getBezeichnung() + " Listenpreis: " + w.getPreis() + " KundenPreis: " + Kundenrabatt.berechneRabattpreis(w.getPreis()) + " EUR, Menge: " + menge);
            } else {

                System.out.println(w.getNummer() + " " + w.getBezeichnung() + ", Preis: " + w.getPreis() + " EUR, Menge: " + menge);
            }
        }

    }

}
