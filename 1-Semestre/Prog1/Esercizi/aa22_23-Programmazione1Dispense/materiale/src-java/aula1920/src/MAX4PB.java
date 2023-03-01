/**
 * Classe che risolve il problema di trovare il massimo tra
 * quattro variabili, ma in modo non naturale. Lo scopo e' evidenziare
 * come si possano annidare delle selezioni.
 */
public class MAX4PB {
    
    public static void main (String[] args) {

        int tmp = 0;
        int a = 3;
        int b = 5;
        int c = 2;
        int d = 1;
        int max = a;
        
        if (b <= max) {    
            if (c <= max) {    
                if (d <= max) {    
                } else {
                    max = d;
                }
            } else { 
                max = c;
                if (d <= max) {    
                } else {
                    max = d;
                }                
            }
        } else {
            max = b;
            if (c <= max) {    
                if (d <= max) {    
                } else {
                    max = d;
                }
            } else { 
                max = c;
                if (d <= max) {    
                } else {
                    max = d;
                }                
            }            
        }
        System.out.println(" max = " + max);
    }
}