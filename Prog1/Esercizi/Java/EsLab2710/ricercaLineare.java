public class ricercaLineare {
	public static boolean ricerca(int[] x, int e, int i){
		if(i == x.length){
			return false;
		}else{
			boolean v = ricerca(x, e, i+1);
			if(v){
				return v;
			}else{
				return x[i]==e;
			}
		}
	}
	
	public static boolean controllo(int[] x, int e){
		boolean esiste = x != null;
		if (esiste){
			return ricerca(x, e, 0);
		}else{
			return false;
		}
	}
	
	public static void main(String[] args){
		int[] x = {1,2,3,4,5,6,7,8,9};
		int e = 1;
		controllo(x, e);
		
	}
}