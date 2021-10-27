public class Helper {
private double SD,D1,D2;

    public Helper(double [][] systemEquations) {
    findSolution(systemEquations);
    }

    public double getSystemDeterminant() {
        return SD;
    }

    public double getDeterminant1() {
        return D1;
    }

    public double getDeterminant2() {
        return D2;
    }


    private double determinantOfMatrix(double mat[][]){
            double ans;
            ans =     (mat[0][0] * mat[1][1])
                    - (mat[0][1] * mat[1][0]);
            return ans;
        }

        private void findSolution(double coeff[][]) {
            double d[][] = {
                    { coeff[0][0], coeff[0][1]},
                    { coeff[1][0], coeff[1][1]},
            };

            double d1[][] = {
                    { coeff[0][2], coeff[0][1]},
                    { coeff[1][2], coeff[1][1]}
            };

            double d2[][] = {
                    { coeff[0][0], coeff[0][2]},
                    { coeff[1][0], coeff[1][2]}
            };

            SD = determinantOfMatrix(d);
            D1 = determinantOfMatrix(d1);
            D2 = determinantOfMatrix(d2);
            }
}





