package recursion;
/* There are N stones numbered 0,1,2...N-1. for each i(0<=i<N) the height of stone i is Hi.There is a frog who is initially on stone 0.
he will repeat the following action some number of times to reach stone N-1:
if the frog is currently in stone i,jump to stone i+1 or stone i+2
here , a cost of |Hi-Hj| is incurred where j is the stone to land on.
find the minimum possible total cost incurred before the frog reaches Stone N.
*/
public class FrogProblem {
    static int minimalCost(int[] arr,int n,int idx){
        //base case
        if(idx==n-1){
            return 0;
        }
        int opt1=Math.abs(arr[idx]-arr[idx+1])+minimalCost(arr,n,idx+1);
        //second base case if we are standing on second last index then we have only one option to jump idx+1 because idx+2 is not available
        if(idx==n-2){
            return opt1;
        }
        int opt2=Math.abs(arr[idx]-arr[idx+2])+minimalCost(arr,n,idx+2) ;
        return Math.min(opt1,opt2);
    }
    public static void main(String[] args) {
        int[] h={10,30,40,20};
        System.out.println(minimalCost(h,h.length,0));
    }
}
