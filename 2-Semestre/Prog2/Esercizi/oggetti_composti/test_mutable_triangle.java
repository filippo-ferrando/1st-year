public class test_mutable_triangle {
    public static void main(String[] args) {
        MutablePoint a = new MutablePoint(0, 0);
        MutablePoint b = new MutablePoint(0, 1);
        MutablePoint c = new MutablePoint(1, 0);
        MutableTriangle t = new MutableTriangle(a, b, c);
        System.out.println(t.perimeter());
        System.out.println(t.area());
        System.out.println(t.getA().getX());
        System.out.println(t.getA().getY());
        System.out.println(t.getB().getX());
        System.out.println(t.getB().getY());
        System.out.println(t.getC().getX());
        System.out.println(t.getC().getY());
        t.translate(1, 1);
        System.out.println(t.getA().getX());
        System.out.println(t.getA().getY());
        System.out.println(t.getB().getX());
        System.out.println(t.getB().getY());
        System.out.println(t.getC().getX());
        System.out.println(t.getC().getY());
        t.rotate(Math.PI / 2);
        System.out.println(t.getA().getX());
        System.out.println(t.getA().getY());
        System.out.println(t.getB().getX());
        System.out.println(t.getB().getY());
        System.out.println(t.getC().getX());
        System.out.println(t.getC().getY());
    }
    
}
