public class TestPilaDinamica {
	
	public static void main(String[] args) {
		PilaDinamica pila = new PilaDinamica();

		System.out.println("vuota (true):  " + pila.vuota());
		System.out.println("piena (false): " + pila.piena());

		int[] toPush = { 12, 7, -9};
		for (int i=0; i<toPush.length; i++) 
			pila.push(toPush[i]);

		System.out.println("size (3):     " + pila.size());

		int[] dati = pila.toArray();
		System.out.print("(-9, 7, 12):  ");
		for (int i=0; i<dati.length; i++)
			System.out.print(dati[i] + " ");
		System.out.println();

		for (int i=0; i<dati.length; i++)
			System.out.println("pop ("+dati[i]+"):     " + pila.pop());

		System.out.println("size (0):     " + pila.size());
	}
}