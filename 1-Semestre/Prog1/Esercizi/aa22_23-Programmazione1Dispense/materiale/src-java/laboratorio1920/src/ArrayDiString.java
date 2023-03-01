public class ArrayDiString {
    String[] names = new String[3];

    /*
     * Altro array di (riferimenti a) stringhe.
     */
    String[] friends = { "Emily", "Bob", "Cindy" };

    public static void main(String[] args) {
        /*
         * Definizione e inizializzazione di un array di (riferimenti a)
         * stringhe.
         */
        System.out.println("--- Riempiamo un array con 5 stringhe:");
        final int LUNGHEZZA_DI_ASTRINGHE = 5;
        String[] aStringhe = new String[LUNGHEZZA_DI_ASTRINGHE];
        for (int i = 0; i < LUNGHEZZA_DI_ASTRINGHE; i++) {
            /*
             * per ogni 0<=k<i e' stato letto il valore di aStringhe[j]
             */
            System.out.println("Stringa di posizione " + i + ": ");
            aStringhe[i] = SIn.readLine();
        }

        /*
         * Stampa di {@code aStringhe}.
         */
        System.out.print("---- aStringhe = { ");
        for (int i = 0; i < LUNGHEZZA_DI_ASTRINGHE; i++) {
            /*
             * per ogni 0<=k<i e' stato letto il valore di aStringhe[j]
             */
            System.out.print(aStringhe[i] + " ");
        }
        System.out.println("}");

    }
}
