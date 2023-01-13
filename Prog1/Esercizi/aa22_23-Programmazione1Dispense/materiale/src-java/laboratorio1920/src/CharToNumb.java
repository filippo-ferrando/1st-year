/**
 * Classe che stampa la codifica numerica in base 10
 * di ciascun singolo carattere contenuto in una
 * sequenza di caratteri immessa da tastiera e che termini
 * con 'invio'. Al termine, stampa anche il numero di caratteri
 * invisibili contenuti nella sequenza. 
 */
public class CharToNumb {

    public static void main(String[] args) {
       
        char car = ' ';
        int  cont = 0;
        do {
            
            car = SIn.readChar();
            System.out.print(((int)car) + " ");
            cont ++;
            
        } while (car != '\n' && car != '\r');
        
        System.out.println("\n Numero caratteri totali (inclusi quelli invisibili \\r e \\n):" + cont );    
    }
}
