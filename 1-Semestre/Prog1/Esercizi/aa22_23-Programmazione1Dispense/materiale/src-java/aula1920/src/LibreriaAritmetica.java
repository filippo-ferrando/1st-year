/**
 * Libreria con operazioni aritmetiche definite tramite iterazioni di operazioni
 * piu' primitive.
 */
public class LibreriaAritmetica {
    public static int piu(int x, int y) {
        int r = x;
        int n = y;
        while (n > 0) {
            r = r + 1; // accumula il risultato in r
            n = n - 1;
        }
        return r;
    }

    public static int meno(int m // minuendo
            , int s // sottraendo
    ) {
        int n = 0;
        int r = 0; // differenza tra m ed s

        if (m > s) {
            r = m;
            n = s;
            while (0 < n && n < m) {
                r = r - 1;
                n = n - 1;
            }
        }
        return r;
    }

    public static int per(int x, int y) {
        int r = 0;
        int n = y;
        while (n > 0) {

            r = piu(r, x);
            n = n - 1;
        }
        return r;
    }

    public static int div(int d // dividendo
            , int s // diviSore >= 0
    ) {
        int q = 0; // quoziente
        int r = d; // resto

        while (r >= s) {
            q = q + 1; // accumula il quoziente
            r = meno(r, s); // accumula il resto
        }
        return q;
    }

    public static int resto(int d // dividendo
            , int s // diviSore >= 0
    ) {
        int q = 0; // quoziente
        int r = d; // resto

        while (r >= s) {
            q = q + 1; // accumula il quoziente
            r = meno(r, s); // accumula il resto
        }
        return r;
    }

    public static int pot(int b // base
            , int e // esponente
    ) {
        int r = 1; // potenza

        while (e > 0) {
            r = per(r, b); //
            e--;
        }
        return r;
    }
}