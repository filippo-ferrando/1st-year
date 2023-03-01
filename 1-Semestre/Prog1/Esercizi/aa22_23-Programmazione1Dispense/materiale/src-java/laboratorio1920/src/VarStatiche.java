public class VarStatiche {

  static final int DELTA = 1;
  static int statica = 0;

  public static void main(String[] args) {
    int x = 0;
    System.out.println("Prima di mA(x), statica == " + statica + ".");
    System.out.println("Prima di mA(x), x == " + x + ".");
    mA(x);
    System.out.println("Dopo di mA(x), statica == " + statica + ".");
    System.out.println("Dopo di mA(x), x == " + x + ".");
    System.out.println("Prima di mB(x, 3), statica == " + statica + ".");
    System.out.println("Prima di mB(x, 3), x == " + x + ".");
    mB(x,3);
    System.out.println("Dopo di mB(x, 3), statica == " + statica + ".");
    System.out.println("Dopo di mB(x, 3), x == " + x + ".");
  }

  public static void mA(int x) {
    x = x + DELTA;
    statica = statica + DELTA;
  }

  public static void mB(int x, int y) {
    final int DELTA = 5;
    x = x + y;
    statica = statica + DELTA;
  }
}
