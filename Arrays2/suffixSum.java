package Arrays2;

import java.util.Scanner;

public class suffixSum {

    //method to find the suffix sum
    static int[] returnSuffixSum(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] += arr[i + 1];
        }
        return arr;
    }

    //method to print array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(returnSuffixSum(arr));

    }
}
