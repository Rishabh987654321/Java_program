package ProblemsOnBinarySearch;
public class peakIndexInAmountainArray {
    static int findPeak(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((mid==0|| arr[mid]>arr[mid-1])&&(mid==n-1||arr[mid]>arr[mid+1])){
                return mid;
            }
            if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={21,32,43,54,15,5,4,3};
        System.out.println(findPeak(arr));
    }
}
