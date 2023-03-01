// algoritmo ricorsivo per trovare tutti i divisori di n
import java.util.*;

public class main {
	
	static int sum = 0;
	
	static int div(int n, int i){
		if (i <= n){
			if (n % i == 0){
				sum = sum + i;
			}
			div(n, i+1);
		}
		return sum;
	}
	
	public static void main(String[] args){
		
		
		int num = 16;
		int somma = 0;
		
		somma = div(num, 1);
		System.out.println(somma);
	}
}