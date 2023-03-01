public class main {
	public static void riordino(int[] a, int[] j, int ij, int i){
		if(i != a.length){
			if(i % 2 != 0){
				//posizione dispari
				if(a[i] % 2 == 0){
					//valore pari
					j[ij] = a[i];
					riordino(a, j, ij+1, i+1);
				}else{
					//valore dispari
					riordino(a,j,ij,i+1);
				}	
			}else{
				//posizione pari
				riordino(a,j,ij,i+1);
			}
		}else{
			System.out.println(j);
		}
		
	}
	
	public static void main(String[] args){
		int[] a = {1,5,3,7,9,4,2,6,8};
		int[] j = {};
		riordino(a, j, 0, 0);
	}
			
}