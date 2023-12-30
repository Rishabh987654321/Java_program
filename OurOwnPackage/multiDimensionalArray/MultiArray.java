package multiDimensionalArray;

import java.util.Scanner;

public class MultiArray {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        //int[][] arr=new int[2][3];
        int[][] arr1 =
                {
                        {1, 2, 3},
                        {2, 3},
                        {4, 5, 6}
                };

        Scanner sc = new Scanner(System.in);
        //taking input of sizes of array
        System.out.println("Enter the size of row");
        int row = sc.nextInt();
        System.out.println("Enter the size of column");
        int column = sc.nextInt();
        //creating an 2d array
        int[][] arr = new int[row][column];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        //printing the elements of the array
        printArray(arr);


    }
}
