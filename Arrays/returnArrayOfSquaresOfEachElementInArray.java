package Arrays;

import java.util.Arrays;

//given an array which is in non-decreasing order find the square root of all the element and return in an array of non decreasing order
//the array will also contain negative element
public class returnArrayOfSquaresOfEachElementInArray {


    //using .sort method
//    static int[] returnSquares(int[] arr){
//        int j=0;
//        int[] ans=new int[arr.length];
//        for (int i=0;i<arr.length;i++){
//            ans[j]=arr[i]*arr[i];
//            j++;
//        }
//        Arrays.sort(ans);
//        return ans;
//    }


    //using two pointers method

//    static int[] sortSquares(int[] arr){
//        int leftPointer=0;
//        int rightPointer=arr.length-1;
//        int[] ans=new int[arr.length];
//        int j=0;
//
//        while(leftPointer<=rightPointer){
//            if(Math.abs(arr[leftPointer])>Math.abs(arr[rightPointer])){
//                ans[j++]=arr[leftPointer]*arr[leftPointer];
//                leftPointer++;
//
//            }else {
//                ans[j++]=arr[rightPointer]*arr[rightPointer];
//                rightPointer--;
//            }
//        }
//        return ans;
//    }
//    //reverse the array after this to get non-decreasing order of array
//    static void swapInArray(int[] arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    static void reverseArray(int[] arr){
//        int i=0;int j=arr.length-1;
//        while (i<j){
//            swapInArray(arr,i,j);
//            i++;
//            j--;
//        }
//    }


    //using two pointer method but without using reverseArrayFunction

    static int[] sortSquares(int[] arr) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        int[] ans = new int[arr.length];
        int j = arr.length - 1;//initialising j to last index so it will start filling from last

        while (leftPointer <= rightPointer) {
            if (Math.abs(arr[leftPointer]) > Math.abs(arr[rightPointer])) {
                ans[j--] = arr[leftPointer] * arr[leftPointer];//here the ans array will fill the square value of arr in non-decreasing order
                leftPointer++;

            } else {
                ans[j--] = arr[rightPointer] * arr[rightPointer];
                rightPointer--;
            }
        }
        return ans;
    }

    //method to print array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, -2, 1, 4, 5};
        int[] ans = sortSquares(arr);
        //reverseArray(ans);
        printArray(ans);
    }
}
