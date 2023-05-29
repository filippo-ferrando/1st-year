// classe per rappresentare una diramazione

public class Branch extends Tree {
    private int elem;
    private Tree left;
    private Tree right;

    public Branch(int elem, Tree left, Tree right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    public boolean empty() {
        return false;
    }

    public int max() {
        return right.empty() ? elem : right.max();
    }

    public boolean contains(int x) {
        if (x == elem)
            // abbiamo trovato l'elemento
            return true;
        else if (x < elem)
            // siccome x e` piu` piccolo di elem cerchiamo x solo nel
            // sottoalbero sinistro
            return left.contains(x);
        else
            // siccome x e` piu` grande di elem cerchiamo x solo nel
            // sottoalbero destro
            return right.contains(x);
    }

    public Tree insert(int x) {
        if (x < elem)
            left = left.insert(x);
        else if (x > elem)
            right = right.insert(x);
        // se x == elem x e` gia` presente nell'albero e non lo inseriamo
        return this;
    }

    public Tree remove(int x) {
        if (x == elem) // trovato elemento da eliminare
            if (left.empty())
                // il sottoalbero sinistro e` vuoto, dunque resta il
                // sottoalbero destro
                return right;
            else if (right.empty())
                // il sottoalbero destro e` vuoto, dunque resta il
                // sottoalbero sinistro
                return left;
            else {
                // entrambi i sottoalberi sono non vuoti e dobbiamo
                // individuare un elemento da collocare alla radice
                // dell'albero dopo l'eliminazione di elem. Scegliamo
                // il massimo elemento del sottoalbero sinistro, il
                // quale sara` per definizione piu` grande di tutti
                // gli altri elementi del sottoalbero sinistro e, per
                // la proprieta` degli alberi binari di ricerca, piu`
                // piccolo di tutti gli elementi nel sottoalbero
                // destro. In alternativa sarebbe stato possibile
                // scegliere il minimo elemento del sottoalbero destro
                elem = left.max();
                // eliminiamo l'elemento massimo dal sottoalbero
                // sinistro
                left = left.remove(elem);
                return this;
            }
        else if (x < elem) {
            // se c'e`, l'elemento da eliminare e` nel sottoalbero
            // sinistro
            left = left.remove(x);
            return this;
        } else {
            // se c'e`, l'elemento da eliminare e` nel sottoalbero
            // destro
            right = right.remove(x);
            return this;
        }
    }
    
    public int depth() {
        return 1 + Math.max(left.depth(), right.depth());
    }

    public int size(){
        return 1 + left.size() + right.size();
    }

    public int sum(){
        return elem + left.sum() + right.sum();
    }

    public boolean contains(int x, int n){
        if (n==0){
            return false; // superato gli n passi -> non trovato / eccede n
        }
        if (x == elem){
            return true; // abbiamo trovato x in n passi
        }
        return left.contains(x, n-1) || right.contains(x,n-1); //chiamo la funzione sulle due diramazioni e decremento n
    }

    public boolean balanced(){
        return Math.abs(left.depth() - right.depth()) <= 1 && left.balanced() && right.balanced();
    }

    public Tree filter_le(int x){
        if(elem <= x){
            return new Branch(elem, left.filter_le(x), right.filter_le(x)); //inserisco l'elemento dato che è minore, sul lato sinistro e destro richiamo la funzione
        }else{
            return left.filter_le(x); // se l'elemento non è minore controllo il ramo sinistro per un possibile minore
        }
    }

    public int get(int i){
        if(i == 0){
            return elem;
        }
        if(left.size() >= i){
            return left.get(i-1);
        }
        if(right.size() >= i){
            return right.get(i-1-left.size());
        }
        return -1;
    }


    public String toString() {
        return "Branch(" + elem + "," + left + "," + right + ")";
    }
}
