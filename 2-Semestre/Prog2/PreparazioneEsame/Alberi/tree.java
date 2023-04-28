/*
 * Alberi binari
 * Un'albero binario è una T struttura che data una relazione R presuppone che 
 *  \forall x (x R elem \implies x \in Left(T))
 * Dove left è il sottoalbero sinistro di T e elem è l'elemento di T
 */

public abstract class tree {

    public abstract boolean isEmpty();
    public abstract int max();
    public abstract boolean search(int n);
    public abstract tree insert(int n);
    public abstract tree delete(int n);
    public abstract int depth();
    public abstract int sum();
    public abstract int size();
    public abstract boolean contains(int n, int x);

    protected abstract String toStringAux(String prefix, String root, String left, String right);

    public String toString(){
        return this.toStringAux("", "___", "  ", "  ");
    }

    
}
