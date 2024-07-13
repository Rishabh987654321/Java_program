package Arrays;

import java.util.Scanner;
import java.util.Scanner;

public class ValuesStrictlyGreaterThanTarget {

    static int numberOfElementGreaterThanX(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                count++;
            }
        }
        return count;
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
        System.out.println("enter the target element ");
        int target = sc.nextInt();
        System.out.println("Number of element greater than " + target + " is " + numberOfElementGreaterThanX(arr, target));
    }
}
