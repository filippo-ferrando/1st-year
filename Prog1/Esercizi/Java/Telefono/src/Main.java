import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i=0; i< numbers.length; i++) {
            System.out.println("Inserisci il numero");
            numbers[i] = in.nextInt();
            while(numbers[i] > 10){
                numbers[i] = numbers[i] - 10;
            }
        }
        for (int i=0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        Random rand = new Random();
        int limit = 3;
        int irand = rand.nextInt(limit);
        switch (irand) {
            case 0:
                System.out.println("Libero");
                break;
            case 1:
                System.out.println("Occupato");
                break;
            case 2:
                Scanner inn = new Scanner(System.in);
                System.out.println("Segreteria");
                String risp = inn.nextLine();
                System.out.println("\n" + risp);
                break;
        }
    }
}