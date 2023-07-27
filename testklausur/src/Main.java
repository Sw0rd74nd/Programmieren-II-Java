public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Kino test = KinoFactory.getKino("test");
        KinoDateiUtil.saveKino(test);
    }
}