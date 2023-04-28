public class Node<T> {

    public T elem;
    public Node<T> next;

    public Node (T elem, Node<T> next){
        this.elem = elem;
        this.next = next;
    }
}
