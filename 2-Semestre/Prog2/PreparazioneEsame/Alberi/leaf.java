/*
 * Una foglia indica la fine di una diramazione, per definizione non contiene valori, i vari metodi implementati risultano quindi inutili applicati a questa classe
 */

public class leaf extends tree{
    public leaf () {}

    protected String toStringAux(String prefix, String root, String left, String right){
        return prefix + root + "\n";
    }

    public boolean isEmpty(){
        return true;
    }

    public int max(){
        assert false;
        return -1;
    }

    public boolean search(int n){
        return false;
    }

    public tree delete(int n){
        return this;
    }

    public tree insert(int n){
        return new branch(n, this, this);
    }

    public int depth(){
        return 0;
    }

    public int size(){
        return 0;
    }

    public int sum(){
        return 0;
    }

    public boolean contains(int n, int x){
        return false;
    }
}
