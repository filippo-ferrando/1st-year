import java.util.Scanner;

public class testCalc{
    public static void main(String[] args){
        Calcolatrice c = new Calcolatrice();
        System.out.println("Inserire calcoli in RPM (simboli +,*)");
        Scanner scanner = new Scanner(System.in);
        while(1==1){

            String a = scanner.next();
            System.out.println(c.esegui(a) + "\n");
        }
    }
}

/* esercizio 1
    - 35*82*+52*7+*
    - 52*9*8*7*6*5*4*3*2*1*
    - non trovato

    esercizio 4
    - n2*1+

    esercizio 5
    - n2%


*/
