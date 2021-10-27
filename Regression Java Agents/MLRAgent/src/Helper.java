import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

class Helper {

 public void printMatrix(double[][] M, double rowSize, double colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }

 public double[][] multiplyMatrix(double A[][], double B[][]) {
        int row1 = A.length,col1 = A[0].length,row2 = B.length,col2 = B[0].length,i, j, k;
        if (row2 == col1) {
        double C[][] = new double[row1][col2];
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
        return C;
        }
        else throw new IndexOutOfBoundsException("("+row2+", "+col1+") is not a valid pair of indexes.");
    }
 public double[][] transpose(double A[][]) {
     double B[][] = new double[A[0].length][A.length];
        int i, j;
        for (i = 0; i < A[0].length; i++)
            for (j = 0; j < A.length; j++)
                B[i][j] = A[j][i];
            return B;
    }
    public double[][] inverse(double [][] m){
        RealMatrix M = MatrixUtils.createRealMatrix(m);
        M = MatrixUtils.inverse(M);
        return M.getData();
    }
}



