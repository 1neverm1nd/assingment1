public class Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }
// ряды чек правильно ли
    public void setElement(int row, int col, double value) {
        if (row >= 0 && row < rows && col >= 0 && col < columns) {
            matrix[row][col] = value;
        } else {
            System.out.println("неправильный индекс линии или ряда");
        }
    }
    // вывод и не забыть отступ
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix anotherMatrix) {
        if (this.rows == anotherMatrix.rows && this.columns == anotherMatrix.columns) {
            Matrix result = new Matrix(rows, columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result.matrix[i][j] = this.matrix[i][j] + anotherMatrix.matrix[i][j];
                }
            }
            return result;
        } else {
            System.out.println("Matrices should have the same dimensions for addition");
            return null;
        }
    }

    public Matrix multiply(double number) {
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = this.matrix[i][j] * number;
            }
        }
        return result;
    }

    public Matrix multiply(Matrix anotherMatrix) {
        if (this.columns == anotherMatrix.rows) {
            Matrix result = new Matrix(this.rows, anotherMatrix.columns);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < anotherMatrix.columns; j++) {
                    for (int k = 0; k < this.columns; k++) {
                        result.matrix[i][j] += this.matrix[i][k] * anotherMatrix.matrix[k][j];
                    }
                }
            }
            return result;
        } else {
            System.out.println("количество столбцов в первой матрице должно быть равно количеству строк во второй матрице для умножения");
            return null;
        }

    }

}
