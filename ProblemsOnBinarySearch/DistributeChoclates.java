package ProblemsOnBinarySearch;

public class DistributeChoclates {
    static boolean divisionPossible(int[] arr,int m,int maxChocAllowed){
        int numOfStudent=1;
        int choc=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>maxChocAllowed) return false;
            if (choc+arr[i]<=maxChocAllowed){
                choc+=arr[i];
            }else{
                numOfStudent++;
                choc=arr[i];
            }
        }
        return numOfStudent<=m;
    }
    static int distributeChoclates(int[] arr,int m){
        if(arr.length<m){
            return -1;
        }
        int start=1,end=(int)1e9;
        int ans=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(divisionPossible(arr,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr={5,3,1,4,2};
        int m=3;
        System.out.print(distributeChoclates(arr,m));
    }
}
