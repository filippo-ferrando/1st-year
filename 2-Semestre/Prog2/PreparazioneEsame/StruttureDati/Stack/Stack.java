public class Stack {
    private Node head;

    Stack(){
        this.head = null;
    }
    Stack(int n){
        this.head = new Node(n);
    }


    int peek(){
        return this.head.getValue();
    }

    void push(int n){
        this.head = new Node(n, this.head);
    }

    int pop(){
        int res = this.head.getValue();
        this.head = this.head.getNext();
        return res;
    }
    
    public String toString(){
        if(this.head == null){
            return "null";
        }else{
            return this.head.toString();
        }
    }
}
