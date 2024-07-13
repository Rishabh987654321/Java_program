package Arrays;

public class rotateArrayByKSteps {

//    static int[] rotateArray(int[] arr,int k){
//         int n=arr.length;
//         k=k%n;
//         int[] ans=new int[n];
//         int j=0;
//         for (int i=n-k;i<n;i++){
//             ans[j++]=arr[i];
//         }
//         for (int i=0;i<=n-k-1;i++){
//             ans[j++]=arr[i];
//         }
//         return ans;
//    }


    //rotating array without creating another answer array

    //swap the reversed array
    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //first reverse both part of the array
    static void reversearray(int[] arr, int i, int j) {

        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reversearray(arr, 0, n - k - 1);
        reversearray(arr, n - k, n - 1);
        reversearray(arr, 0, n - 1);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("original array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //int[] ans=rotateArray(arr,4);
        rotateArray(arr, 4);
        System.out.println("after rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
