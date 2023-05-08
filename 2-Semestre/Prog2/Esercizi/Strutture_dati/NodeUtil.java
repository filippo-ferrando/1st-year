// Metodi statici per manipolare liste concatenate di Nodi.
public class NodeUtil {
    // Ritorna una lista contenente tutti i numeri interi compresi 
    // tra @m ed @n, estremi inclusi. Versione iterativa.
    public static Node fromTo(int m, int n) {
        Node p = null;
        // Si fa una iterazione all'indietro da n (l'estremo superiore) 
        // a m (estremo inferiore) dal momento che le liste si costruiscono 
        // convenientemente a partire dall'ultimo elemento.
        while (m <= n) {
            p = new Node(n, p);
            n--;
        }
        return p;
    }

    // Versione ricorsiva di fromTo
    public static Node fromTo_rec(int m, int n) {
        return m > n ? null : new Node(m, fromTo_rec(m + 1, n));
    }

    // Conta il numero di occorrenze di @x nella lista @p, in modo iterativo.
    public static int occurrences(Node p, int x) {
        int n = 0;
        while (p != null) {
            if (p.getElem() == x) n++;
            p = p.getNext();
        }
        return n;
    }

    // Versione ricorsiva di occurrences.
    public static int occurrences_rec(Node p, int x) {
        if (p == null) return 0;
        else if (p.getElem() == x) return 1 + occurrences_rec(p.getNext(), x);
        else return occurrences_rec(p.getNext(), x);
    }

    // Ritorna true se tutti gli elementi nella lista @p compaiono  
    // nello stesso ordine anche nella lista @q. Versione iterativa.
    public static boolean included(Node p, Node q) {
        while (p != null && q != null) {
            if (p.getElem() == q.getElem()) p = p.getNext();
            q = q.getNext();
        }
        return p == null;
    }

    // Versione ricorsiva di included
    public static boolean included_rec(Node p, Node q) {
        return p == null ||
            (q != null && ((p.getElem() == q.getElem()
                            && included_rec(p.getNext(), q.getNext()))
                           || included_rec(p, q.getNext())));
    }

    // Ritorna una nuova lista con gli elementi di @p in ordine inverso. Versione iterativa
    public static Node reverse(Node p) {
        Node q = null;
        while (p != null) {
            q = new Node(p.getElem(), q);
            p = p.getNext();
        }
        return q;
    }

    // Versione ricorsiva di reverse
    public static Node reverse_rec(Node p) {
        return reverse_aux(p, null); // partenza con la lista q vuota
    }

    // Copia l'elemento di @p in testa alla lista @q, e ritorna la nuova lista 
    // ottenuta dagli elementi di @p in ordine inverso, concatenati alla lista @q.
    // Metodo ausiliario per l'inversione della lista. 
    private static Node reverse_aux(Node p, Node q) {
        return p == null ? q : reverse_aux(p.getNext(),
                                           new Node(p.getElem(), q));
    }

    // Ritorna la lista i cui elementi sono le somme a coppie degli elementi corrispondenti 
    // di due liste @p e @q di uguale lunghezza. Versione ricorsiva.
    public static Node zipSum_rec(Node p, Node q) {
        assert (p == null && q == null) || (p != null && q != null);
        if (p == null && q == null)
            return null;
        else
            return new Node(p.getElem() + q.getElem(),
                            zipSum_rec(p.getNext(), q.getNext()));
    }

    // Versione iterativa di zipSum_rec.
    public static Node zipSum(Node p, Node q)
    {
        // la versione iterativa di zipSum si puo` ottenere costruendo la
        // lista risultante in ordine inversio, e poi utilizzando reverse.
        Node r = null;
        while (p != null && q != null) {
            r = new Node(p.getElem() + q.getElem(), r);
            p = p.getNext();
            q = q.getNext();
        }
        // Verifica che p e q abbiano la stessa lunghezza.
        assert p == null && q == null;
        return reverse(r);
    }
}
