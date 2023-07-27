public class Film {
    private String titel;
    private int minuten;

    public Film(String titel, int minuten) {
        this.titel = titel;
        this.minuten = minuten;

    }

    public Film(String titel){
        this(titel, 0);
    }

    public Film(){
        this("test");
    }

    public String getTitel() {
        return titel;
    }

    public int getMinuten() {
        return minuten;
    }

    @Override
    public String toString() {
        return titel + ':' + minuten;
    }
}
