/**
 * Omissione di parentesi nel ramo {@code else}.
 * <p>
 * Se l'obiettivo è stampare 'Buona sera' o 'Buon giorno' a seconda della
 * valutazione della condizione, allora il programma e' errato: il blocco di
 * istruzioni del ramo {@code else} contiene una singola istruzione e non due,
 */

public class ElseNoParentesi {
    public static void main(String[] args) {

        if (1 == 1) {
            System.out.println("Buon");
            System.out.println("giorno");
        } else
            System.out.println("Buona");
        System.out.println("sera");
    }
}
