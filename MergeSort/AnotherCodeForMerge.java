package MergeSort;

public class AnotherCodeForMerge {
    static void conquer(int[] arr,int start,int mid , int end){
        int[] merger=new int[end-start+1];//new array to store all the sorted element after dividing
        int idx1=start;//idx1 track the first sorted subarray
        int idx2=mid+1;//idx2 to track the second sub array
        int k=0;//to track the merger array to fill the element

        while(idx1<=mid&&idx2<=end){
            if(arr[idx1]<=arr[idx2]){
                merger[k]=arr[idx1];
                k++;
                idx1++;
            }else{
                merger[k]=arr[idx2];
                k++;
                idx2++;
            }

        }
        while (idx1<=mid){
            merger[k++]=arr[idx1++];
        }
        while (idx2<=end){
            merger[k++]=arr[idx2++];
        }
        //for copying the sorted elements in the original array
        for(int i=0,j=start;i<merger.length;i++,j++){
            arr[j]=merger[i];
        }

    }
    static void divide(int[] arr,int start,int end){
        //base case if the array has only one element or we have traversed the whole array
        if(start>=end){
            return;
        }
        int mid =start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);
    }
    public static void main(String[] args) {
        int[] arr={8,9,7,6,4,3,2,1};
        int n=arr.length;
        divide(arr,0,n-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
