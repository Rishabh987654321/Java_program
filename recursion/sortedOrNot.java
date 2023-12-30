package recursion;

public class sortedOrNot {
    static boolean isSorted(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx+1]>arr[idx]){
            return isSorted(arr,idx+1);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr={19,0,3,6,8};
        System.out.println(isSorted(arr,0));
    }
}
