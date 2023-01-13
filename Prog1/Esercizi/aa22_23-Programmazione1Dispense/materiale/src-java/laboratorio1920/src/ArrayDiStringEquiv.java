/**
 * Utile per inferire la struttura dell'allocazione di una istanza di String[].
 * <p>
 * L'inferenza avviene osservando i valori dell'operatore {@code ==} e del
 * metodo di istanza {@code equals}.
 */
public class ArrayDiStringEquiv {
    public static void main(String[] args) {

        System.out.println("---- 1. Studio allocazione String[].");
        String[] s = new String[2];
        System.out.println("Per favore scrivere 'a'.");
        s[0] = new String(SIn.readWord());
        System.out.println("Per favore riscrivere 'a'. ");
        s[1] = new String(SIn.readWord());

        System.out.println(" s[0] == s[1] vale " + (s[0] == s[1]) + ".");
        System.out.println(" s[0].equals(s[1]) vale " + (s[0].equals(s[1]))
                + ".");

        System.out.println("---- 2. Studio allocazione String[].");
        String[] t = new String[2];
        System.out.println("Per favore scrivere 'a'.");
        t[0] = SIn.readWord();
        System.out.println("Per favore riscrivere 'a'. ");
        t[1] = SIn.readWord();

        System.out.println(" t[0] == t[1] vale " + (t[0] == t[1]) + ".");
        System.out.println(" t[0].equals(t[1]) vale " + (t[0].equals(t[1]))
                + ".");

        System.out.println(" s == t vale " + (s == t) + ".");
        System.out.println(" s.equals(t) vale " + (s.equals(t)) + ".");

    }
}