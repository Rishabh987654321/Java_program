package Arrays;

class ArrayTraversal {
    void printElementOfArray() {
        int[] arr1 = {1, 2, 3, 4, 5};//1D array

        //traversing 1d array using for loop
        System.out.println("Printing elements of 1D array using for loop");
        for (int i = 0; i < arr1.length; i++) {//traversing through each element of array
            System.out.println(arr1[i]);//printing the elements
        }
        System.out.println();


        //traversing 1d array using for each loop
        System.out.println("Printing elements using for each loop for 1d array");
        for (int elements : arr1) {
            System.out.println(elements);
        }


        int[][] arr2 = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};//2D array

        //traversing through each element of 2D array using for loop
        System.out.println("Printing element of 2D array using for loop");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[1].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }


        //traversing through each element of 2d array using for each loop
        System.out.println("Printing element of 2D array using for each loop");
        for (int[] row : arr2) {//first traversing through the rows of 2d array
            for (int element : row) {//after that traversing through the element of each row
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

public class TraversingThroughArray {
    public static void main(String[] args) {
        ArrayTraversal obj = new ArrayTraversal();
        obj.printElementOfArray();

    }
}
