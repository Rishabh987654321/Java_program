package ProblemsOnBinarySearch;
/* property of rotated sorted array -->start,mid,end either start,mid will be sorted or mid,end will be sorted or both will be sorted....it can't be that both are not sorted */
public class findTargetInRotatedArray {
    static int RecursiveSearch(int[] arr,int target,int low,int high){
        if (low > high) {
            return-1;
        }
        int mid=low+(high-low)/2;

        if (target==arr[mid]){
            return mid;
        }else if (target<arr[mid]){
            return RecursiveSearch(arr,target,low,mid-1);
        }else{
            return RecursiveSearch(arr,target,mid+1,high);
        }

    }
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
    static int pivotedBinarySearch(int[] arr,int target){
        int pivot=minIndex(arr);

        if (pivot==-1){//means array is not rotated so apply normal binary search
            return RecursiveSearch(arr,target,0,arr.length-1);
        }
        if (arr[pivot]==target){
            return pivot;
        }
        if (arr[0]<=target)
            return RecursiveSearch(arr,target,0,pivot-1);
        return RecursiveSearch(arr,target,pivot,arr.length-1);

    }



   // Approach 2
     static int FindTarget(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            } else if (arr[mid]<arr[end]) {//means mid to end is sorted
                if (target>arr[mid]&&target<=arr[end]){//checking if target lies b/w mid and end or not
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else{//if start to mid is sorted
                if (target>=arr[start]&&target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
     }
    public static void main(String[] args) {
        int[] arr={5,6,7,1,2,3,4};
        System.out.println(pivotedBinarySearch(arr,3));
        System.out.println(FindTarget(arr,3));
    }
}
