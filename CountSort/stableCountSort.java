package CountSort;

public class stableCountSort {
    //method to find max element in the array
    static int findMaxElement(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void sort(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        //creating count array
        int max=findMaxElement(arr);
        int[] countArr=new int[max+1];
        for(int i=0;i<arr.length;i++){
            countArr[arr[i]]++;//will count the frequency of element and put it in frequencyarr
        }
        //make prefix sum of count  array
        for(int i=1;i<countArr.length;i++){
            countArr[i]+=countArr[i-1];
        }
        //find the index of each element in the original array and put it into ans array
        for (int i=n-1;i>=0;i--){
            int idx=countArr[arr[i]]-1;
            ans[idx]=arr[i];
            countArr[arr[i]]--;
        }
        //copy all elements from the answer array and put it into original array
        for (int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={4,3,1,5,3,1,3,5};
        sort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
 