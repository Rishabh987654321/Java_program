package recursion;

public class printAllValuesOfArray {
    static void printvalues(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printvalues(arr, index + 1);

    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 3, 1, 4};
        printvalues(arr, 0);

    }
}
