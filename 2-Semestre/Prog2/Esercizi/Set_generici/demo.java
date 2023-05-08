public class demo {
    public static void main(String[] args) {
        Set<Integer> s1 = new Set<Integer>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.print();
        System.out.println("s1.size(): " + s1.size());
        
        Set<Integer> s2 = new Set<Integer>();
        s2.add(2);
        s2.add(4);
        s2.print();
        System.out.println("s2.size(): " + s2.size());

        Set<Integer> s4 = new Set<Integer>();
        s4.add(5);
        s4.add(6);
        s4.print();
        System.out.println("s4.size(): " + s4.size());

        System.out.println(s2.subsetOf(s1));

        System.out.println(s1.equals(s2));

        Set<Integer> s3 = new Set<Integer>();
        s3 = s3.union(s4, s1);
        s3.print();

    }
    
}
