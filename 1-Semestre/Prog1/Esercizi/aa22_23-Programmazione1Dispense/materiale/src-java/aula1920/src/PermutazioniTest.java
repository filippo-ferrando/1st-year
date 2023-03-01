public class PermutazioniTest 
{
public static void main(String[] args) {

	int[] a0 = new int[0];
	int[] a1 = {1};
    int[] a2 = {1,2};
    int[] a3 = {1,2,3};
    int[] a4 = {1,2,3,4};
    
    System.out.println("==================");
    Permutazioni.permVideo(a0);
    System.out.println("==================");
    Permutazioni.permVideo(a1);
    System.out.println("==================");
    Permutazioni.permVideo(a2);
    System.out.println("==================");
    Permutazioni.permVideo(a3);

    System.out.println("******************");
    System.out.print(Permutazioni.permString(a0));
    System.out.println("******************");
    System.out.print(Permutazioni.permString(a1));
    System.out.println("******************");
    System.out.print(Permutazioni.permString(a2));
    System.out.println("******************");
    System.out.print(Permutazioni.permString(a3));
    
    System.out.println("++++++++++++++++++");
    System.out.print(LibMatriciInt.toStringMatInt(Permutazioni.permMatInt(a0)));
    System.out.println("++++++++++++++++++");
    System.out.print(LibMatriciInt.toStringMatInt(Permutazioni.permMatInt(a1)));
    System.out.println("++++++++++++++++++");
    System.out.print(LibMatriciInt.toStringMatInt(Permutazioni.permMatInt(a2)));    
    System.out.println("++++++++++++++++++");
    System.out.print(LibMatriciInt.toStringMatInt(Permutazioni.permMatInt(a3)));    
    System.out.println("++++++++++++++++++");
    System.out.print(LibMatriciInt.toStringMatInt(Permutazioni.permMatInt(a4)));  
    
    }
} // class
