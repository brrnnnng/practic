package lesson13;

public class Main {
    public static void main(String[] args) {
        double [][] numsForA = {{1,2,3,4},
                                {5,6,7,8},
                                {9,1,2,3}};
        Matrix a = new Matrix(numsForA);

        double [][] numsForB = {{9,8,7,6},
                                {5,4,3,2},
                                {1,9,8,7}};
        Matrix b = new Matrix(numsForB);

        double [][] numsForC = {{1,2,3},
                                {4,5,6},
                                {7,8,9}};
        Matrix c = new Matrix(numsForC);

        double [][] numsForD = {{9,8,7},
                                {6,5,4},
                                {3,2,1}};
        Matrix d = new Matrix(numsForD);



        System.out.println(a.getRows()); // getRows

        System.out.println(a.getColumns()); // getColumns

        System.out.println(a.getValueAt(0,0)); // getValueAt

        a.setValueAt(0,0,2);
        System.out.println(a.getValueAt(0,0)); // setValueAt

        IMatrix resultAdd = a.add(b);
        resultAdd.printToConsole(); // Add
        System.out.println("-------");

        IMatrix resultSub = a.sub(b);
        resultSub.printToConsole(); // Sub
        System.out.println("-------");

        IMatrix resultMul = c.mul(d);
        resultMul.printToConsole();
        System.out.println("-------"); // Mul

        IMatrix resulrMulV = a.mul(2);
        resulrMulV.printToConsole();
        System.out.println("-------"); // MulValue

        IMatrix resultTrans = c.transpose();
        resultTrans.printToConsole();
        System.out.println("-------"); // Trans

        IMatrix resultFill = c.fillMatrix(2);
        resultFill.printToConsole();
        System.out.println("-------"); // Fill

//        IMatrix resultDet = c.determinant();
//        resultDet.printToConsole();

        Matrix matrix = new Matrix(new double[][] {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        });

        boolean isNullMatrix = matrix.isNullMatrix();
        System.out.println("Матрица нулевая: " + isNullMatrix);


        Matrix matrixA = new Matrix(new double[][] {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        });

        boolean isIdentityMatrix = matrixA.isIdentityMatrix();
        System.out.println("Матрица единичная: " + isIdentityMatrix);


        Matrix matrixB = new Matrix(new double[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });

        boolean isSquareMatrix = matrixB.isSquareMatrix();
        System.out.println("Матрица квадратная: " + isSquareMatrix);

    }
}








