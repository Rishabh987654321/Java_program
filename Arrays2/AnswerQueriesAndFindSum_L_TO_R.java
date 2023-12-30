package Arrays2;

import java.util.Scanner;

public class AnswerQueriesAndFindSum_L_TO_R {

    //first find the prefix array
    static int[] prefixArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    //method to print array
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];//for 1 based indexing as arr[0] will be not traversed in any case and it will be zero by default
        System.out.println("Enter " + size + " elements");
        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefixSum = prefixArray(arr);
        System.out.println("Enter number of queries ");

        int q = sc.nextInt();
        while (q-- > 0) {//while q-- is greater than zero
            System.out.println("Enter range of query");
            int L = sc.nextInt();
            int R = sc.nextInt();
            int ans = prefixSum[R] - prefixSum[L - 1];
            System.out.println("Sum of given range is " + ans);
        }
    }
}
