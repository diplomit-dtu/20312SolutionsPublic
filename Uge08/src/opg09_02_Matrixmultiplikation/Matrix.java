package opg09_02_Matrixmultiplikation;

public class Matrix{
    public static void main(String[] args){
        int [][] a={{1,2}, // 0. row
                {3,1}}; // 1. row
        int [][] b={{1,1,1}, // 0. row
                {1,1,1}}; // 1. row
        int[][] c;
        printmatrix(a);
        printmatrix(b);
        if (a[0].length==b.length){
            // column length in "a" is same as
            // row length in "b"
            c= multi(a,b);
            printmatrix(c);
        } else{
            System.out.print("matrixmultiplikation kan ikke udføres");
        }
    }
    private static void printmatrix(int[][] a) {
        String str = "";
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                str += a[i][j] + " ";
            }
            str += "\n";
        }
        System.out.println(str);
    }
    private static int[][] multi(int[][] a, int[][] b) {
        /*
         * Copy-paste: No guarantee of correctness...!
         */
        int l = a.length;
        int m = a[0].length;
        int n = b[0].length;
        int[][] res = new int[l][n];
        for (int i=0; i < l; i++){
            for (int j = 0; j < n; j++){
                for (int k=0; k < m; k++){
                    res[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return res;
    }
}