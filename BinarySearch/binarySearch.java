package BinarySearch;

public class binarySearch {
    static int search(int[] arr,int target){
        int n =arr.length;
        int low=0;
        int high=n-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target){
                return mid;
            } else if (target<arr[mid]) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int targetidx=search(arr,1);
        System.out.println(targetidx);
    }
}
