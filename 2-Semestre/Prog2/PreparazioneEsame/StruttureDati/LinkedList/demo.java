public class demo {
    public static void main(String[] args) {
        Node n6 = new Node(45);
        Node n5 = new Node(34, n6);
        Node n4 = new Node(23, n5);
        Node n3 = new Node(12, n4);
        Node n2 = new Node(1, n3);
        Node n1 = new Node(0, n2);

        System.out.println(n1);

        Node n7 = new Node(67);

        n6.setNext(n7);

        System.out.println(n1);

        System.out.println(n5.getNext());
    }
    
}
