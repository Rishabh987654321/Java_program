package Arrays;

public class FirstValueThatRepeatsItself {

    static int FirstValueThatRepeat(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;//return -1 if no number repeat itself
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 4};
        System.out.println("First number that repeat is : " + FirstValueThatRepeat(arr));
    }
}
