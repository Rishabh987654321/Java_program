package Arrays;

class arrays {
    void maxElementInArray() {
        int[] arr = {10, 2, 3, 6, 1, 15};
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("maximum element in the array is " + max + " at index no " + index);
    }
}

public class FindingMaxValueInArray {
    public static void main(String[] args) {
        arrays obj = new arrays();
        obj.maxElementInArray();
    }
}
