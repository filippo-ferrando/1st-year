public class ImmutableTriangle {

    private ImmutablePoint a;
    private ImmutablePoint b;
    private ImmutablePoint c;

    public ImmutableTriangle(ImmutablePoint a, ImmutablePoint b, ImmutablePoint c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public ImmutablePoint getA() {
        return a;
    }

    public ImmutablePoint getB() {
        return b;
    }

    public ImmutablePoint getC() {
        return c;
    }

    public ImmutableTriangle translate(double dx, double dy) {
        return new ImmutableTriangle(a.translate(dx, dy), b.translate(dx, dy), c.translate(dx, dy));
    }

    public ImmutableTriangle rotate(double angle) {
        return new ImmutableTriangle(a.rotate(angle), b.rotate(angle), c.rotate(angle));
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