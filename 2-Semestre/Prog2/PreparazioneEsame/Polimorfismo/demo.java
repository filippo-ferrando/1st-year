public class demo {
    public static void main(String[] args) {
        car c = new car();
        sportcar s = new sportcar();
        c.turnAround();
        s.turnLeft();

        System.out.println("c instanceof car: " + (c instanceof car));
        System.out.println("c instanceof sportcar: " + (c instanceof sportcar));

        System.out.println("s instanceof car: " + (s instanceof car));
        System.out.println("s instanceof sportcar: " + (s instanceof sportcar));
    }
    
}
