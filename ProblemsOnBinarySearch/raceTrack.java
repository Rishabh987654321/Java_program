package ProblemsOnBinarySearch;

public class raceTrack {
    static boolean isPossible(int[] arr,int k,int distance){
        int kidPlaced=1;
        int lastKid=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]-lastKid>=distance){
                kidPlaced++;
                lastKid=arr[i];
            }

        }
        return kidPlaced>=k;
    }
    static int optimalraceTrack(int[] arr,int k){
        if (k> arr.length){
            return -1;
        }
        int start=0;
        int end=(int)1e9;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(arr,k,mid)){//can k kids be placed at race track such that no two kids have lesser distance than mid
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,8,9};
        int k=2;
        System.out.print(optimalraceTrack(arr,k));
    }

}
