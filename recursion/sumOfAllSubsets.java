package recursion;
/*[2,4,5]
ans={2,4,5,6,7,9,11,[] }
* */
public class sumOfAllSubsets {

    static void subsetSum(int[] arr, int n, int idx, int currSum){

        //base case
        if (idx>=n){
            System.out.println(currSum);
            return;
        }

        //we have to choices --either we add the current index to the sum or we don't add it

        //curidx+currsum
        subsetSum(arr,n,idx+1,currSum+arr[idx]);
        //currsum
        subsetSum(arr,n,idx+1,currSum);//exclude the current index
    }
    public static void main(String[] args) {
        int[] arr={2,4,5};
        int n=arr.length;
        subsetSum(arr,n,0,0);
    }
}
