package BinarySearch;

public class findLastOccurrance {
    static int findOccurrence(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int lastOccurrance=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target==arr[mid]){
                lastOccurrance=mid;
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return lastOccurrance;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,3,3,4,4,4,5,5,5,6};
        System.out.println(findOccurrence(arr,1));
    }
}
