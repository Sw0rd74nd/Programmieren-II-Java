import java.awt.*;
import java.util.Arrays;

public class KinoDateiUtil {

    private final static String [] DATEN = new String[]{"Dr. Schiwago---300", "dein mamer---69" ,"Ghostbusters---104"};

    public static Kino loadKino(){
        Kino kino = new Kino();
        // Das hier einfach mit ner normalen schleife wie for(String s : DATEN) machen
        Arrays.stream(DATEN).forEach(element -> {
            int seperatorIndex = element.indexOf("---");
            String titel = element.substring(0, seperatorIndex);
            int duration = Integer.parseInt(element.substring(seperatorIndex+3));
            kino.filme.add(new Film(titel, duration));
            Toolkit.getDefaultToolkit().beep();
        });
        return kino;
    }

    public static void saveKino(Kino kino){
        kino.getFilmeNachLaenge().forEach(System.out::println);
        System.out.println("Information");
        System.out.println("längste:" + kino.getLangsterFilm());
        System.out.println("kurz" + kino.getKuerzesterFilm());
        System.out.println("average" + kino.getDurchschnittlicheDauer());
    }
}
