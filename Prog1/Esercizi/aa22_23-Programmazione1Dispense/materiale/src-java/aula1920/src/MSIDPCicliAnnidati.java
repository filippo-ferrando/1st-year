/**
 * Moltiplicazione di due naturali, ammettendo solo incrementi di una unita'. La
 * soluzione in termini configurazioni e regole e': (m,M,n,N,r) ---> (m,M,n+1,N
 * ,r+1) se n < m (m,M,m,N,r) ---> (m,M,0 ,N+1,r ) se N < M
 */
public class MSIDPCicliAnnidati {

    public static void main(String[] args) {
        int m = 10;
        int M = 100;
        int n = 0;
        int N = 0;
        int r = 0;
        /*
         * m*M==r+(m-n)+m*(M-(N+1)) && r == m*N+n vero perche'
         * m*M==m*N+n+m-n+m*M-m*N-m==m*N-m*N+n-n+m-m+m*M==0+0+0+m*M==m*M
         */
        while (N < M && n == 0) {
            // m*M==r+(m-n)+m*(M-(N+1)) && r == m*N+n
            while (n < m) {
                /*
                 * m*M==r+(m-n)+m*(M-(N+1)) && r == m*N+n implica
                 * m*M==(r+1-1)+(m-n)+m*(M-(N+1)) && r+1 == m*N+n+1 equivalente
                 * a m*M==(r+1)+(m-(n+1))+m*(M-(N+1)) && r+1 == m*N+(n+1)
                 */
                n = n + 1;
                // m*M==(r+1)+(m-n)+m*(M-(N+1)) && r+1 == m*N+n
                r = r + 1;
                // m*M==r+(m-n)+m*(M-(N+1)) && r == m*N+n
            }
            /*
             * m*M==r+(m-n)+m*(M-(N+1)) && r == m*N+n && n == m implica
             * m*M==r+(m-m)+m*(M-(N+1)) && r == m*N+m equivalente a
             * m*M==r+m*(M-(N+1)) && r == m*(N+1)
             */
            N = N + 1;
            // m*M==r+m*(M-N) && r == m*N
            n = 0;
            /*
             * m*M==r+m*(M-N) && r == m*N implica m*M==r+m*(M-(N+1-1))-n && r ==
             * m*N+n equivalente a m*M==r+m*(M-N-1+1)-n && r == m*N+n
             * equivalente a m*M==r+m*(M-(N+1))+m*1-n && r == m*N+n equivalente
             * a m*M==r+(m-n)+m*(M-(N+1)) && r == m*N+n
             */
        }
        System.out.println(r);
    }
}