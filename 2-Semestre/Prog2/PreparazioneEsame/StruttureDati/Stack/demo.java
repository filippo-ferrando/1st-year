public class demo {
    public static void main(String[] args) {
        
        Stack s = new Stack();

        s.push(2);
        s.push(4);
        s.push(6);

        System.out.println(s);
        System.out.println(s.peek());

        int n = s.pop();

        System.out.println(n);

        System.out.println(s.peek());
    }
    
}
