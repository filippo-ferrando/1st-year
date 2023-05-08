public class demo {
    public static void main(String[] args) {
        DynamicQueueGeneric<Integer> q = new DynamicQueueGeneric<Integer>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.scriviOutput();
        System.out.println("dequeue: " + q.dequeue());
        q.scriviOutput();
        System.out.println("dequeue: " + q.dequeue());
        q.scriviOutput();
        System.out.println("dequeue: " + q.dequeue());
        q.scriviOutput();
        System.out.println("dequeue: " + q.dequeue());
        q.scriviOutput();

        DynamicQueueGeneric<String> q2 = new DynamicQueueGeneric<String>();
        q2.enqueue("ciao");
        q2.enqueue("come");
        q2.enqueue("stai");
        q2.scriviOutput();
        System.out.println("dequeue: " + q2.dequeue());
        System.out.println("dequeue: " + q2.dequeue());
        System.out.println("dequeue: " + q2.dequeue());
        q2.scriviOutput();

        DynamicQueueGeneric<Double> q3 = new DynamicQueueGeneric<Double>();
        q3.enqueue(1.0);
        q3.enqueue(2.5);
        q3.enqueue(3.0);
        q3.scriviOutput();
        System.out.println("dequeue: " + q3.dequeue());
        System.out.println("dequeue: " + q3.dequeue());
        System.out.println("dequeue: " + q3.dequeue());
        q3.scriviOutput();

        DynamicQueueGeneric<Person> q4 = new DynamicQueueGeneric<Person>();
        q4.enqueue(new Person("Filippo", "Ferrando"));
        q4.enqueue(new Person("Piero", "Pelù"));
        q4.enqueue(new Person("Giovanni", "Muciacia"));
        q4.scriviOutput();
        System.out.println(q4.contains(new Person("Filippo", "Ferrando")));
        System.out.println("dequeue: " + q4.dequeue());
        System.out.println("dequeue: " + q4.dequeue());
        System.out.println("dequeue: " + q4.dequeue());
    }
    
}
