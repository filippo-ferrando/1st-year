public class Node {
    private int value;
    private Node next;

    Node(){
        this.value = 0;
        this.next = null;
    }

    Node(int value){
        this.value = value;
        this.next = null;
    }

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    // getters
    public int getValue(){
        return this.value;
    }

    public Node getNext(){
        return this.next;
    }

    // setters
    public void setValue(int value){
        this.value = value;
    }

    public void setNext(Node next){
        this.next = next;
    }

    // methods
    public String toString(){
        if(next == null){
            return value + ".";
        }else{
            return value + " --> " + next.toString();
        }
    }
}
