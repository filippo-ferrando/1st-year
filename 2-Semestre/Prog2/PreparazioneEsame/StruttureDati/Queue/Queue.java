public class Queue {
    private Node first;

    Queue(){
        this.first = null;
    }

    Queue(int n){
        this.first = new Node(n);
    }

    Queue(int[] n){
        for(int i = 0; i < n.length; i++){
            this.enqueue(n[i]);
        }
    }

    // methods
    public void enqueue(int n){
        if(this.first == null){
            this.first = new Node(n);
        }else{
            Node tmp = this.first;
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(n));
        }
    }

    public void dequeue(){
        this.first = this.first.getNext();
    }

    public int peek(){
        return this.first.getValue();
    }

    public String toString(){
        if(this.first == null){
            return "null";
        }else{
            return this.first.toString();
        }
    }
    
}
