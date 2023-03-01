public class TorreHanoi {

    public static final String PioloA = "0";
    public static final String PioloB = "1";
    public static final String PioloC = "2";

    public static void tH(int n, String sorgente, String appoggio,
            String obiettivo) {

        if (n == 1)
            sposta(sorgente, obiettivo);
        else {
            tH(n - 1, sorgente, obiettivo, appoggio);
            sposta(sorgente, obiettivo);
            tH(n - 1, appoggio, sorgente, obiettivo);
        }
    }

    public static void sposta(String sorgente, String obiettivo) {
        System.out.println(sorgente + "->" + obiettivo);
    }
}
