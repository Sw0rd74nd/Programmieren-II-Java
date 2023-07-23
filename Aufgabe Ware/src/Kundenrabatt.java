public class Kundenrabatt {

    private static double rabattsatz = 0.05;

    public static double getRabattsatz() {
        return rabattsatz;
    }

    public static void setRabattsatz(double rabattsatz) {
        Kundenrabatt.rabattsatz = rabattsatz;
    }

    public static double berechneRabattpreis(double vollerPreis) {
        double rabattPreis = vollerPreis * (1 - Kundenrabatt.getRabattsatz());
        return rabattPreis;
    }
}
