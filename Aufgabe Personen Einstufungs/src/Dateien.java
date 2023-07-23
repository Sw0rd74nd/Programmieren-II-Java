import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Dateien {

    public static void createFile(List<Person> personen) {

        List<String> personDaten = new ArrayList<String>();
        List<String> adresseDaten = new ArrayList<String>();


        for (Person a : personen) {

            String formatierung = String.format("%s %s %s %4$tm.%4$tY", a.getAnrede(), a.getVorname(), a.getNachname(), a.getGeburtstag());

            personDaten.add(formatierung);

            for (Adresse x : a.getAdresse()) {
                String format = String.format("%s", x.toString());

                adresseDaten.add(format);
            }
        }

        try {
            Path path = Paths.get("personenDaten.txt");
            Path path1 = Paths.get("adresseDaten.txt");
            Files.write(path, personDaten);
            Files.write(path1, adresseDaten);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
