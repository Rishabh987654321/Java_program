package Arrays2;

public class ArrayReference {

    static void print_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        System.out.println("original array ");
        print_array(arr1);

        //copying aar1 to arr2
        //int[] arr2=arr1;//this is called shallow copy as no memory is allocated for arr2 it points to the same memory address as arr1
        int[] arr2 = arr1.clone();//this is called deep copy as arr2 is allocated memory of same size as arr1, but it has different memory address...now only the element of arr2 will get changed arr1 will remain unaffected
        System.out.println("Copied array ");
        print_array(arr2);

        //changing element of arr2
        arr2[0] = 0;
        arr2[1] = 0;
        System.out.println("printing arr2 after changing element of arr2");
        print_array(arr2);
        System.out.println("printing arr1 after changing element of arr2");
        print_array(arr1);//elements of arr1 also changed due to arr2(but why? look at the notes ....reference array in java)


    }
}
