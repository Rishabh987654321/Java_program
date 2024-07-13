package Arrays;

public class SortArrayConsistingOf0sAnd1s {

//    //sorting using another array to store the value of sorted element
//
//    static  int[] sortArr(int[] arr){
//        int count=0;
//        int[] ans=new int[arr.length];
//    //traversing through the array to find out the count of zeros
//        for (int i=0;i<arr.length;i++){
//
//            if(arr[i]==0){
//                count++;
//            }
//        }
//    //traversing the array from 0 to count and putting 0 in the place
//        for (int i=0;i<=count;i++){
//            ans[i]=0;
//        }
    //traversing the array again from count to length and putting 1 in place
//        for (int i=count;i<ans.length;i++){
//            ans[i]=1;
//        }
//        return ans;
//    }


    //sorting without using another array

//    static void sortArr(int[] arr){
//        int count=0;
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                count++;
//            }
//        }
//        for (int i=0;i<count;i++){
//            arr[i]=0;
//        }
//        for (int i=count;i<arr.length;i++){
//            arr[i]=1;
//        }
//
//    }

    //sorting array without using two for loops (using two pointers method)

    //method to swap two indices of array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void TwoPointerMethod(int[] arr) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        while (leftPointer < rightPointer) {
            if (arr[leftPointer] == 1 && arr[rightPointer] == 0) {
                swap(arr, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
            if (arr[leftPointer] == 0) {
                leftPointer++;
            }
            if (arr[rightPointer] == 1) {
                rightPointer--;
            }
        }
    }


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};

//       int[] ans= sortArr(arr);
//       printArray(ans);


//        sortArr(arr);
//        printArray(arr);

        TwoPointerMethod(arr);
        printArray(arr);


    }
}
