import java.util.*;

public class main {
	public static void riordino(int[] a, ArrayList<Integer> j, int i){
		if(i != a.length){
			if(i % 2 != 0){
				//posizione dispari
				if(a[i] % 2 == 0){
					//valore pari
					j.add(a[i]);
					riordino(a, j, i+1);
				}else{
					//valore dispari
					riordino(a,j,i+1);
				}	
			}else{
				//posizione pari
				riordino(a,j,i+1);
			}
		}else{
			System.out.println(j);
		}
		
	}
	
	public static void main(String[] args){
		int[] a = {1,5,3,7,9,4,2,6,8};
		ArrayList<Integer> j = new ArrayList<>();
		riordino(a, j, 0);
	}
			
}