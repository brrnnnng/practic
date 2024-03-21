package lesson13;

public class Matrix implements IMatrix {
    private double[][] nums;

    public Matrix() {
        nums = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col) {
        nums = new double[row][col];
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит");
            return 0;
        }
        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("colIndex не подходит");
            return 0;
        }

        return nums[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит");
            return;
        }
        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("colIndex не подходит");
            return;
        }

        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        //a - this
        //b - other

        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("матрицы должны быть одинаковых размеров");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("матрицы должны быть одинаковых размеров");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("матрицы должны быть одинаковых размеров");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("матрицы должны быть одинаковых размеров");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("матрицы не могут быть умножаны");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                double sum = 0;
                for (int k = 0; k < getColumns(); k++) {
                    sum += getValueAt(i, k) * otherMatrix.getValueAt(k, j);
                }
                result.setValueAt(i, j, sum);
            }

        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {

        Matrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }

        return result;
    }

    @Override
    public IMatrix transpose() {

        Matrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return result;
    }

    @Override
    public IMatrix fillMatrix(double value) {

        Matrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, value);
            }
        }
        return result;
    }

    @Override
    public IMatrix determinant() {
        return null;
    }


    @Override
    public boolean isNullMatrix() {
        for (double[] row : nums) {
            for (double element : row) {
                if (element != 0) {
                    return false;
                }
            }
        }

        return true;
    }


    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j && nums[i][j] != 1) {
                    return false;
                } else if (i != j && nums[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        return nums.length == nums[0].length;
    }
    @Override
    public void printToConsole() {
        // this - та матрица которую нужно напечатать

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }

    @Override
    public double getDeterminant() {
        return 0;
    }
}
