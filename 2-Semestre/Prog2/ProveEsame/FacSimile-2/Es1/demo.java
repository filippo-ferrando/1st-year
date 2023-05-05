public class demo {
    //scrivi una funzione ricorsiva che restituisca la sottrazione di due liste senza modificare nessuna delle 2 liste
    public static Node diff(Node p, Node q){
        if(p == null){ //lista di partenza vuota -> la risultante sarà per forza vuota
            return null;
        }
        if(q == null){ //lista di confronto vuota -> i valori saranno tutti quelli contenuti in p
            return p;
        }
        if(p.elem == q.elem){ //se l'elemento corrisponde lo salto e richiamo la funzione sui prossimi valori
            return diff(p.next, q.next);
        }else{
            return new Node(p.elem, diff(p.next, q)); // se l'elemento non corrisponde aggiungo alla lista l'elemento trovato e richiamo la funzione sul prossimo elemento di p
        }
    }


    public static void main(String[] args) {
        Node n1 = new Node(7,null);
        Node n0 = new Node(2, n1);

        Node q2 = new Node(1, null);
        Node q1 = new Node(6, q2);
        Node q0 = new Node(5, q1);

        Node res = diff(n0, q0);
        System.out.println(res);
    }
    
}
