
public class PeTest {

	public static void main(String[] args) {

		int[] a00 = new int[0];
		int[] a10 = {1};
	    int[] a20 = {1,2};
	    int[] a30 = {1,2,3};
	    int[] a40 = {1,2,3,4};
	    
	    System.out.println("##################");
	    PeDiCo.perm(a00);
	    System.out.println("##################");
	    PeDiCo.perm(a10);
	    System.out.println("##################");
	    PeDiCo.perm(a20);
	    System.out.println("##################");
	    PeDiCo.perm(a30);
	    System.out.println("##################");
	    PeDiCo.perm(a40);

	}

}
