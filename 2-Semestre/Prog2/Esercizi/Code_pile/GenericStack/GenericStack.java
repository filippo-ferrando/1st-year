
public class GenericStack<T> {
    private GenericNode<T> first;
    
    public GenericStack() { first = null; }
    
    public boolean empty() { return first == null; }

    public void push(T elem) {
        first = new GenericNode<>(elem, first);
    }

    public T pop() {
        assert !empty(): "pop on empty stack";

        T x = first.getElem();
        first = first.getNext();
        
        return x;
    }

    public void scriviOutput() {
        GenericNode<T> s = first;

        while(s != null) {
            System.out.println( s.getElem() );
            s = s.getNext();
        }
    }
}


