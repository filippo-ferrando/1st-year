public class Node {

    public int elem;
    public Node next;

    public Node (int elem, Node next){
        this.elem = elem;
        this.next = next;
    }

    public String toString(){
        if(next == null){
            return "" + elem;
        }else{
            return elem + ", " + next.toString();
        }
    }
}