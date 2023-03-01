public class AritCov {
	public static float piu(float x, float y) {
		if(y > 0){
			return piu(x+1, y-1);
		}else{
			return x;
		}
	}
	
	public static float meno(float x, float y) {
		if(y>0){
			return meno(x-1, y-1);
		}else{
			return x;
		}
	}
	
	public static float per(float x, float y) {
		if(y==1){
			return x;
		}else{
			return x+per(x,meno(y,1));
		}
	}
	
	public static float esp(float x, float y) {
		if(y==1){
			return x;
		}else{
			return x*esp(x,meno(y,1));
		}
	}
	
	
	public static float quoziente(float d, float D) {
		if(D < d) {
			return D;
		}else{
			return (quoziente(D-d,d) + 1);
		}
	}
	
	public static void main(String[] args){
		float x;
		System.out.println(esp(2,3));
	}
}