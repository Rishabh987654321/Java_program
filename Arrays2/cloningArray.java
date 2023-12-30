package Arrays2;

import java.util.Arrays;

public class cloningArray {
    static void print_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();//this is deep copy i.e. separate memory is allocated for arr2 and exact value of arr1 is copied to arr2...here changing of elements of any array won't affect another array
        System.out.println("original array");
        print_array(arr1);
        System.out.println("Copied array");
        print_array(arr2);


        //another method for cloning or copying an array without affecting the elements
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);//we can give any length as argument
        //arr3[0]=4; this won't change the elements of arr1 it will only change the element of arr3
        System.out.println("copying arr1 to arr3 using Arrays.copyOf method ");

        print_array(arr1);

        int[] arr4 = Arrays.copyOfRange(arr1, 0, 4);//it takes three args... 1)an array 2) staring range 3)ending range
        //arr4[0]=12; this won't change the element of arr1 it will only change the element of arr4
        System.out.println("copying arr1 to arr4 using Arrays.copyOfRange method");
        print_array(arr4);

    }
}
