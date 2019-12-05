package prog5;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class MatrixOperation {

    int[][] readMatrix(){
        int row=0,col=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dim of the matrix");;
        row = sc.nextInt();
        col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("enter the matrix");
        for (int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                matrix[i][j]=sc.nextInt();
        return matrix;
    }

    static int[][] mulmatrix(int[][] m1,int[][] m2){
        int m1Col = m1[0].length;
        int m2Row = m2.length;

        if(m1Col!=m2Row){
            System.out.println("Cant perform operation");
            exit(0);
        }

        int resRow = m1.length;
        int reCol = m2[0].length;
        int[][] proMatrix = new int[resRow][reCol];

        for (int i=0;i<resRow;i++){
            for (int j=0;j<reCol;j++){
                proMatrix[i][j]=0;
                for(int k = 0;k<m1Col;k++)
                    proMatrix[i][j]+=m1[i][k]*m2[k][j];
            }
        }
        return proMatrix;

    }

    static void dispMatrix(int[][] matrix){
        for(int[] x:matrix) {
            for (int y : x)
                System.out.print(y + "\t");
            System.out.println();
        }
    }
}
