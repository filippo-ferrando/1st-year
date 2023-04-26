public class figura {
    public static void main(String[] args) {
        poligono p = new poligono();

        p.setlLati(5.2f);
        p.setnLati(4);

        pentagono pent = new pentagono(5.9f);

        System.out.println(pent.perimetro());
    }
}