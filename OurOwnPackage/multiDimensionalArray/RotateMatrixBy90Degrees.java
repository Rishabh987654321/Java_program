package multiDimensionalArray;
//rotate square matrix by 90 degrees

import java.util.Scanner;

public class RotateMatrixBy90Degrees {

    static void rotateMatrix(int[][] arr, int row, int col) {
        int[][] ans = new int[col][row];
        //first find the transpose of the matrix
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        reverseMatrixByRow(ans, row, col);
        printMatrix(ans);

    }

    //reverse the matrix after finding transpose
    static void reverseMatrixByRow(int[][] arr, int row, int col) {
        int start = 0;
        int end = col - 1;
        for (int i = 0; i < row; i++) {
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[start][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

    }


    //another method to rotate matrix inplace without using another matrix

    static void transposeMatrixInplace(int[][] arr, int row, int col) {
        for (int i = 0; i < col; i++) {
            for (int j = i; j < row; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateArray(int[][] arr, int n) {
        transposeMatrixInplace(arr, n, n);

        //reverse element  for each row in matrix
        for (int i = 0; i < n; i++) {
            reverseArray(arr[i]);
        }
        printMatrix(arr);
    }


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
//        System.out.println("Matrix after rotation 90 degrees ->");
//        rotateMatrix(arr,row,col);

        System.out.println("Matrix after rotation ");
        rotateArray(arr, row);
    }
}
