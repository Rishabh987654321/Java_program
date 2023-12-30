package multiDimensionalArray;

import java.util.Scanner;

public class pascalTriangle {


    //helper method to print array
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] pascalArray(int row) {
        int[][] ans = new int[row][];//jagged array where column is not predefined
        for (int i = 0; i < row; i++) {
            //ith row has i+1 column
            //dynamically allocating column size according to row in case of pascal triangle
            ans[i] = new int[i + 1];
            //1st and last element of each row is 1
            ans[i][0] = ans[i][i] = 1;

            //now filling the elements that is in between first and last element in each row
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");//only rows are mandatory columns are not for jagged array
        int row = sc.nextInt();
        int[][] ans = pascalArray(row);
        System.out.println("Printing pascal triangle till " + row + " rows");
        printArray(ans);
    }
}
