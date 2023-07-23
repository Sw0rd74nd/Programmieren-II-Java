import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personen = new ArrayList<Person>(2);

        Person a = new Person("Herr", "Luigi", "Xu", LocalDate.of(2001, 03, 30));
        Person b = new Person("Frau", "Yvonne", "Forster-Xu", LocalDate.of(2002, 07, 06));

        PostalischeAdresse[] postalischeAdressen = new PostalischeAdresse[2];

        postalischeAdressen[0] = new PostalischeAdresse("Stuttgarter Strasse", 33, "73734", "Esslingen");
        postalischeAdressen[1] = new PostalischeAdresse("Hauptstrasse", 10, "73734", "Sindelfingen");

        ElektronischeAdresse[] elektronischeAdressen = new ElektronischeAdresse[2];

        elektronischeAdressen[0] = new ElektronischeAdresse("luigi@email.com");
        //elektronischeAdressen[1] = new ElektronischeAdresse("yvonne@email.com");

        a.addAdresse(postalischeAdressen[0]);
        b.addAdresse(postalischeAdressen[1]);

        a.addAdresse(elektronischeAdressen[0]);
        //b.addAdresse(elektronischeAdressen[1]);

        personen.add(a);
        personen.add(b);

        for (Person person : personen) {

            System.out.printf("Die Daten der Person sind: %s %s %s %4$td.%4$tm.%4$tY\n", person.getAnrede(), person.getVorname(), person.getNachname(), person.getGeburtstag());

            for (Adresse x : person.getAdresse()) {

                System.out.printf("- %s\n", x);
            }
        }

        Dateien.createFile(personen);

        Datenanalyse.sucheBindestrich(personen);
        Datenanalyse.adressenAnzahl(personen);


    }
}