package Arrays;


class multiDimArray {
    void twoDArrayLiteral() {

        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 10}};

        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);
        System.out.println(arr1[0][2]);

        System.out.println("Length of arr1 is " + arr1.length);
        //System.out.println(arr1[0]);//this will give a garbage value as we have allocated the space, but we have not given value for it
    }

    void multiArray() {
        int[][] arr2 = new int[2][3];
        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[0][2] = 30;
        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0][2]);
        System.out.println("Length of arr2 is " + arr2.length);
    }
}

public class MultiDimensionalArray {
    public static void main(String[] args) {
        multiDimArray obj = new multiDimArray();
        obj.twoDArrayLiteral();
        obj.multiArray();
    }
}
