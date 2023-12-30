package Arrays;

public class FIndSecondLargestNumber {

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int second_max(int[] arr) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }


    public static void main(String[] args) {
        int[] arr = {0, -1, 0, -1, -4, -5};
        System.out.println(second_max(arr));

    }
}
