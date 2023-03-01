/**
 * Verifica dei metodi in {@link Filtri}.
 */
public class FiltriTest {

    private static void stampa(int[] a) {

        System.out.print("{ ");
        for (int k = 0; k < a.length; k++)
            System.out.print(a[k] + " ");
        System.out.println("}");
    }

    public static void main(String[] args) {

        int[] a;
        int[] b;

        a = LibreriaCreazioneStampaArray.initArray();
        System.out.print("0. Array letto: ");
        stampa(a);

        System.out.print("1. Elementi di pos. pari (1ma versione): ");
        b = Filtri.elementiPosizionePari00(a);
        stampa(b);

        System.out.print("2. Elementi di pos. pari (2da versione): ");
        b = Filtri.elementiPosizionePari01(a);
        stampa(b);

        System.out.print("3. Elementi di pos. pari (3za versione): ");
        b = Filtri.elementiPosizionePari02(a);
        stampa(b);

        System.out.print("4. Elementi di valore pari: ");
        b = Filtri.elementiValorePari(a);
        stampa(b);

        System.out.print("5. Elementi di valore pari estendendo array: ");
        b = Filtri.elementiValorePariConEstensione(a);
        stampa(b);

        System.out.print("6. Inversione dell'array al passo 6: ");
        // Filtri.pariPrimaDeiDispari(int[]) agisce direttamente su a.
        Filtri.inverte(a);
        stampa(a);
    }
}