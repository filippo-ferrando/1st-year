/**
 * Dopo la creazione di un array, iterativamente, richiede un intero a la
 * posizione in cui inserirlo.
 */
public class InserimentoTest {

    private static void stampa(int[] a) {

        System.out.print("{ ");
        for (int k = 0; k < a.length; k++)
            System.out.print(a[k] + " ");
        System.out.println("}");
    }

    public static void main(String[] args) {

        int[] a;
        final int NUMERO_ITERAZIONI = 3;

        System.out
                .println("------------------------------------------------------");
        System.out
                .println("--- Inserimento in array non necessariamente ordinato.");
        a = LibreriaCreazioneStampaArray.initArray();
        System.out.println("    Array: ");
        stampa(a);

        int numeroInserimenti = 0;
        do {
            System.out.println("Elemento da inserire? ");
            int elemento = SIn.readInt();
            System.out.println("Posizione in cui inserire? ");
            int posizione = SIn.readInt();

            a = Inserimento.inserisceElementoPosizione(a, elemento, posizione);
            System.out.println("    Array potenzialmente modificato: ");
            stampa(a);

            numeroInserimenti++;

        } while (numeroInserimenti < NUMERO_ITERAZIONI);

        System.out
                .println("------------------------------------------------------");
        System.out
                .println("--- Inserimento in array non necessariamente ordinato.");
        a = LibreriaCreazioneStampaArray.initArray();
        System.out.println("    Array: ");
        stampa(a);

        numeroInserimenti = 0;
        do {
            System.out.println("Elemento da inserire? ");
            int elemento = SIn.readInt();
            System.out.println("Posizione in cui inserire? ");
            int posizione = SIn.readInt();

            a = Inserimento.inserisceElementoPosizioneAlt(a, elemento,
                    posizione);
            System.out.println("    Array potenzialmente modificato: ");
            stampa(a);

            numeroInserimenti++;

        } while (numeroInserimenti < NUMERO_ITERAZIONI);

    }
}