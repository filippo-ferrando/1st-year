import java.util.*;

public class TestGenericStack {
    public static void main(String[] args) {
        // Creiamo uno stack per contenere stringhe
        System.out.println("Stampo p = {\"hello \", \"world!\"} ");
        
        GenericStack<String> p = new GenericStack<>(); // p pila String

        p.push("hello ");
        // il metodo push si aspetta un argomento di tipo String

        p.push("world!");
        p.scriviOutput();
        // stampo 2 stringhe

        String s1 = p.pop();
        // il metodo pop ritorna un valore di tipo String
        String s2 = p.pop();
        p.push(s2 + s1); // s2 + s1 produce una nuova stringa

        // p.push(1);
        // ERRORE: non posso inserire int in uno stack di String

        // Creiamo uno stack per contenere numeri interi. Notiamo che
        // NON e` possibile usare tipi primitivi int, boolean double
        // per istanziare classi generiche, dunque DOBBIAMO usare il tipo Integer,
        // che e' una classe "wrapper" (i numeri devono comparire "inscatolati" nello stack)

        GenericStack<Integer> q = new GenericStack<>(); // q pila Integer

        q.push(1);
        // il metodo push si aspetta un argomento di tipo Integer,
        // gli forniamo un int che puo' essere convertito in Integer grazie all'autoboxing

        q.push(2);
        System.out.println("Stampo q = {1,2} ");
        q.scriviOutput(); // stampo 2 interi

        q.push( q.pop() + q.pop() );
        // il metodo pop ritorna un Integer da cui Java estrae automaticamente un int
        // nel momento in cui vede che usiamo il valore per un'operazione primitiva (+)

        // q.push("hello"); // ERRORE: non posso inserire String in uno stack di Integer

        // Inserisco alcuni numeri casuali tra 0 e 1 in una pila s di Double
        Random r = new Random(); //r = generatore numeri casuali

        GenericStack<Double> s = new GenericStack<Double>(); // s pila Double
        
        // Scelgo a caso la dimensione dello stack, al massimo 20 elementi
        int n = r.nextInt(20);

        // Scelgo a caso ogni elemento dello stack e lo aggiungo a s
        for (int i = 0; i < n; i++)
            s.push( r.nextDouble() );

        // Possiamo usare il metodo printStack per stampare il contenuto di
        // Stack di elementi di tipo arbitrario (ma tutti dello stesso tipo)
        System.out.println( "--->(1) p e' uno stack di 1 stringa");
        p.scriviOutput(); // p e' uno Stack di String

        System.out.println( "--->(2) q e' uno stack di 1 Integer");
        q.scriviOutput(); // q e' uno Stack di Integer
        
        System.out.println( "--->(3) s e' uno stack di " + n + " Double");
        s.scriviOutput(); // s e' uno Stack di Double
    }
}


