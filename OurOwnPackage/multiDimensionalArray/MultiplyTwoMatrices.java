package multiDimensionalArray;

import java.util.Scanner;

public class MultiplyTwoMatrices {

    static void multiplymatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible ");
            return;
        }

        int[][] ans = new int[r1][c2];//dimension of ans matrix will be row of matrix a and column of matrix b
        for (int i = 0; i < r1; i++) {//iterate through row of ans matrix
            for (int j = 0; j < c2; j++) {//iterate through column of ans matrix
                for (int k = 0; k < c1; k++) {// this will tell till where we have to multiply and add the rows and columns
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 matrices are :");
        printArray(ans);
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row of matrix one");
        int r1 = sc.nextInt();
        System.out.println("Enter the size of column of matrix 1");
        int c1 = sc.nextInt();
        System.out.println("Enter " + r1 * c1 + " elements");
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the size of row of matrix Second");
        int r2 = sc.nextInt();
        System.out.println("Enter the size of column of matrix 2");
        int c2 = sc.nextInt();
        System.out.println("Enter " + r2 * c2 + " elements");
        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 -> ");
        printArray(arr1);
        System.out.println("matrix 2 -> ");
        printArray(arr2);

        multiplymatrix(arr1, r1, c1, arr2, r2, c2);

    }
}
