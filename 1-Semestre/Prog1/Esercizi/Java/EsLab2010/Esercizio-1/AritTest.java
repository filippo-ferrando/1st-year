import java.lang.Math;

public class AritTest {
	public static void main(String[] args){
		System.out.println("Java Math");
		System.out.println(2+2);
		System.out.println("\nMetodo Iterativo");
		System.out.println(AritIter.piu(2,2));
		System.out.println("Metodo Ricorsivo \n");
		System.out.println(AritCov.piu(2,2));
		
		System.out.println("\nJava Math");
		System.out.println(7-2);
		System.out.println("\nMetodo Iterativo");
		System.out.println(AritIter.sott(7,2));
		System.out.println("\nMetodo Ricorsivo");
		System.out.println(AritCov.meno(7,2));
		
		System.out.println("\nJava Math");
		System.out.println(3*2);
		System.out.println("\nMetodo Iterativo");
		System.out.println(AritIter.per(3,2));
		System.out.println("\nMetodo Ricorsivo");
		System.out.println(AritCov.per(3,2));
		
		System.out.println("\nJava Math");
		System.out.println(9/3);
		System.out.println("\nMetodo Iterativo");
		System.out.println(AritIter.divisione(9,3));
		System.out.println("\nMetodo Ricorsivo");
		System.out.println(AritCov.quoziente(9,3));
		
		System.out.println("\nJava Math");
		System.out.println(Math.pow(2,4));
		System.out.println("\nMetodo Iterativo");
		System.out.println(AritIter.esp(2,4));
		System.out.println("\nMetodo Ricorsivo");
		System.out.println(AritCov.esp(2,4));
	}
}