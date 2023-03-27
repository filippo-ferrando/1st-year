public class testMatrix {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        m1.setVal(1, 0, 0);
        m1.setVal(2, 0, 1);
        m1.setVal(3, 1, 0);
        m1.setVal(4, 1, 1);

        m2.setVal(2, 0, 0);
        m2.setVal(4, 0, 1);
        m2.setVal(6, 1, 0);
        m2.setVal(8, 1, 1);

        
        m1.printMat();
        System.out.println("\n");

        m1.add(m2);
        m1.printMat();
        System.out.println("\n");

        m1.setVal(1, 0, 0);
        m1.setVal(2, 0, 1);
        m1.setVal(3, 1, 0);
        m1.setVal(4, 1, 1);

        m2.setVal(2, 0, 0);
        m2.setVal(4, 0, 1);
        m2.setVal(6, 1, 0);
        m2.setVal(8, 1, 1);

        m1.mul(m2);
        m1.printMat();
        System.out.println("\n");

        m1.setVal(1, 0, 0);
        m1.setVal(2, 0, 1);
        m1.setVal(3, 1, 0);
        m1.setVal(4, 1, 1);

        m2.setVal(2, 0, 0);
        m2.setVal(4, 0, 1);
        m2.setVal(6, 1, 0);
        m2.setVal(8, 1, 1);

        m1.pow(m2);
        m1.printMat();
        System.out.println("\n");
        
    }
    
}
