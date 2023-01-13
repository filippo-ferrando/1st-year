public class TorreHanoiTest {
    public static void main(String[] args) {
        int numeroDischi = 0;

        System.out.println("-------------------------------");
        System.out.println("Torre di Hanoi con " + ++numeroDischi + ".");
        TorreHanoi.tH(numeroDischi, TorreHanoi.PioloA, TorreHanoi.PioloB,
                TorreHanoi.PioloC);

        System.out.println("-------------------------------");
        System.out.println("Torre di Hanoi con " + ++numeroDischi + ".");
        TorreHanoi.tH(numeroDischi, TorreHanoi.PioloA, TorreHanoi.PioloB,
                TorreHanoi.PioloC);

        System.out.println("-------------------------------");
        System.out.println("Torre di Hanoi con " + ++numeroDischi + ".");
        TorreHanoi.tH(numeroDischi, TorreHanoi.PioloA, TorreHanoi.PioloB,
                TorreHanoi.PioloC);

        System.out.println("-------------------------------");
        System.out.println("Torre di Hanoi con " + ++numeroDischi + ".");
        TorreHanoi.tH(numeroDischi, TorreHanoi.PioloA, TorreHanoi.PioloB,
                TorreHanoi.PioloC);
    }
}
