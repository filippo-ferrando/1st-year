public class branch extends tree{
    
    private int elem;
    private tree left;
    private tree right;

    public branch(int elem, tree left, tree right){
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    protected String toStringAux(String prefix, String root, String left, String right){
        return this.right.toStringAux(prefix + right,"   \\", "  ", "   |") +
            "\n" + prefix + root + "[" + this.elem + "]" + "\n" +
            this.left.toStringAux(prefix + left , "   /", "  |", "   ");
    }

    public boolean isEmpty(){
        return false;
    }

    public int max(){
        return right.isEmpty() ? elem : right.max();
    }

    public boolean search(int n){
        return n == elem || left.search(n) || right.search(n);
    }

    public tree insert(int n){
        if(n < elem) left = left.insert(n);
        else if (n > elem) right = right.insert(n);

        return this;
    }

    public tree delete(int n){
        if(n == elem){
            if(left.isEmpty()){
                return right;
            }else if(right.isEmpty()){
                return left;
            }
            else{
                elem = left.max();
                left = left.delete(elem);
                return this;
            }
        }
        else if(n < elem){
            left = left.delete(n);
            return this;
        }
        else{
            right = right.delete(n);
            return this;
        }
    }

    public int depth(){
        return 1 + Math.max(left.depth(), right.depth());
    }

    public int size(){
        return 1 + left.size() + right.size();
    }

    public int sum(){
        return elem + left.sum() + right.sum();
    }

    public boolean contains(int n, int x){
        if(elem == n) return true;
        else if(x == 0) return false;
        else if(n > 0) return right.contains(n, x-1);
        else return left.contains(n, x-1);
    }


}
