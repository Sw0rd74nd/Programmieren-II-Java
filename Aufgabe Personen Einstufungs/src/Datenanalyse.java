import java.util.List;

public class Datenanalyse {

    public static void sucheBindestrich(List<Person> a) {

        List<Person> neueListe = a.stream().filter(b -> b.getNachname().contains("-")).toList();

        for (Person person : neueListe) {

            System.out.println("\n" + person);
        }
    }

    public static void adressenAnzahl(List<Person> a, int n) {

        int anzahl =  (int) a.stream().filter(b -> b.getAdresse().size() >= n).count();

        System.out.println("\nSo viele Personen haben mehr als eine Adresse:" + anzahl);
    }

}
