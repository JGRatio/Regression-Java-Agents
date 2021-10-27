/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio J. Castillo
 */
class LinearRegression {
private double [] x;
private double [] y;
private double summX, summY, summXY, summX2, B0, B1;
private int n;
    
public LinearRegression(double [] x , double [] y ){
    this.x = x;
    this.y = y;
    calculate();
   
}

    public void setX(double[] x) {
        this.x = x;
        calculate();
    }

    public void setY(double[] y) {
        this.y = y;
        calculate();
    }

    public double getB0() {
        return B0;
    }


    public double getB1() {
        return B1;
    }

    private void calculate(){
    n = x.length;
        for(int i = 0; i < x.length ; i++ ){
        summX += x[i];
        summY += y[i];
        summXY += x[i] * y[i];
        summX2 += x[i] * x[i];
        }
        double[][] systemEquations ={
                { n, summX,summY },
                { summX, summX2, summXY},
        };
        Helper helper = new Helper(systemEquations);
        B0 = helper.getDeterminant1()/helper.getSystemDeterminant();
        B1 = helper.getDeterminant2()/helper.getSystemDeterminant();
   }



}
