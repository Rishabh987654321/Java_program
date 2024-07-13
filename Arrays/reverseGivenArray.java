package Arrays;

public class reverseGivenArray {

    //reversing the array without changing the original array

//    static int[] reverseArray(int[] arr){
//
//        int[] ans=new int[arr.length];
//
//        for (int i=arr.length-1;i>=0;i--){
//            ans[arr.length-1-i]=arr[i];
//
//        }
//        return ans;
//    }


    //reversing array using another ,method

//    static int[] reverseArray(int[] arr){
//        int[] ans=new int[arr.length];
//
//        int j=0;
//        //traversing original array in reverse direction
//        for (int i=arr.length-1;i>=0;i--){
//                ans[j++]=arr[i];  //j is used to traversed through empty array to fill it
//
//        }
//        return ans;
//    }


    //reversing an array using two loops one start from end and other from beginning

    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reversearray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }


    //reverse an array using temporary variable
//        static void reverseArray(int[] arr) {
//            for (int i = 0; i <arr.length; i++) {
//                int temp = arr[i];
//                arr[i] = arr[arr.length - 1-i];
//                arr[arr.length - 1 ] = temp;
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//        }


    //method to print an array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //reverseArray(arr);

//        int[] ans=(reverseArray(arr));
//        for (int i:ans){
//            System.out.print(i+" ");
//        }


        reversearray(arr);
        printArray((arr));


    }
}
