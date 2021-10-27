import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

class NormalEcuationMLR {
    private double B0,B1,B2;
    private double[][] VectorDataX;
    private double[][] VectorDataY;

    public NormalEcuationMLR(double [][] x , double [][] y) {
        this.VectorDataX = x;
        this.VectorDataY = y;
        calculate();
    }

    public void setVectorDataX(double[][] vectorDataX) {
        VectorDataX = vectorDataX;
        calculate();
    }

    public void setVectorDataY(double[][] vectorDataY) {
        VectorDataY = vectorDataY;
        calculate();
    }

    public double getB0() {
        return B0;
    }

    public double getB1() {
        return B1;
    }

    public double getB2() {
        return B2;
    }

    private void calculate(){
        Helper h = new Helper();



        double [][] R =
                 h.multiplyMatrix
                (h.inverse(h.multiplyMatrix
                (h.transpose(VectorDataX),VectorDataX)),h.multiplyMatrix
                (h.transpose(VectorDataX),VectorDataY));
                B0 = R[0][0];
                B1 = R[1][0];
                B2 = R[2][0];
    }
}




/* RealMatrix X = MatrixUtils.createRealMatrix(VectorDataX);
                RealMatrix Y = MatrixUtils.createRealMatrix(VectorDataY);
                RealMatrix XT = X.transpose();
                RealMatrix R = MatrixUtils.inverse(XT.multiply(X)).multiply(XT.multiply(Y));
                B0 = R.getEntry(0,0);
                B1 = R.getEntry(1,0);
                B2 = R.getEntry(2,0);*/