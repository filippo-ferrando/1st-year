/** Le definizioni che seguono sono tra quelle possibili,
ma è possibile riformularle, in modo da non rendere necessario
l'uso del metodo divSup che fornisce l'approssimazione superiore
della divisione intera n/2, ne caso n non sia pari.
 */
public class DicotomicaAritmetica {

	private static int divSup(int n) {
		return (n % 2 == 0) ? n / 2 : n / 2 + 1;
	}
	
	public static int somma(int x, int y) {
		if (x == 0)
			return y;
		else if (x == 1 && y == 0)
			return 1;
		else if (x == 1 && y == 1)
			return somma(1,0) + somma(0,1);
		else
			return somma(divSup(x), divSup(y)) + somma(x / 2, y / 2);
	}

	public static int differenza(int x, int y) {
		if (x == 0)
			return 0;
		else if (x == 1 && y == 0)
			return 1;
		else if (x == 1 && y == 1)
			return 0;
		else {
			return differenza(divSup(x), divSup(y)) + differenza(x / 2, y / 2);
		}
	}

	public static int moltiplicazione(int x, int y) {
		if (y == 0)
			return 0;
		else if (y == 1)
			return x;
		else
			return moltiplicazione(x, divSup(y)) + moltiplicazione(x, y / 2);
	}


	public static void main(String[] args) {
		
		System.out.println("\nSomma test:");
		System.out.println(somma(0, 0) == 0);
		System.out.println(somma(1, 0) == 1);
		System.out.println(somma(0, 1) == 1);
		System.out.println(somma(1, 1) == 2);
		System.out.println(somma(2, 1) == somma(1, 2));        
		System.out.println(somma(2, 2) == 4);        
		System.out.println(somma(3, 1) == 4);        
		System.out.println(somma(3, 2) == 5);        

		System.out.println("\nDifferenza test:");
		System.out.println(differenza(0, 0) == 0);
		System.out.println(differenza(1, 0) == 1);
		System.out.println(differenza(0, 1) == 0);
		System.out.println(differenza(1, 1) == 0);
		System.out.println(differenza(2, 1) == 1);        
		System.out.println(differenza(2, 2) == 0);        
		System.out.println(differenza(3, 1) == 2);        
		System.out.println(differenza(3, 2) == 1);        

		System.out.println("\nSomma/Differenza test:");
		System.out.println(somma(differenza(2, 1),1) == 2);
		
		System.out.println("\nMoltiplicazione test:");
		System.out.println(moltiplicazione(0, 0) == 0);
		System.out.println(moltiplicazione(1, 0) == 0);
		System.out.println(moltiplicazione(0, 1) == 0);
		System.out.println(moltiplicazione(1, 1) == 1);
		System.out.println(moltiplicazione(2, 1) == 2);        
		System.out.println(moltiplicazione(2, 2) == 4);        
		System.out.println(moltiplicazione(3, 1) == 3);        
		System.out.println(moltiplicazione(3, 2) == 6);        
	}
}
