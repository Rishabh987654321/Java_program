package Arrays;

public class FindSecondSmallestNumber {
    //method to find smallest number in an array
    static int smallestNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //method to replace all the minimum value to INTEGER.MAX_VALUE
    static int secondSmallestNumber(int[] arr) {
        int min = smallestNumber(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;//all the minimum value are replaced by INTEGER_MAX so when we iterate through the array and find smallest number it is actually the second smallest num
            }
        }
        int secondSmallest = smallestNumber(arr);
        return secondSmallest;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(secondSmallestNumber(arr));
    }
}
