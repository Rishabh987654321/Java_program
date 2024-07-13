package Arrays;

class Array_Example {
    void demo_array() {
        int ages[] = new int[3];
        ages[0] = 10;
        ages[1] = 14;
        ages[2] = 16;
        //ages[3]=10;// index out of bound as the 4th element don't exist ....we have only allocated memory for three items
        //ages[-2];//negative indexing is invalid in java
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages.length);//to print the length of the array

    }
}


public class representationOfArrays {
    public static void main(String[] args) {

        Array_Example obj = new Array_Example();
        obj.demo_array();

        //array literal
        int[] arr = {1, 2, 3};
        //System.out.println(arr[1]);


    }


}
