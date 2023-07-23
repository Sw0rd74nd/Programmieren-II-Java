import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Person {
    private String anrede;
    private String vorname;
    private String nachname;
    private LocalDate geburtstag;
    private ArrayList<Adresse> adresse = new ArrayList<Adresse>();

    public Person(String anrede, String vorname, String nachname, LocalDate geburtstag) {
        this.anrede = anrede;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtstag = geburtstag;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s " + getGeburtstag(), anrede, vorname, nachname);
    }

    public void addAdresse(Adresse adresse) {
        this.adresse.add(adresse);
    }

    public ArrayList<Adresse> getAdresse() {
        return adresse;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(LocalDate geburtstag) {
        this.geburtstag = geburtstag;
    }
}
