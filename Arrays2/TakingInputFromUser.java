package Arrays2;

import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");

        //taking input of each element by user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //displaying the element
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }


    }
}
