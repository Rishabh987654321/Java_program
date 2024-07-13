package Arrays;

class Array {
    void array_Sum() {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

public class SumOfAllElementInArray {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.array_Sum();
    }
}
