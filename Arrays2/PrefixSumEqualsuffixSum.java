package Arrays2;

import java.util.Scanner;

//to check that at any point in the array prefix sum equals to suffix sum or not
public class PrefixSumEqualsuffixSum {

    static int totalSum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum = totalSum(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        int[] arr = {5, 3, 2, 6, 3, 1};

        System.out.println(equalSumPartition(arr));


    }
}
