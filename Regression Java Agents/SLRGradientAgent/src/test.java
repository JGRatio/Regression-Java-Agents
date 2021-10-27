/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio J. Castillo
 */

public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SimpleDataSet data = new SimpleDataSet();
        GradientLinearRegression GSLR = new GradientLinearRegression(data.getX(), data.getY());
        System.out.println(GSLR.getB0());
        System.out.println(GSLR.getB1());
    }
    
}
