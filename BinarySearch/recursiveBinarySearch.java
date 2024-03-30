package BinarySearch;

public class recursiveBinarySearch {
    static int RecursiveSearch(int[] arr,int target,int low,int high){
        if (low > high) {
            return-1;
        }
        int mid=low+(high-1)/2;
        if (target==arr[mid]){
            return mid;
        }else if (target<arr[mid]){
            return RecursiveSearch(arr,target,low,mid-1);
        }else{
           return RecursiveSearch(arr,target,mid+1,high);
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int targetidx=RecursiveSearch(arr,6,0,n-1);
        System.out.println(targetidx);
    }
}
