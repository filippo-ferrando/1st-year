
public class Ackermann {
	
	public static long A (int m, long n) {
		if (m == 0)
			return n + 1;
		else if (m > 0 && n == 0) 
			return A (m - 1, 1);
		else
			return A (m - 1, A(m, n - 1));
	}

	public static void main(String[] args) {
		final int LIMITE = 2;  // incrmentare di uno alla volta
		for (int m = 0; m < LIMITE; m++)
			for (int n = 0; n < LIMITE; n++)
				System.out.println("A(" + m +", " + n + ") = " + A(m, n));		
	}
}
