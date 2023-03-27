public class test_immutable_triagle {
    public static void main(String[] args) {
        ImmutablePoint a = new ImmutablePoint(0, 0);
        ImmutablePoint b = new ImmutablePoint(0, 1);
        ImmutablePoint c = new ImmutablePoint(1, 0);
        ImmutableTriangle t = new ImmutableTriangle(a, b, c);
        System.out.println(t.perimeter());
        System.out.println(t.area());
        System.out.println(t.getA().getX());
        System.out.println(t.getA().getY());
        System.out.println(t.getB().getX());
        System.out.println(t.getB().getY());
        System.out.println(t.getC().getX());
        System.out.println(t.getC().getY());
        ImmutableTriangle t2 = t.translate(1, 1);
        System.out.println(t2.getA().getX());
        System.out.println(t2.getA().getY());
        System.out.println(t2.getB().getX());
        System.out.println(t2.getB().getY());
        System.out.println(t2.getC().getX());
        System.out.println(t2.getC().getY());
        ImmutableTriangle t3 = t.rotate(Math.PI / 2);
        System.out.println(t3.getA().getX());
        System.out.println(t3.getA().getY());
        System.out.println(t3.getB().getX());
        System.out.println(t3.getB().getY());
        System.out.println(t3.getC().getX());
        System.out.println(t3.getC().getY());
    }
    
}
