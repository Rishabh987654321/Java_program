package multiDimensionalArray;
//reverse matrix by row


import java.util.Scanner;

public class reverseMatrix {
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
        printArray(arr);
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
        reverseMatrixByRow(arr1, r1, c1);
    }
}
