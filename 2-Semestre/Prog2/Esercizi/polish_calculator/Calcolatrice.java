class Calcolatrice { //classe non eseguibile e non pubblica
    // una calcolatrice e' una pila che contiene fino a 100 interi.
    // L'ultimo intero e' il risultato delle operazioni fatte finora
    // e la prossima operazione agisce sugli ultimi due interi a,b
    // e li rimpiazza con a+b (per una addizione) oppure a*b (per una moltiplicazione)

    // stack = pila che contiene fino a 100 interi */
    private int[] stack = new int[100];

    // size = numero di interi introdotti: all'inizio 0
    // le posizioni occupate dell'array hanno indice: 0, 1, ..., size-1
    private int size = 0;

    // push(x): aggiunge un intero x allo stack dopo la parte utilizzata
    // e aumenta di 1 la parte di stack utilizzata (variabile size)
    private void push(int x) {
        stack[size] = x;
        size++;
    }

    // pop(): restituisce l'ultima intero dello stack
    // e lo "cancella" riducendo di 1 la parte di stack utilizzata (variabize size)
    private int pop() {
        size--;
        return stack[size];
    }

    private void stampa(){
        System.out.println("stack size: " + size);
        System.out.println("stack elements: ");
        for(int i = 0; i < size; i++){
            System.out.println(stack[i]);
        }
    }

    // questo e' un metodo pubblico
    public int esegui(String istruzioni) {
        int numeroIstruzioni = istruzioni.length(); //lunghezza
        int pc = 0; /** inizio leggendo l'istruzione 0 */

        while (pc < numeroIstruzioni){ //eseguo le istruzioni in ordine
            char c = istruzioni.charAt(pc); //c = carattere di posto pc

            if (c >= '0' && c <= '9'){ //vero se c e' una cifra
                push(c - '0'); //questa formula mi da' il valore della cifra c

            }else if (c == '+') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo + ultimo);

            } else if (c == '*'){
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo * ultimo);

            }else if(c == '-'){
                int ultimo = pop();
                int penultimo = pop();
                push(penultimo - ultimo);

            }else if(c == '/'){
                int ultimo = pop();
                int penultimo = pop();
                push(penultimo/ultimo);
            }else if(c == '%'){
                int ultimo = pop();
                int penultimo = pop();
                push(penultimo%ultimo);
            }else if(c == '#'){
                stampa();
            }

            pc++; //eseguita c passo alla prossima istruzione
        }
        return pop();
//alla fine delle istruzioni restituisco l'ultimo risultato
//ottenuto
    } //alla fine restituisco l'ultimo risultato ottenuto
}

