public class AritIter {
	public static int piu(int x,int y) {
		int s = x;
		int i = y;
		while(i > 0) {
			s = s + 1;
			i = i - 1;
		}
		return s;
	}
	
	public static float sott(float x,float y) {
		float s = x;
		float i = y;
		while(i > 0) {
			s = s - 1;
			i = i - 1;
		}
		return s;
	}
	
	public static int per(int x, int y) {
		int m = 0;
		int i = y;
		while(i > 0) {
			m = piu(m,x);
			i = i - 1;
		}
		return m;
	}
	
	public static float divisione(float x, float y) {
		float m = 0;
		while(x >= y) {
			x = sott(x,y);
			m = m + 1;
		}
		return m;
	}
	
	
	
	public static int esp(int x, int y) {
  		int e = 1;
  		int i = y;
  		while(i > 0) {
    		e = per(e, x);
    		i = i - 1;
  		}
  		return e;
	}
	
	public static void main(String[] args) {
		float x = 0;
		x = divisione(7,2);
		System.out.println(x);
		
	}
}