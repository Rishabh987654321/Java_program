package multiDimensionalArray;

import java.util.Scanner;

public class TransposeMatrix {

    static void transposeOfMatrix(int[][] arr, int row, int col) {
        int[][] ans = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        printMatrix(ans);
    }


    //only applicable for square matrix
//    static void transposeMatrixInplace(int[][] arr,int row,int col){
//        for (int i=0;i<col;i++){
//            for (int j=i;j<row;j++){
//                int temp=arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=temp;
//            }
//        }
//        printMatrix(arr);
//    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in matrix");
        int row = sc.nextInt();
        System.out.println("Enter number of column in matrix");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter " + row * col + " elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix ->");
        printMatrix(arr);
        System.out.println("Transpose of a matrix ->");
        transposeOfMatrix(arr, row, col);
//        System.out.println("Transpose of matrix in inplace");
//        transposeMatrixInplace(arr,row,col);

    }
}
