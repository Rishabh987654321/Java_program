package Arrays;

//find the index of target if not found return -1
class array_demo {
    void find_num() {
        int[] arr = {1, 2, 3, 4, 5, 2};
        int target = 2;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;//if 2 is present more than once it will break the loop at the first occurrence of 2
            }
        }

        if (ans == -1) {
            System.out.println("Index not found");
        } else {
            System.out.println(target + " found at index " + ans);
        }
    }
}

public class SearchGivenNumberInArray {
    public static void main(String[] args) {
        array_demo obj = new array_demo();
        obj.find_num();
    }
}
