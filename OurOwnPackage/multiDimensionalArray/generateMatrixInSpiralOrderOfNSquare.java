package multiDimensionalArray;

import java.util.Scanner;


public class generateMatrixInSpiralOrderOfNSquare {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }


    static int[][] generateSpiralMatrix(int row) {
        int[][] arr = new int[row][row];

        int topRow = 0, bottomRow = row - 1, leftrow = 0, rightrow = row - 1;
        int currentElement = 1;
        while (currentElement <= row * row) {

            for (int j = leftrow; j <= rightrow && currentElement <= row * row; j++) {//&& statement to check at every point so that any element is not left or repeated
                arr[topRow][j] = currentElement++;

            }
            topRow++;

            //2) print rightrow-> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && currentElement <= row * row; i++) {
                arr[i][rightrow] = currentElement++;

            }
            rightrow--;
            //3) print bottomRow ->rightrow to leftrow
            for (int j = rightrow; j >= leftrow && currentElement <= row * row; j--) {
                arr[bottomRow][j] = currentElement++;

            }
            bottomRow--;
            //4)print leftrow -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && currentElement <= row * row; i--) {
                arr[i][leftrow] = currentElement++;

            }
            leftrow++;
        }
        return arr;
    }

    public static void main(String[] args) {
        //given n rows of matrix we have to generate a matrix in spiral order such that the elements are from 1 to n^2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int row = sc.nextInt();
        int[][] arr = generateSpiralMatrix(row);
        printArray(arr);


    }
}
