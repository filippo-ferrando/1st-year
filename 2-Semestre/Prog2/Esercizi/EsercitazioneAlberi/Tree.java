import java.util.*;
// classe astratta che definisce le operazioni su alberi binari
public abstract class Tree {
    public abstract boolean empty();
    public abstract int max();
    public abstract boolean contains(int x);
    public abstract Tree insert(int x);
    public abstract Tree remove(int x);
    public abstract int depth();

    public abstract int size(); // -> numero di elemento in Tree()
    public abstract int sum();// -> somma di tutti gli elementi in Tree()
    public abstract boolean contains(int x, int n); // -> true se l'elemento x è raggiungibile in n passi
    public abstract boolean balanced(); // ->  se in ogni diramazione di t la differenza tra le profondità dei due sotto-alberi è al massimo 1 ed entrambi i sotto-alberi sono a loro volta bilanciati
    public abstract Tree filter_le(int x); // -> ritorna un albero t contenente tutti gli elementi minori o uguali a x
    public abstract int get(int i); // -> ritorna l'elemento con indice i
}
