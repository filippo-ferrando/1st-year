import java.util.Arrays;

/**
 * Batteria di esercizi ricorsivi su array, anche con generazione di un
 * nuovo array ad ogni necessita' di estensione.
 */
public class BatteriaEserciziRecLaboratorio {

    public static int[] filtroMaggioriDi(int[] a, int limiteInferiore) {
        int[] r = null;
        if (a!=null)
           r = filtroMaggioriDi(a, limiteInferiore, a.length);
        return  r;
    }

    private static int[] filtroMaggioriDi(int[] a, int inf, int numeroEl) {
        if (numeroEl == 0) {
            return new int[0];
        } else { // caso induttivo
            int[] tmp = filtroMaggioriDi(a, inf, numeroEl-1);
            /* filtroMaggioriDi(a, inf, numeroEl - 1) restituisce
             * tmp[0]...tmp[tmp.length-1] tale che ogni elemento di tmp
             * e' la copia di uno ed un solo elemento di a[0]..a[numeroEl-2]
             * che e' strettamente superiore a inf. */

            if (a[numeroEl-1]>inf) { // a[numeroE[l-1] supera la soglia
                int[] r = new int[tmp.length + 1]; // r conterra' tmp piu' a[numeroE[l-1]
                for (int i = 0; i < tmp.length; i++) // copia tmp in r
                    r[i] = tmp[i];
                r[r.length - 1] = a[numeroEl - 1]; // nuovo elemento
                return r;
            } else // non e' necessario estendere tmp
                return tmp;
        }
    }

    public static int[] filtroDispari(int[] a) {
        int[] r = null;
        if (a!=null)
           r = filtroDIspari(a, a.length); // II argomento indica numero
                                           // elementi in a
        return  r;
    }

    public static int[] filtroDIspari(int[] a, int numeroEl) {
        if (numeroEl == 0) { // caso base
                return new int[0];
        } else { // caso induttivo
            int[] tmp = filtroDIspari(a, numeroEl-1);
            /* filtroDIspari(a, l - 1) restituisce tmp[0]..tmp[tmp.length-1] 
             * ciacuno copia di uno ed un solo elemento di valore dispari
             * compreso nell'intervallo a[0]..a[numeroEl-2].               */

            if (a[numeroEl-1]%2==1) { // se a[numeroEl-1] dispari devo aggiungerlo
                int[] r = Arrays.copyOf(tmp, tmp.length + 1); // uso libreria
                r[r.length - 1] = a[numeroEl - 1];
                tmp = r;
            }
            return tmp;
        } 
    }

    public static boolean[] trasduttore(int[] a, int limiteSuperiore) {
        boolean[] r = null;
        if (a!=null) {
            r = new boolean[a.length];
            r = trasduttore(a, limiteSuperiore, a.length, r);
        }
        return r;        
    }

    private static boolean[] trasduttore(int[] a, int sup, int numEl, boolean[] r) {
        if (numEl == 0) {
            return r;
        } else {
            trasduttore(a, sup, numEl - 1, r);
            /* per ogni k, 
             * se 0 <= k < numEl - 2,
             * allora ((r[k] == true sse a[k] < sup) 
             *        e (r[k] == false sse a[k] >= sup)) */
            r[numEl - 1] = (a[numEl - 1] < sup);
            return r;
        }
    }

    public static int unIndice(int[] a, int e, int p, boolean d) {
        return unIndice(a, e, p, d, (d) ? a.length - 1 : 0);
    }

    private static int unIndice(int[] a, int e, int p, boolean d, int i) {
        if ((i < p && d) || (i > p && !d))
            return -1;
        else {
            if (e == a[i])
                return i;
            else
                return unIndice(a, e, p, d, (d) ? i - 1 : i + 1);
        }
    }

    /**
     * @param a array in cui trovare la sottosequenza
     * @param b array non vuoto con la sequenza da trovare
     * @return -1 se b non e' sottosequenza di a, oppure l'indice alla prima
     *         occorrenza di b[0] in a.
     */
    public static int indiceSubSeqR(int[] a, int[] b) {
        int r = -1;
        /* se a o b non esistono o b piu' lunga di a, diciamo che b
         * non e' sottostringa di a */
        if (a!= null && b!= null && b.length!=0 & b.length<=a.length) {
            r = f(a, b, 0);
        }
        return r;
    }

    private static int f(int[] a, int[] b, int i) {
        if(b.length > a.length-i) { // b piu' lunga di quanto non rimane in a
            return -1;
        } else { // ci sono abbastanza elementi in a
            if(sottosequenza(a,b,0,i)) { // b sottosequenza di a
                return i;
            } else {
                return f(a,b,i+1); // provo a cercare b una posizione piu' a destra
            }
        }
    }

    // metodo naturlamente covariante su b
    private static boolean sottosequenza(int[] a, int[] b, int i, int base) {
        if (i==b.length) {
            return true;
        } else {
            return a[base+i]==b[i]
                   && sottosequenza(a,b,i+1,base);
        }
    }

    // Metodi di appoggio -------------
    public static String toStrInt(int[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++)
            s = s + a[i] + " ";
        return s;
    }

    public static String toStrBool(boolean[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++)
            s = s + a[i] + " ";
        return s;
    }

    public static void main(String[] args) {
        int[] a = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};
        int[] b = { 1, 2, 3, 4, 2, 4, 2, 3, 9 };
        System.out.println(toStrInt(filtroMaggioriDi(a, 3)));
        System.out.println(toStrInt(filtroDispari(a)));
        System.out.println(toStrBool(trasduttore(a, -4))); 

        int[] c = { 4, 2 };
        System.out.println(indiceSubSeqR(b, c)==3); 
        int[] d = { 3, 9, 1 };
        System.out.println(indiceSubSeqR(b, d)==-1); 
        int[] e = { 3, 9 };
        System.out.println(indiceSubSeqR(b, e)==7); 
        int[] f = { 1, 2, 3, 4, 2, 6, 2, 3, 9 ,10 };
        System.out.println(indiceSubSeqR(b, f)==-1); 
    }
}
