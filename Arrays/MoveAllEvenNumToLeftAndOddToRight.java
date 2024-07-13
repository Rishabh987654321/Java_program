package Arrays;

public class MoveAllEvenNumToLeftAndOddToRight {


    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortEvenOdd(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 != 0) {
                j--;
            }
        }
    }


    //method to print an array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 1, 3, 6, 8, 1};
        System.out.println("original array");
        printArray(arr);
        System.out.println("Array after printing all even numbers top left and odd numbers to right");
        sortEvenOdd(arr);
        printArray(arr);
    }
}
