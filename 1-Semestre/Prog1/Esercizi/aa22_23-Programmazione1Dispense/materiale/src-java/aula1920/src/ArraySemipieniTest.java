/** 
 * Lo scopo di questa classe e'ovvio.
 */
public class ArraySemipieniTest {

	public static void main(String[] args) {
		ArraySemipieni.resetArraySemipieni();

		// ArraySemipieni.elementi[ArraySemipieni.nElementi] = 1; // accesso diretto vietato	
		ArraySemipieni.aggiungeElemento(1);
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.aggiungeElemento(2);
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.aggiungeElemento(3);
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.aggiungeElemento(4);		
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.resetArraySemipieni();
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.aggiungeElemento(10);
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.aggiungeElemento(20);
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.aggiungeElemento(30);
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.aggiungeElemento(40);
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.sostituisce(10, 100);
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.sostituisce(1, 100);
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.cancellaElementoInPosizione(10);
		System.out.println(ArraySemipieni.toString(" "));
		ArraySemipieni.cancellaElementoInPosizione(1);
		System.out.println(ArraySemipieni.toString(" "));
		System.out.println(ArraySemipieni.esiste(1));
		System.out.println(ArraySemipieni.esiste(40));
		System.out.println(ArraySemipieni.esisteInPosizione(1));
		System.out.println(ArraySemipieni.esisteInPosizione(40));	
	}
}
