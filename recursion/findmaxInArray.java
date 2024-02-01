package recursion;

public class findmaxInArray {
    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int smallAns = findMax(arr, index + 1);
        return Math.max(arr[index], smallAns);
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 10, 7};
        System.out.println(findMax(arr, 0));
    }
}
