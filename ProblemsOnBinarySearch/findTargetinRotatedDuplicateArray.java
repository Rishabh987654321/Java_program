package ProblemsOnBinarySearch;

public class findTargetinRotatedDuplicateArray {
    static int FindTarget(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            } else if (arr[start]==arr[mid]&&arr[end]==arr[mid]) {
                start++;
                end--;
            } else if (arr[mid]<=arr[end]) {//means mid to end is sorted
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
        int[] arr={1,1,1,1,2,3,1,1};
        System.out.println(FindTarget(arr,2));

    }
}
