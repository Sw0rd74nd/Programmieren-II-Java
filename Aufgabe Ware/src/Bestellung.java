import java.util.ArrayList;
import java.util.List;

public class Bestellung {
    private Bestellposition[] positionen;

    public Bestellung() {
        this.positionen = new Bestellposition[20];
    }

    public void nimmAuf(Bestellposition position) {
        for (int i = 0; i < positionen.length; i++) {
            if (positionen[i] == null) {
                positionen[i] = position;
                return;
            }
        }
    }

    public void zeigAn(){

        for (Bestellposition bestellposition : positionen)
        {
            if (bestellposition == null)
            {
                return;
            }

            Ware w = bestellposition.getWare();
            int menge = bestellposition.getMenge();

            System.out.println(w.getNummer() + " " + w.getBezeichnung() + ", Preis: " + w.getPreis() + " EUR, Menge: " + menge);
        }

    }

}
