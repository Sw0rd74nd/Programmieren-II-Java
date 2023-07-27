import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Kino {

    ArrayList<Film> filme = new ArrayList<Film>();

    public void addFilm(Film film){

    }

    public Film getKuerzesterFilm(){
        /* Hier einfach sowas wie:
         * int max = filme[0].getMinuten();
         * for(Film film : filme) if(film.getMinuten()<max) max = film.getMinuten()
         */
        return filme.stream().min(Comparator.comparingInt(Film::getMinuten)).orElse(null);
    }

    public Film getLangsterFilm(){
        return filme.stream().max(Comparator.comparingInt(Film::getMinuten)).orElse(null);
        }

    public double getDurchschnittlicheDauer(){
        return filme.stream().mapToDouble(Film::getMinuten).average().orElse(0);
    }

    public List<Film> getFilmeNachLaenge(){
        filme.sort(Comparator.comparingInt(Film::getMinuten));
        return filme;
    }


}
