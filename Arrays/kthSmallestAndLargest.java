package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class kthSmallestAndLargest {

    static int[] kthSmallestAndLargestElement(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans = {arr[k - 1], arr[arr.length - k]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter " + size + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the kth index");
        int k = sc.nextInt();
        int[] ans = kthSmallestAndLargestElement(arr, k);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
