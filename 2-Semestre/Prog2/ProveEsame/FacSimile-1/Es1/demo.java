public class demo {

    public static <T> boolean controlla(Node<T> p, Node<T> q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.elem == q.elem){
            return true;
        }else{
            return controlla(p.next, q.next);
        }

    }
    public static void main(String[] args) {
        Node n1 = new Node(7,null);
        Node n0 = new Node(5, n1);

        Node q2 = new Node(1, null);
        Node q1 = new Node(6, q2);
        Node q0 = new Node(8, q1);

        System.out.println(controlla(n0, q0));
    }
    
}
