package ProblemsOnBinarySearch;

public class findMinInRotatedArray {
    static int minIndex(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int minIdx=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid] <=arr[n-1]){
                minIdx=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return minIdx;
    }

    public static void main(String[] args) {
        int[] arr={ 3,4,5,1,2};
        System.out.println(minIndex(arr));

    }
}
