public class figura {
    public static void main(String[] args) {
        poligono p = new poligono();

        p.nLati = 4;
        p.lLati = 5.2f;

        pentagono pent = new pentagono(5.9f);

        System.out.println(pent.perimetro());
    }
}