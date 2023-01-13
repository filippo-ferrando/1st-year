/**
 * Classe di testing per {@code LibreriaAritmetica}. Applica sistematicamente
 * ogni metodo di {@code LibreriaAritmetica} a coppie di argomenti generati da
 * due cicli annidati.
 */

public class LibreriaAritmeticaTest {

    /*
     * Stampa un messaggio da cui risulti chiaro che l'applicazione di {@code
     * op} agli argomenti {@code x*} e {@code y} fornisca come risultato {@code
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
                    risultato = LibreriaAritmetica.piu(primoArg, secondoArg);
                    messaggio(primoArg, " + ", secondoArg, risultato);
                    secondoArg++;
                }
                primoArg++;
            }
        }

        System.out.println("--- Meno.");
        {
            int primoArg = 0;
            while (primoArg <= LIMITE) {
                int secondoArg = 0;
                while (secondoArg <= LIMITE) {
                    risultato = LibreriaAritmetica.meno(primoArg, secondoArg);
                    messaggio(primoArg, " - ", secondoArg, risultato);
                    secondoArg++;
                }
                primoArg++;
            }
        }

        System.out.println("--- Per.");
        {
            int primoArg = 0;
            while (primoArg <= LIMITE) {
                int secondoArg = 0;
                while (secondoArg <= LIMITE) {
                    risultato = LibreriaAritmetica.per(primoArg, secondoArg);
                    messaggio(primoArg, " * ", secondoArg, risultato);
                    secondoArg++;
                }
                primoArg++;
            }
        }

        System.out.println("--- Div.");
        {
            int primoArg = 0;
            while (primoArg <= LIMITE) {
                int secondoArg = 0;
                while (secondoArg <= LIMITE) {
                    if (secondoArg > 0) {
                        risultato = LibreriaAritmetica
                                .div(primoArg, secondoArg);
                        messaggio(primoArg, " / ", secondoArg, risultato);
                    }
                    secondoArg++;
                }
                primoArg++;
            }
        }

        System.out.println("--- Resto.");
        {
            int primoArg = 0;
            while (primoArg <= LIMITE) {
                int secondoArg = 0;
                while (secondoArg <= LIMITE) {
                    if (secondoArg > 0) {
                        risultato = LibreriaAritmetica.resto(primoArg,
                                secondoArg);
                        messaggio(primoArg, " % ", secondoArg, risultato);
                    }
                    secondoArg++;
                }
                primoArg++;
            }
        }

        System.out.println("--- Potenza.");
        {
            int primoArg = 0;
            while (primoArg <= LIMITE) {
                int secondoArg = 0;
                while (secondoArg <= LIMITE) {
                    risultato = LibreriaAritmetica.pot(primoArg, secondoArg);
                    messaggio(primoArg, " ^ ", secondoArg, risultato);
                    secondoArg++;
                }
                primoArg++;
            }
        }
    }
}