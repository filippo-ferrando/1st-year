/**
 ******* Dall'Esempio 11, Sezione 6.7.1 delle dispense *******
 *
 * Classe con soli metodi statici il cui scopo e' illustrare come si impostano
 * soluzioni algoritmiche ai seguenti problemi decisionali su una matrice
 * m di tipo int[]:
 * -) esiste un indice r di riga per cui esiste un indice c di colonna
 * tale che m[r][c] gode di una certa proprieta' P(m[r][c])?;
 * -) esiste un indice r di riga tale che, per ogni indice di colonna
 * c, l'elemento m[r][c] gode di una certa proprieta' P(m[r][c])?;
 * -) per ogni indice di riga r, esiste un indice c di colonna tale che
 * m[r][c] gode di una certa proprieta' P(m[r][c])?;
 * -) per ogni indice di riga r e per ogni indice di colonna c,
 * l'elemento m[r][c] gode di una certa proprieta' P(m[r][c])?
 * Per convenzione, assumiamo che P(m[r][c]) restituisca vero se valore
 * di m[r][c] e' pari.
 */
public class ProblemiDecisionaliSuMatrici {
    /**
     * Implementa il predicato: "Il valore di {@code v} e' pari.".
     */
    private static boolean pari(int v) {
        return (v % 2 == 0);
    }

    /**
     * Verifica se esiste un indice r di riga per cui esiste un indice
     * c di colonna tale che m[r][c] e' pari.
     */
    public static boolean EsEs(int[][] m) {
        /* INVARIANTE. Supponiamo che R sia m.length.
         * In generale e' vero che:
         *   perogni r, c. se 0<=r<=R e 0<=c<=m[r].length
         *   allora perogni i,j. se 0<=i<r e 0<=j<c
         *     allora !(esiste un pari in m[i][0],m[i][1]...m[i][m[i].length-1])
         *            && ...&&
         *            !(esiste un pari in m[r][0],m[r][1]...m[r][j])
         * 
         * L'elemento ancora da esaminare per sapere se e' pari e' m[r][c].
         * 
         * Se e' pari, allora esiste un pari in
         * m[r][0],m[r][1]...m[r][c-1],m[r][m[r].length] ed e' possibile
         * interrompere la ricerca. Se e' dispari, allora occorre continuare
         * la ricerca sino al termine della riga r-esima.
         */
        boolean esisteR = false;
        int r = 0;
        while (!esisteR && r < m.length) {
            boolean esisteC = false;
            int c = 0;
            while (!esisteC && c < m[r].length) {
                esisteC = pari(m[r][c]);
                c++;
            }
            esisteR = esisteC;
            r++;
        }
        return esisteR;
    }

    /**
     * Verifica se esiste un indice r di riga tale che, per ogni indice
     * di colonna c, l'elemento m[r][c] e' pari.
     */
    public static boolean EsPer(int[][] m) {
        /* INVARIANTE. Supponiamo che R sia m.length.
         * 
         * In generale e' vero che:
         *  perogni r, c. se 0<=r<=R e 0<=c<=m[r].length
         *   allora perogni i,j. se 0<=i<r e 0<=j<m[i].length
         *    allora esiste un dispari in m[i][0],m[i][1]...m[i][m[i].length-1]
         *           && ... &&
         *           !(esiste un dispari in m[r][0],m[r][1]...m[r][j])
         * 
         * L'elemento ancora da esaminare per sapere se sia pari e' m[r][c].
         * 
         * Se m[r][c] e' pari, allora !(esiste un dispari in
         * m[r][0],m[r][1]...m[r][c] ed e' possibile continuare la ricerca). Se
         * e' dispari, allora occorre continuare la ricerca dalla riga
         * successiva.
         */
        int r = 0;
        boolean esisteR = false;
        while (!esisteR && r < m.length) {
            boolean ogniC = true;
            int c = 0;
            while (ogniC && c < m[r].length) {
                ogniC = pari(m[r][c]);
                c++;
            }
            esisteR = ogniC;
            r++;
        }
        return esisteR;
    }

    /**
     * Verifica se, per ogni indice di riga r, esiste un indice
     * c di colonna tale che m[r][c] e' pari.
     */
    public static boolean PerEs(int[][] m) {
        /* INVARIANTE. Supponiamo che R sia m.length.
         * In generale e' vero che:
         * perogni r, c. se 0<=r<=R e 0<=c<=m[r].length
         * allora perogni i,j. se 0<=i<r e 0<=j<c
         *   allora esiste un pari in m[i][0],m[i][1]...m[i][m[i].length-1]
         *          && ... &&
         *          !(esiste un pari in m[r][0],m[r][1]...m[r][j])
         * L'elemento ancora da esaminare per sapere se sia pari e' m[r][c].
         * Se m[r][c] e' pari, allora esiste un pari in
         * m[r][0],m[r][1]...m[r][c] ed e' possibile continuare la ricerca dalla
         * riga successiva. Se e' dispari, allora occorre continuare la ricerca
         * sulla stessa riga.
         */
        boolean ogniR = true;
        int r = 0;
        while (ogniR && r < m.length) {
            boolean esisteC = false;
            int c = 0;
            while (!esisteC && c < m[r].length) {
                esisteC = pari(m[r][c]);
                c++;
            }
            ogniR = esisteC;
            r++;
        }
        return ogniR;
    }

    /**
     * Verifica se, per ogni indice di riga r e per ogni indice di
     * colonna c, l'elemento m[r][c] e' pari.
     */
    public static boolean PerPer(int[][] m) {
        /*
         * INVARIANTE. Supponiamo che R sia m.length.
         * 
         * In generale e' vero che:
         * perogni r, c. se 0<=r<=R e 0<=c<=m[r].length
         *   allora perogni i,j. se 0<=i<r e 0<=j<c
         *     allora !(esiste un pari in m[i][0],m[i][1]...m[i][m[i].length-1])
         *            && ... &&
         *            !(esiste un pari in m[r][0],m[r][1]...m[r][j])
         * 
         * L'elemento ancora da esaminare per sapere se sia pari e' m[r][c].
         * 
         * Se m[r][c] e' pari, allora e' possibile continuare la ricerca dalla
         * riga attuale. Se e' dispari, allora esiste un dispari in
         * m[r][0],m[r][1]...m[r][c] ed e' possibile interrompere la ricerca.
         */

        boolean ogniR = true;
        int r = 0;
        while (ogniR && r < m.length) {
            boolean ogniC = true;
            int c = 0;
            while (ogniC && c < m[r].length) {
                ogniC = pari(m[r][c]);
                c++;
            }
            ogniR = ogniC;
            r++;
        }
        return ogniR;
    }
}
