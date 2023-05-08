public class Set<T> {
    
    private GenericNode<T> first;
    private int size;


    public Set(){
        first = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean empty(){
        return first == null;
    }

    public void add(T elem){
        if(!contains(elem)){
            GenericNode p = new GenericNode(elem, null);
            p.setNext(first);
            first = p;
            size++;
        }
    }

    public boolean contains(T elem){
        for(GenericNode<T> p = first; p != null; p = p.getNext()){
            if(p.getElem().equals(elem))
                return true;
        }
        return false;
    }

    public boolean subsetOf(Set<T> set){
        for(GenericNode<T> p = first; p != null; p = p.getNext()){
            if(!set.contains(p.getElem()))
                return false;
        }
        return true;
    }

    public boolean equals(Set<T> set){
        return subsetOf(set) && set.subsetOf(this);
    }

    public Set<T> union(Set<T> s1, Set<T> s2){
        Set<T> s3 = new Set<T>();
        for(GenericNode<T> p = s1.first; p != null; p = p.getNext()){
            s3.add(p.getElem());
        }
        for(GenericNode<T> p = s2.first; p != null; p = p.getNext()){
            s3.add(p.getElem());
        }
        return s3;
    }

    public Set<T> interserction(Set<T> s1, Set<T> s2){
        Set<T> s3 = new Set<T>();
        for(GenericNode<T> p = s1.first; p != null; p = p.getNext()){
            if(s1.contains(p.getElem()))
                s3.add(p.getElem());
        }
        for(GenericNode<T> p = s2.first; p != null; p = p.getNext()){
            if(s2.contains(p.getElem()))
                s3.add(p.getElem());
        }
        return s3;
    }

    public boolean remove(T elem){
        if(contains(elem)){
            GenericNode<T> p = first;
            GenericNode<T> prev = null;

            while(!p.getElem().equals(elem)){
                prev = p;
                p = p.getNext();
            }

            if(prev == null)
                first = p.getNext();
            else
                prev.setNext(p.getNext());
                
            size--;
            return true;
        }
        return false;
    }

    public void print(){
        for(GenericNode<T> p = first; p != null; p = p.getNext()){
            System.out.print(p.getElem() + " ");
        }
        System.out.println();
    }
}