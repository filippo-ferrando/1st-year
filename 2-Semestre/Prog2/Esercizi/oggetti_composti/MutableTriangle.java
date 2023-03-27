public class MutableTriangle {

    private MutablePoint a;
    private MutablePoint b;
    private MutablePoint c;

    public MutableTriangle(MutablePoint a, MutablePoint b, MutablePoint c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MutablePoint getA() {
        return a;
    }

    public MutablePoint getB() {
        return b;
    }

    public MutablePoint getC() {
        return c;
    }

    public void translate(double dx, double dy) {
        a.translate(dx, dy);
        b.translate(dx, dy);
        c.translate(dx, dy);
    }

    public void rotate(double angle) {
        a.rotate(angle);
        b.rotate(angle);
        c.rotate(angle);
    }

    public double perimeter() {
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        System.out.println(ab + bc + ca);
        return ab + bc + ca;
    }

    public double area() {
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        double s = (ab + bc + ca) / 2;
        System.out.println(Math.sqrt(s * (s - ab) * (s - bc) * (s - ca)));
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
    }
    
}
