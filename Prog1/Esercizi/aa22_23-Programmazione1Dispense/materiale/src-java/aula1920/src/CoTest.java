public class CoTest {
	public static void main(String[] args) {
		
	    int[] a40 = {1,2,3,4};
	    int[] a41 = {1,2,3,4};
	    int[] a42 = {1,2,3,4};
	    int[] a43 = {1,2,3,4};
	    int[] a44 = {1,2,3,4};
	    
	    System.out.println("##################");
	    System.out.print(LibMatriciInt.toStringMatInt(PeDiCo.comb(a40, 0)));
	    System.out.println("##################");
	    System.out.print(LibMatriciInt.toStringMatInt(PeDiCo.comb(a41, 1)));
	    System.out.println("##################");
	    System.out.print(LibMatriciInt.toStringMatInt(PeDiCo.comb(a42, 2)));
	    System.out.println("##################");
	    System.out.print(LibMatriciInt.toStringMatInt(PeDiCo.comb(a43, 3)));
	    System.out.println("##################");
	    System.out.print(LibMatriciInt.toStringMatInt(PeDiCo.comb(a44, 4)));
	}
}
