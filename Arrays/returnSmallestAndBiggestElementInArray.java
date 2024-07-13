package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class returnSmallestAndBiggestElementInArray {


    static int[] smallestAndBiggest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
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


        int[] ans = smallestAndBiggest(arr);
        System.out.print("Smallest element is " + ans[0] + " and largest element is " + ans[1]);


        //another method

//        int[] arr={10,5,6,8,9,3};
//        int smallest_num=Integer.MAX_VALUE;
//        int largest_num=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<smallest_num){
//                smallest_num=arr[i];
//            }
//            if (arr[i]>largest_num){
//                largest_num=arr[i];
//            }
//        }
//        System.out.println(smallest_num+" "+largest_num);
    }
}
