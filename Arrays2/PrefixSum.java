package Arrays2;

public class PrefixSum {

    //method to return prefix array
//    static int[] prefixArray(int[] arr){
//        int[] prefArray=new int[arr.length];
//        prefArray[0]=arr[0];
//        for (int i=1;i<arr.length;i++){
//            prefArray[i]=prefArray[i-1]+arr[i];
//        }
//        return prefArray;
//    }

    //method to return prefix sum without using another array
    static int[] prefixSumArray(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
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
        int[] arr = {2, 1, 3, 4, 5};
        System.out.println("original array: ");
        printArray(arr);

        //int[] prefixarray=prefixArray(arr);

        System.out.println("Array after apllying prefix sum: ");
        printArray(prefixSumArray(arr));
    }
}
