package ProblemsOnSorting2.java;
//int[] arr={2,0,2,0,2,1,0,2,0}-->output=={0,0,0,0,1,2,2,2,2}
public class sortZeroOnesAndTwo {
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void Sort1(int[] arr){//sc=1 and tc=n;
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount++;
            }
            if (arr[i]==1){
                oneCount++;
            }
            if (arr[i]==2){
                twoCount++;
            }
        }
        int j=0;
        while (zeroCount>0){
            arr[j++]=0;
            zeroCount--;
        }
        while (oneCount>0){
            arr[j++]=1;
            oneCount--;
        }
        while (twoCount>0){
            arr[j++]=2;
            twoCount--;
        }
    }
    static void reversePolishAlgo(int[] arr){

        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,0,2,0,2,1,0,2,0};
       // Sort1(arr);
        reversePolishAlgo(arr);
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
}
