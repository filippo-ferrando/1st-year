// coda di dimensione dinamica, implementata come lista di Nodi
public class DynamicQueue {
    // riferimento al primo nodo della lista, o null
    private Node first;
    // riferimento all'ultimo nodo della lista, o null
    private Node last;

    // INVARIANTE: 
    // vale: first==last==null,
    // oppure: first.getNext(). ... .getNext() == last 
    //         && last.getNext() == null              

    // costruttore: crea una coda vuota
    public DynamicQueue() {
        first = last = null;
    }

    // scrivi una rappresentazione della coda su terminale
    public void scriviOutput() {
        Node node = first;
        while (node != null) {
            System.out.print(node.getElem() + " "); 
            node = node.getNext(); // successore
        }
        System.out.println();
    }

    // inserisci un nuovo elemento @x in fondo alla coda
    public void enqueue(int x) {
        // crea un nuvo nodo da inserire in fondo
        Node node = new Node(x, null);
        if (empty()) // coda vuota
            first = last = node;
        else { // almeno un elemento
            last.setNext(node); // last -> node -> null
            last = node;
        }
        assert first!=null && last!=null && last.getNext()==null;
    }

    // rimuovi e ritorna l'elemento in testa alla coda
    public int dequeue() {
        assert !empty() : "non si puo' chiamare dequeue su una coda vuota.";
        int x = first.getElem();
        first = first.getNext();
        // se la coda si e' svuotata completamente, cambia anche last
        if (first == null)
            last = null;

        assert ((first==null && last==null) || 
                (first!=null && last!=null && last.getNext()==null));
        return x;
    }

    // ritorna true se la coda e' vuota
    public boolean empty() {
        return first == null;
    }

    // ritorna l'elemento in testa alla coda, senza rimuoverlo
    public int front() {
        assert !empty() : "non si puo' chiamare front su una coda vuota.";
        return first.getElem();
    }

    // ritorna la dimensione della coda
    public int size() {
        int n = 0;
        for (Node p = first; p != null; p = p.getNext())
            n++;
        return n;
    }

    // ritorna true se @x e' contenuto nella coda, false altrimenti
    public boolean contains(int x) {
        for (Node p = first; p != null; p = p.getNext())
            if (p.getElem() == x) 
                return true; 
        return false;
    }

}