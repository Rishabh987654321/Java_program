package multiDimensionalArray;

import java.util.Scanner;

//given a 2D array we have to find sum of all the elements in the given range (two cords are provided, and we have to find the sum of all element present inside the rectangle)
public class PrefixSumIn2DArrays {


    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }


    //method 1 using brute force approach
    static int findSum(int[][] arr, int l1, int r1, int l2, int r2) {// (l1,r1) is first coordinate and (l2,r2) is the second coordinate
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    //method 2 pre-calculating the horizontal sum for each row in the matrix
    //finding prefix sum for each row in the matrix
    static void findPrefixSumMatrix(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        //traverse horizontally to calculate row wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
    }

    static int findSum2(int[][] arr, int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixSumMatrix(arr);
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += arr[i][r2] - arr[i][r1 - 1];
            } else {
                sum += arr[i][r2];
            }

        }
        return sum;
    }


    //method 3

    //finding prefix sum row wise first and then column wise  in the matrix
    static void findPrefixSumColumnWise(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];//row wise prefix sum
            }
        }
        //finding column wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    static int findSum3(int[][] arr, int l1, int r1, int l2, int r2) {
        int sum = 0, ans = 0, upperMatrix = 0, leftMatrix = 0, leftUpperMatrix = 0;
        findPrefixSumColumnWise(arr);

        sum = arr[l2][r2];
        if (r1 >= 1) {
            leftMatrix = arr[l2][r1 - 1];
        }
        if (l1 >= 1) {
            upperMatrix = arr[l1 - 1][r2];
        }
        if (l1 >= 1 && r1 >= 1) {
            leftUpperMatrix = arr[l1 - 1][r1 - 1];
        }
        ans = sum - upperMatrix - leftMatrix + leftUpperMatrix;

        return ans;
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

        System.out.println("Enter the rectangle boundaries to find sum of element inside it");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Original matrix is ->");
        printArray(arr);

        System.out.println("Sum of the matrix in the given coordinate are " + findSum(arr, l1, r1, l2, r2));
        System.out.println("Sum of the matrix in the given coordinate are " + findSum2(arr, l1, r1, l2, r2));
        System.out.println("Sum of the matrix in the given coordinates are " + findSum3(arr, l1, r1, l2, r2));
    }
}
