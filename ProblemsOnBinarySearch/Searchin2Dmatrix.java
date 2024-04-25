package ProblemsOnBinarySearch;

public class Searchin2Dmatrix {
    /* You are given an m x n integer matrix with the following two properties:
       Each row is sorted in non-decreasing order.
       The first integer of each row is greater than the last integer of the previous row.
       1  3  5  7
       10 11 16 20
       23 30 34 60
       return true if target is found
     */
    static boolean findTarget(int[][] matrix,int target){
        int n=matrix.length, m=matrix[0].length;
        int start=0;
        int end= n*m-1;
        while(start<=end){
            int mid=start+(end-start);
            int midElement=matrix[mid/m][mid%m];//trick to find middle element in 2D matrix
            if(midElement==target){
                return true;
            }
            if (target<midElement){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix= new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(findTarget(matrix,50));
    }
}
