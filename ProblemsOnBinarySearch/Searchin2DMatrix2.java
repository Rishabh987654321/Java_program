package ProblemsOnBinarySearch;

public class Searchin2DMatrix2 {
    /* You are given an m x n integer matrix  with the following two properties:
       Integers in each row are sorted in ascending from left to right.
       Integers in each column are sorted in ascending from top to bottom.
       1 4 7 11 15
       2 5 8 12 19
       3 6 9 16 22
     */
    static boolean findtarget(int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int i=0,j=m-1;//i and j combines to be the last element of the matrix from where we start our search
        while (i < n && j >= 0) {

            if (arr[i][j]==target){
                return true;
            }
            if (target<arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22}
        };
        System.out.println(findtarget(arr,13));
    }
}
