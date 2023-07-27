public class KinoFactory {

    public static Kino getKino(String dateiname){
        return KinoDateiUtil.loadKino();
    }
}
