public class Fahrzeug {
    private String fahrzeugart;
    private int anzahlRaeder;

    public Fahrzeug(String fahrzeugart, int anzahlRaeder) {
        this.fahrzeugart = fahrzeugart;
        this.anzahlRaeder = anzahlRaeder;
    }

    public Fahrzeug(String fahrzeugart) {
        this.fahrzeugart = fahrzeugart;
    }

    public String getFahrzeugart() {
        return fahrzeugart;
    }

    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }
}
