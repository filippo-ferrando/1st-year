import java.util.*;
import java.lang.Math;


public class SenoAlgos {
	public static int piu(int x,int y) {
		int s = x;
		int i = y;
		while(i > 0) {
			s = s + 1;
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
	
	public static float quoziente(float d, float D) {
		if(D < d) {
			return D;
		}else{
			return (quoziente(D-d,d) + 1);
		}
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
	
	public static boolean dispari(int x) {
  		boolean r = false;
  		int i = 0;
  		while (i < x) {
    		r = !r;
    		i = i + 1;
  		}
  		return r;
	}
	
	public static int numeratore(int z, int k) {
  		int e = per(2,k)+1;
  		int n = esp(z,e);
  		if (dispari(k)) {
    		n = -n;
  		}
  		return n;
	}
	
	public static int fatt(int x) {
  		if (x == 0) {
    		return 1;
  		} else {
    		int valoreInduttivo = fatt(x - 1);
    		int r = per(x, valoreInduttivo);
    	return r;
  		}
	}
	
	public static int denominatore(int k) {
  		int d = fatt(per(2,k)+1);
  		return d;
	}
	
	public static float sin(int z, int n) {
  		float s = 0;
  		int	k = 0;
		float num = 0;
		float den = 0;
  		while (k < n) {
    		num = numeratore(z, k);
    		den = denominatore(k);
    		s = s + (num/den);
    		k = k + 1;
  		}
  		return s;
	}
	
	public static void main(String[] args){
		float x;
		x = sin(1,5);
		System.out.println(x);
		
	}


	


}











