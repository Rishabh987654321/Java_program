package multiDimensionalArray;

import java.util.Scanner;

public class AddTwoMatrices {


    //adding two matrices
    static void addMatrices(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input -> Addition not possible");
            return;//means return nothing
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of both the matrices are -> ");
        printArray(sum);
    }

    //printing the sum matrices
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
        int[][] arr2 = new int[r1][c1];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 -> ");
        printArray(arr1);
        System.out.println("matrix 2 -> ");
        printArray(arr2);


        addMatrices(arr1, r1, c1, arr2, r2, c2);


    }
}
