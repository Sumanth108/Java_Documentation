package prog5;

public class DemoMatrix {
    public static void main(String[] args) {
        MatrixOperation matrixOperation = new MatrixOperation();
        int[][] first=matrixOperation.readMatrix();
        int[][] second = matrixOperation.readMatrix();
        int[][] proMatrix = MatrixOperation.mulmatrix(first,second);
        MatrixOperation.dispMatrix(proMatrix);
    }
}
