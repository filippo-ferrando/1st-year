public class ValoriMinimiMassimiInteri {
  public static void main(String[] args) {

    // interi
    byte  largestByte    = Byte.MAX_VALUE;
    short largestShort   = Short.MAX_VALUE;
    int   largestInteger = Integer.MAX_VALUE;
    long  largestLong    = Long.MAX_VALUE;

    byte  smallestByte    = Byte.MIN_VALUE;
    short smallestShort   = Short.MIN_VALUE;
    int   smallestInteger = Integer.MIN_VALUE;
    long  smallestLong    = Long.MIN_VALUE;

    System.out.println("The largest byte value is "    + largestByte);
    System.out.println("The largest short value is "   + largestShort);
    System.out.println("The largest integer value is " + largestInteger);
    System.out.println("The largest long value is "    + largestLong);

    System.out.println("The smallest byte value is "    + smallestByte);
    System.out.println("The smallest short value is "   + smallestShort);
    System.out.println("The smallest integer value is " + smallestInteger);
    System.out.println("The smallest long value is "    + smallestLong);

  }
}