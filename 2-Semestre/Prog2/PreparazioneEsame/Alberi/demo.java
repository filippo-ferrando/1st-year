import java.util.*;

public class demo {
    public static void main(String[] args) {
        Random r = new Random();

        tree t = new leaf();

        for(int i = 0; i < 10; i++){
            t = t.insert(r.nextInt(20));
        }

        System.out.println("t = " + t);
        System.out.println("t.empty() = " + t.isEmpty());
        System.out.println("t.max() = " + t.max());
        System.out.println("t.search(5) = " + t.search(5));
        System.out.println("t.depth() = " + t.depth());
        System.out.println("t.size() = " + t.size());
        System.out.println("t.sum() = " + t.sum());
        System.out.println("t.contains(5, 2) = " + t.contains(5, 2));
    }
    
}
