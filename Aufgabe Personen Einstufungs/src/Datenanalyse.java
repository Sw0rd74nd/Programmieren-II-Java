import java.util.List;

public class Datenanalyse {

    public static void sucheBindestrich(List<Person> a) {

        List<Person> neueListe = a.stream().filter(b -> b.getNachname().contains("-")).toList();

        for (Person person : neueListe) {

            System.out.println(person);
        }
    }

    public static void adressenAnzahl(List<Person> a) {

        List<Person> anzahlAdresseListe = a.stream().filter(b -> b.getAdresse().size() >= 2).toList();

        for (Person person : anzahlAdresseListe) {
            System.out.println(person);
        }

    }

}
