public class demo {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        
        Queue q = new Queue(n);

        System.out.println(q + "\n");
        System.out.println(q.peek() + "\n");

        q.dequeue();

        System.out.println(q + "\n");

        q.enqueue(6);

        System.out.println(q + "\n");

    }
}
