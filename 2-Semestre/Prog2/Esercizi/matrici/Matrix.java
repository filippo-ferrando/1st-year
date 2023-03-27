import java.lang.Math;

public class Matrix {
    
    private int m; // numero di righe
    private int n; //numero di colonne
    private int[][] mat;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        mat = new int[m][n];
    }

    public int rows() {
        return m;
    }

    public int column() {
        return n;
    }

    public void printMat() {
        for(int i = 0; i < this.m; i++){
            for(int j = 0; j < this.n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void setVal(int val, int a, int b){
        mat[a][b] = val;
    }

    public int getVal(int a, int b){
        return mat[a][b];
    }

    public void add(Matrix mat2){
        if(this.m == mat2.rows() && this.n == mat2.column()){
            for(int i = 0; i < this.m; i++){
                for(int j = 0; j < this.n; j++){
                    this.mat[i][j] += mat2.getVal(i, j);
                }
            }
        }
    }

    public void mul(Matrix mat2){
        if(this.n == mat2.column()){
            int[][] mat3 = new int[this.m][mat2.column()];
            for(int i = 0; i < this.m; i++){
                for(int j = 0; j < mat2.column(); j++){
                    mat3[i][j] += this.mat[i][j] * mat2.getVal(i, j);
                }
            }
            this.mat = mat3;
            this.n = mat2.column();
        }
    }

    public void pow(Matrix mat2){
        if(this.n == mat2.column()){
            int[][] mat3 = new int[this.m][mat2.column()];
            for(int i = 0; i < this.m; i++){
                for(int j = 0; j < mat2.column(); j++){
                    mat3[i][j] = (int) Math.pow(this.mat[i][j], mat2.getVal(i, j));
                }
            }
            this.mat = mat3;
            this.n = mat2.column();
        }
    }

    public void mistero(){
        System.out.println(mat[0][0]);
    }

    
}