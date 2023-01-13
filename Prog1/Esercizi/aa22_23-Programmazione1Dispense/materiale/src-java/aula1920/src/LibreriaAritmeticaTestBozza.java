/**
 * Classe di testing per {@code LibreriaAritmeticaBozza}. Applica
 * sistematicamente ogni metodo di {@code LibreriaAritmeticaBozza} a coppie di
 * argomenti generati da due cicli annidati.
 */

public class LibreriaAritmeticaTestBozza {

    /*
     * Stampa un messaggio da cui risulti chiaro che l'applicazione di {@code
     * op} agli argomenti {@code x} e {@code y} fornisca come risultato {@code
     * r}.
     */
    public static void messaggio(int x, String op, int y, int r) {
        System.out.println(x + op + y + " = " + r + ".");
    }

    public static void main(String[] args) {

        final int LIMITE = 3;
        int risultato;

        System.out.println("--- Piu'.");
        {
            int primoArg = 0;
            while (primoArg <= LIMITE) {
                int secondoArg = 0;
                while (secondoArg <= LIMITE) {
                    risultato = LibreriaAritmeticaBozza.piu(primoArg,
                            secondoArg);
                    messaggio(primoArg, " + ", secondoArg, risultato);
                    secondoArg++;
                }
                primoArg++;
            }
        }

        System.out.println("--- Meno.");
        {
            /*
             * riscrivere un blocco di codice analogo al precedente per il
             * testing del metodo LibreriaAritmeticaBozza.meno
             */
        }

        System.out.println("--- Per.");
        {
            /*
             * riscrivere un blocco di codice analogo al precedente per il
             * testing del metodo LibreriaAritmeticaBozza.meno
             */
        }

        System.out.println("--- Div.");
        {
            /*
             * riscrivere un blocco di codice analogo al precedente per il
             * testing del metodo LibreriaAritmeticaBozza.div
             */
        }

        System.out.println("--- Resto.");
        {
            /*
             * riscrivere un blocco di codice analogo al precedente per il
             * testing del metodo LibreriaAritmeticaBozza.resto
             */
        }

        System.out.println("--- Potenza.");
        {
            /*
             * riscrivere un blocco di codice analogo al precedente per il
             * testing del metodo LibreriaAritmeticaBozza.pot
             */
        }
    }
}
