public class PostalischeAdresse implements Adresse {
    String adresse;
    int hausnummer;
    String plz;
    String ort;

    public PostalischeAdresse(String adresse, int hausnummer, String plz, String ort) {
        this.adresse = adresse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }

    @Override
    public String toString() {

        return String.format("%s %d %s %s", adresse, hausnummer, plz, ort);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
