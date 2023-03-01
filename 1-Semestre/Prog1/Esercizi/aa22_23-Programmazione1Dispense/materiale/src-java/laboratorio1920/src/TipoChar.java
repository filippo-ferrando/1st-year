/**
 * Raccolta essenziale di esempi d'uso di letterali di tipo primitivo char.
 * <p>
 * Se il sistema su cui si compila e si interpreta questa classe non è ben
 * configurato per usare i caratteri UTF-16, l'output non sarà quello atteso.
 */
public class TipoChar {
    /*
     * Unico metodo della classe.
     */
    public static void main(String[] args) {

        System.out
                .println("Letterali di tipo char possono contenere caratteri unicode UTF-16.");
        System.out.println("-- 'C' con accento circonflesso: " + '\u0108'
                + " con codice '\\u0108'.");
        System.out.println("-- 'i' con accento acuto: " + '\u00ED'
                + " con codice '\\u00ED'.");
        System.out.println("-- 'n' con tilde: " + '\u00F1'
                + " con codice '\\u00F1'.");

        System.out
                .println("Java supporta sequenze di escape per rappresentare caratteri utili.");
        System.out.println("-- backspace: '\b'.");
        System.out.println("-- spazio di tabulazione: '\t'.");
        System.out.println("-- nuova linea: '\n'.");
        System.out.println("-- doppio apice: '\"'.");
        System.out.println("-- singolo apice: '\''.");
        System.out.println("-- backslash: '\\'.");
    }
}
