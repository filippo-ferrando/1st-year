/**
 * Operatori booleani !, &&, || e qualche derivato...
 */
public class OperatoriBooleani {
    public static void main(String[] args) {

        System.out.println("   X   || " + "!X");
        System.out.println("----------" + "------");
        System.out.println(" false || " + (!false));
        System.out.println(" true  || " + (!true));
        System.out.println();
        System.out.println();

        System.out.println("   X   |   Y   || " + "X && Y");
        System.out.println("------------------" + "------");
        System.out.println(" false | false || " + (false && false));
        System.out.println(" false | true  || " + (false && true));
        System.out.println(" true  | false || " + (true && false));
        System.out.println(" true  | true  || " + (true && true));
        System.out.println();
        System.out.println();

        System.out.println("   X   |   Y   || " + "X || Y");
        System.out.println("------------------" + "------");
        System.out.println(" false | false || " + (false || false));
        System.out.println(" false | true  || " + (false || true));
        System.out.println(" true  | false || " + (true || false));
        System.out.println(" true  | true  || " + (true || true));
        System.out.println();
        System.out.println();

        System.out.println("   X   |   Y   || " + "X => Y");
        System.out.println("------------------" + "------");
        System.out.println(" false | false || " + (!false || false));
        System.out.println(" false | true  || " + (!false || true));
        System.out.println(" true  | false || " + (!true || false));
        System.out.println(" true  | true  || " + (!true || true));
        System.out.println();
        System.out.println();
    }
}
