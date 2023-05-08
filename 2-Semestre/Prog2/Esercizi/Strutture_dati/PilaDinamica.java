// Pila di dimensione variable di interi, 
// realizzata come lista concatenata di Nodi
public class PilaDinamica {
    // Riferimento al nodo contenente l'elemento in cima alla pila
    // Invariante: top==null se la pila e' vuota, top!= null altrimenti.
    private Node top;

    // Costruttore: crea una pila vuota
    public PilaDinamica() {
        this.top = null;
    }

    // Ritorna true se la pila e' vuota
    public boolean vuota() {
        return this.top == null;
    }

    // Ritorna true se la pila e' piena. 
    // Poiche' la pila ha dimensione dinamica, non puo' mai 
    // essere piena, a meno di finire la memoria
    public boolean piena() {
        return false;
    }

    // Aggiungi l'intero @x in cima alla pila
    public void push(int x) {
        top = new Node(x, top);
    }

    // Elimina l'elemento in cima alla pila, e ritornane il valore.
    public int pop() {
        assert !vuota() : "non si puo' chiamare il metodo pop() se la pila e' vuota.";
        int tmp = top.getElem();
        top = top.getNext();
        return tmp;
    }

    // Ritorna il numero di elementi contenuti sulla pila.
    public int size() {
        int n = 0;
        Node p = top;
        while (p != null) {
            n++;
            p = p.getNext();
        }
        return n;
    }

    // Converte la pila in un array.
    // Ritorna un array di interi che contiene tutti gli elementi della pila,
    // partendo dall'elemento in cima (posizione 0) fino in fondo.
    public int[] toArray() {
        int[] a = new int[size()];
        int i = 0;
        for (Node p = top; p != null; p = p.getNext())
            a[i++] = p.getElem();
        return a;
    }
}
