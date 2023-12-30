package multiDimensionalArray;

import java.util.Scanner;

public class PrintElementsOfMatrixInSpiralOrder {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void spiralOrder(int[][] arr, int row, int col) {
        int topRow = 0, bottomRow = row - 1, leftCol = 0, rightCol = col - 1;
        int totalElements = 0;
        while (totalElements <= row * col) {
            //first print top row -> from leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElements <= row * col; j++) {//&& statement to check at every point so that any element is not left or repeated
                System.out.print(arr[topRow][j] + " ");//topRow is fixed but j will vary
                totalElements++;
            }
            topRow++;//to go to second order of traversal in spiral

            //2) print rightCol-> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements <= row * col; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            //3) print bottomRow ->rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElements <= row * col; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            //4)print leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements <= row * col; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter " + row * col + " elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix is ->");
        printArray(arr);

        System.out.println("Spiral order of matrix is ");
        spiralOrder(arr, row, col);
    }

}
