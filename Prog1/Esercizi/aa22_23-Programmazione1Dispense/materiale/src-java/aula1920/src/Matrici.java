public class Matrici {

    /**
     * Costruisce un'istanza di matrice con {@code numRighe} righe e
     * {@code numColonne} colonne.
     *
     * @param numRighe
     *            numero di righe
     * @param numColonne
     *            numero di colonne
     * @return nuova matrice.
     */
    public static int[][] crea(int numRighe, int numColonne) {

        return new int[numRighe][numColonne];
    }

    /**
     * Legge da tastiera i valori da memorizzare nella matrice.
     */
    public static void initStdIn(int[][] m) {

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Elemento " + i + "," + j + ":");
                m[i][j] = SIn.readInt();
            }
    }

    /**
     * Aggiorna l'elemento di riga {@code i} e colonna {@code j} col valore
     * {@code e}.
     *
     * @param m
     *            matrice in cui aggiornare l'elemento
     * @param r
     *            indice della riga cui appartiene l'elemento da modificare
     * @param c
     *            indice della colonna cui appartiene l'elemento da modificare
     * @param e
     *            nuovo valore.
     * @return {@code true} se l'aggiornamento ha avuto successo. {@code false}
     *         altrimenti.
     */
    public static boolean setElemento(int[][] m, int r, int c, int e) {

        boolean modificaLecita = 
                m != null && 
                0 <= r && r < m.length &&
                m[r] != null &&
                0 <= c && c < m[r].length;

        if (modificaLecita)
            m[r][c] = e;

        return modificaLecita;
    }

    /**
     * Ricopre i valori di {@code m} con quelli di {@code p}
     *
     * @param m
     *            matrice con contenuti da aggiornare
     * @param p
     *            matrice con i nuovi contenuti
     * @return {@code true} se l'aggiornamento ha avuto successo. {@code false}
     *         altrimenti.
     */
    public static boolean resetMatrice(int[][] m, int[][] p) {

        boolean modificaLecita = m != null && p != null;

        /*
         * ogni riga di p deve avere abbastanza valori da scrivere in m.
         */
        if (p.length >= m.length) {
            int r = 0;
            while (r < m.length && modificaLecita) {
                modificaLecita = (m[r] == null && p[r] != null)
                        || ((m[r] != null) && p[r].length >= m[r].length);
                r++;
            }
        }

        /*
         * se esistono abbastanza elementi in tutte le righe di p, allora li si
         * usa.
         */
        if (modificaLecita)
            for (int r = 0; r < m.length; r++)
                if (m[r] != null)
                    for (int c = 0; c < m[r].length; c++) {
                        setElemento(m, r, c, p[r][c]);
                    }
                else
                    m[r] = p[r];

        return modificaLecita;
    }

    /**
     * Aggiorna i contenuti della {@code r}-esima riga di {@code a} con quelli
     * dell'array {@code r}. La lunghezza di {@code r} puo' superare il numero
     * di colonne disponibili nella riga prescelta di {@code a}.
     *
     * @param m
     *            matrice in cui aggiornare la riga
     * @param r
     *            indice della riga da modificare
     * @param p
     *            riga con nuovi contenuti
     * @return {@code true} se l'aggiornamento ha avuto successo. {@code false}
     *         altrimenti.
     */
    public static boolean setRiga(int[][] m, int r, int[] p) {

        boolean modificaLecita = m != null && 0 <= r && r < m.length 
                && ((m[r] == null && p != null) || (m[r] != null && p.length >= m[r].length));

        if (modificaLecita)
            if (m[r] != null)
                for (int c = 0; c < m[r].length; c++)
                    setElemento(m, r, c, p[c]);
            else
                m[r] = p;

        return modificaLecita;
    }

    /**
     * Aggiorna i contenuti della {@code c}-esima colonna di {@code a} con
     * quelli dell'array {@code c}. La lunghezza di {@code c} puo' superare il
     * numero di righe disponibili nella colonna prescelta di {@code a}.
     *
     * @param m
     *            matrice in cui aggiornare la colonna
     * @param c
     *            indice della colonna da modificare
     * @param p
     *            colonna con i nuovi contenuti
     * @return {@code true} se l'aggiornamento ha avuto successo. {@code false}
     *         altrimenti.
     */
    public static boolean setColonna(int[][] m, int c, int[] p) {

        boolean modificaLecita = 
                m != null &&
                m.length <= p.length;
        
        for (int r = 0; modificaLecita && r < m.length; r++)
            modificaLecita = m[r] != null && m[r].length > 0;

        if (modificaLecita)
            for (int r = 0; r < m.length; r++)
                setElemento(m, r, c, p[r]);

        return modificaLecita;
    }

    /**
     * Riversa l'intero contenuto della matrice in una stringa.
     *
     * @return serializzazione.
     */
    public static String toString(int[][] m) {

        String m2String = "";
        if (m != null) {
            for (int i = 0; i < m.length; i++) {
                m2String = m2String + "{";
                if (m[i] != null) {
                    for (int j = 0; j < m[i].length; j++) {
                        if (j == m[i].length - 1)
                            m2String = m2String + m[i][j];
                        else
                            m2String = m2String + m[i][j] + ",";
                    }
               }
               m2String = m2String + "}";
               if (i < m.length - 1)
                  m2String = m2String + ",";
            }
        }
        return m2String;
    }

    public static void main(String[] args) {

        int[][] m;
        m = new int[4][];

        int[] r0 = { 0, 1, 2 };
        int[] r3 = { 6, 7, 8 };

        m[0] = r0;
        m[1] = new int[0];
        m[2] = null;
        m[3] = r3;

        System.out.println(toString(m).equals("{0,1,2},{},{},{6,7,8}"));
        System.out.println(setElemento(m, 2, 1, 1) == false);
        System.out.println(setElemento(m, 3, 1, 1));
        System.out.println(toString(m).equals("{0,1,2},{},{},{6,1,8}"));
        
        int[][] p = {{0, 0, 0, 0},
                     {0, 0},
                     {0, 0},
                     {0, 0, 0},
                     {0}};
        System.out.println(resetMatrice(m, p));        
        System.out.println(toString(m).equals("{0,0,0},{},{0,0},{0,0,0}"));

        int[] q = {10, 20, 30, 40, 50, 60};
        System.out.println(setRiga(m, 2, q));
        System.out.println(toString(m).equals("{0,0,0},{},{10,20},{0,0,0}"));

        System.out.println(setColonna(p, 0, q));
        System.out.println(toString(p).equals("{10,0,0,0},{20,0},{30,20},{40,0,0},{50}"));
    }
}
