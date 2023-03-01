/**
 * Illustra un serie di esempi che costituiscono espressioni booleane, le quali
 * possono essere argomento dei costrutti {@code if-then} e {@code while}.
 */

public class EspressioniBooleane {

    public static void main(String[] args) {
        int a, b;
        boolean espressione, x, y;
        int c = 0;

        System.out.println("---- Caso " + c);
        c = c + 1;
        a = 3;
        b = 2;
        System.out.println(a == b); // false
        espressione = (a == b);
        System.out.println(espressione); // false
        espressione = !(a == b);
        System.out.println(espressione); // true

        System.out.println("---- Caso " + c);
        c = c + 1;
        a = 3;
        b = 3;
        espressione = (a == b);
        System.out.println(a == b); // true
        espressione = (a == b);
        System.out.println(espressione); // true
        System.out.println(!espressione); // false

        System.out.println("---- Caso " + c);
        c = c + 1;
        b = 7;
        espressione = (3 <= b && b <= 5);
        System.out.println(espressione); // false

        System.out.println("---- Caso " + c);
        c = c + 1;
        b = 6;
        espressione = (b <= 5 || b >= 3);
        System.out.println(espressione); // true

        System.out.println("---- Caso " + c);
        c = c + 1;
        a = 4;
        b = 6;
        espressione = (b <= 5 || a >= 3);
        System.out.println(espressione); // true

        System.out.println("---- Caso " + c);
        c = c + 1;
        a = 7;
        b = 6;
        espressione = ((b <= 5 || a >= 3) == (a + 1 < 9));
        System.out.println(espressione); // true

        System.out.println("---- Caso " + c);
        c = c + 1;
        x = true;
        y = false;
        espressione = (!(x && y) == !x || !y);
        System.out.println(espressione); // true

        System.out.println("---- Caso " + c);
        c = c + 1;
        x = true;
        y = false;
        espressione = (x || y == !(!x && !y));
        System.out.println(espressione); // true

        System.out.println("---- Caso " + c);
        c = c + 1;
        x = true;
        y = false;
        espressione = (x ^ y == (x && !y) || (!x && y));
        System.out.println(espressione); // true

        System.out.println("---- Caso " + c);
        c = c + 1;
        a = 3;
        b = 7;
        x = false;
        espressione = (x = a <= b); // side effect su x
        System.out.println(espressione); // true
        System.out.println(x); // true

        System.out.println("---- Caso " + c);
        c = c + 1;
        x = true;
        a = 7;
        b = 3;
        espressione = (x && (y = a <= b)); // side effect su y
        System.out.println(espressione); // false
        System.out.println(y); // false
    }
}
